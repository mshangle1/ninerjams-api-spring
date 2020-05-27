package com.ninerjams.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String username;
    public String password;

    public User(){}

    public User(String id, String firstName, String lastName, String email, String username, String password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString(){
        return String.format("User{id=%s, firstName=%s, lastName=%s, email=%s, username=%s, password=%s", id, firstName, lastName, email, username, password);
    }
}
