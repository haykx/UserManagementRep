package com.example.usermanagement;

import java.util.UUID;

public class Permission extends Trackable{
    private UUID id;
    private String name;

    public Permission(String name) {
        this.name = name;
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
}
