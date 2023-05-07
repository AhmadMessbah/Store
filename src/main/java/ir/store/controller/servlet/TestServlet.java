package ir.store.controller.servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/testing")
public class TestServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getSession().setAttribute("jjj",AttachmentController.findAll().toString());
//        req.getRequestDispatcher("/index.jsp").forward(req,resp);
//    }
}
