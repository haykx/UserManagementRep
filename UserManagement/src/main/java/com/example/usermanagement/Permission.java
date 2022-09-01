package com.example.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "permission")
@Table(name = "permission")
public class Permission{
    @Id
    @Column(name = "uuid")
    private UUID id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "created")
    @NotNull
    private final LocalDateTime created;
    @Column(name = "updated")
    private LocalDateTime updated;
    @Column(name = "deleted")
    private LocalDateTime deleted;

    public Permission(String name) {
        this.name = name;
        this.created = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.updated = LocalDateTime.now();
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }
    public void deletePermission(){
        if (this.deleted == null){
            this.updated = LocalDateTime.now();
            this.deleted = LocalDateTime.now();
        }
    }
}
