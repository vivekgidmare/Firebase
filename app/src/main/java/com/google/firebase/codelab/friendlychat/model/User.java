package com.google.firebase.codelab.friendlychat.model;

/**
 * Created by vivek on 29/06/16.
 */
public class User {
    private String username;
    private String email;

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getName() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
