package org.example;

public class Librarian implements Observer {
    private String staffId;

    public Librarian(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public void update(String message) {
        System.out.println("- Nhân viên [" + staffId + "] nhận được thông báo hệ thống: " + message);
    }
}