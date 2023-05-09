package ir.store.controller.socket;

import ir.store.controller.session.SessionManager;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;

@ServerEndpoint(value = "/websocketendpoint", configurator = GetHttpSessionConfigurator.class)
public class WsServer {

    public WsServer() {
        System.out.println("Socket request");
    }

    @OnOpen
    public void open(Session session, EndpointConfig config) {
        HttpSession httpSession = (HttpSession) session.getUserProperties()
                .get(HttpSession.class.getName());
        SessionManager.addWebSocketSession(httpSession, session);
        System.out.println("WEBSOCKET : " + httpSession.getId());
    }

    @OnMessage
    public String onMessage(String message) {
//        wsSession.getBasicRemote().sendText(msg);
        System.out.println("Message from the client: " + message);
        String echoMsg = "Echo from the server : " + message;
        return echoMsg;
    }

    public static void send(HttpSession httpSession, String msg) throws IOException {
        SessionManager.getWebSocketSession(httpSession).getBasicRemote().sendText(msg);
    }


    public static void broadcast(String message) throws IOException {
        for (Session webSocketSession : SessionManager.getWebSocketSessions()) {
            webSocketSession.getBasicRemote().sendText(message);
        }
    }

//    @OnMessage
//    public void echo(String msg) throws IOException {
//        wsSession.getBasicRemote().sendText(msg);
//    }
}
