package org.example;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("- Người dùng [" + name + "] nhận được thông báo: " + message);
    }
}