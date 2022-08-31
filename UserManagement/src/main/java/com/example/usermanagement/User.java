package com.example.usermanagement;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class User extends Trackable{
    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private String username;
    private String password;
    private Set<Role> roles;

    public User(String firstName, String lastName, int age, String username, String password, Set<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public User(String firstName, String lastName, int age, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRoles(Role role){
        this.roles.add(role);
    }

    public void addRoles(Collection<Role> roles){
        this.roles.addAll(roles);
    }

    public void removeRoles(Role role){
        this.roles.remove(role);
    }

    public void removeRoles(Collection<Role> roles){
        this.roles.removeAll(roles);
    }
}
