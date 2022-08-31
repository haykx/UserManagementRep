package com.example.usermanagement;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;
public class Role extends Trackable{
    private UUID id;
    private String name;
    private Set<Permission> permissions;

    public Role(String name, Set<Permission> permissions) {
        this.name = name;
        this.permissions = permissions;
    }
    public Role(String name, Permission permissions) {
        this.name = name;
        this.permissions = Set.of(permissions);
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
}
