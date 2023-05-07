package ir.store.model.entity;

import com.google.gson.Gson;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import lombok.*;

@Data


@MappedSuperclass
public class BaseEntity {
    @Version
    private long versionId;

    private boolean deleted;

    @Transient
    @Setter(AccessLevel.NONE)
    private Class aClass = getClass();

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
