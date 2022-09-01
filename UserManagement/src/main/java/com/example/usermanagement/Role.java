package com.example.usermanagement;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
@Entity(name = "role")
@Table(name = "role")
public class Role{
    private UUID id;
    private String name;
    private Set<Permission> permissions;
    private final LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime deleted;

    public Role(String name, Set<Permission> permissions) {
        this.name = name;
        this.permissions = permissions;
        this.created = LocalDateTime.now();
    }
    public Role(String name, Permission permissions) {
        this.name = name;
        this.permissions = Set.of(permissions);
        this.created = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
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
    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public void addPermissions(Permission permission){
        this.permissions.add(permission);
    }

    public void addPermissions(Collection<Permission> permissions){
        this.permissions.addAll(permissions);
    }

    public void removePermissions(Permission permission){
        this.permissions.remove(permission);
    }
    public void removePermissions(Collection<Permission> permissions){
        this.permissions.removeAll(permissions);
    }
    public void deleteRole(){
        if (this.deleted == null){
            this.updated = LocalDateTime.now();
            this.deleted = LocalDateTime.now();
        }
    }
}
