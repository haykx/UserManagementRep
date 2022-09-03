package com.example.usermanagement.entities;

import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

@Entity(name = "user")
@Table(name = "user")
@JsonbPropertyOrder({"uuid", "firstName", "lastName", "age", "username", "password", "roles", "created", "updated", "deleted"})
public class User{
    @Id
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "firstName")
    @Size(max = 50)
    @NotNull
    private String firstName;
    @Column(name = "lastName")
    @Size(max = 50)
    @NotNull
    private String lastName;
    @Column(name = "age")
    @Size(max = 50)
    @NotNull
    private int age;
    @Column(name = "username")
    @Size(min = 5, max = 50)
    @NotNull
    private String username;
    @Column(name = "password")
    @Size(min = 8,max = 50)
    @NotNull
    private String password;
    @Column(name = "roles")
    @Size(max = 50)
    private Set<Role> roles;
    @Column(name = "created")
    @NotNull
    private final LocalDateTime created;
    @Column(name = "updated")
    private LocalDateTime updated;
    @Column(name = "deleted")
    private LocalDateTime deleted;

    public User(String firstName, String lastName, int age, String username, String password, Set<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
    }

    public User(String firstName, String lastName, int age, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.updated = LocalDateTime.now();
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

    public void setAge(int age) {
        this.updated = LocalDateTime.now();
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.updated = LocalDateTime.now();
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.updated = LocalDateTime.now();
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
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
    public void setRoles(Set<Role> roles) {
        this.updated = LocalDateTime.now();
        this.roles = roles;
    }

    public void addRoles(Role role){
        this.updated = LocalDateTime.now();
        this.roles.add(role);
    }

    public void addRoles(Collection<Role> roles){
        this.updated = LocalDateTime.now();
        this.roles.addAll(roles);
    }

    public void removeRoles(Role role){
        this.updated = LocalDateTime.now();
        this.roles.remove(role);
    }

    public void removeRoles(Collection<Role> roles){
        this.updated = LocalDateTime.now();
        this.roles.removeAll(roles);
    }

    public void deleteUser(){
        if (this.deleted == null){
            this.updated = LocalDateTime.now();
            this.deleted = LocalDateTime.now();
        }
    }
}