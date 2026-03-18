package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem implements Subject {
    private List<Observer> observers;

    public LibrarySystem() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Hành động thêm sách mới sẽ kích hoạt việc thông báo
    public void addNewBook(String bookName) {
        System.out.println("\n[Hệ thống Thư viện] Vừa nhập kho sách mới: " + bookName);
        String notificationMessage = "Sách mới có sẵn: " + bookName + ". Hãy đến mượn ngay!";
        notifyObservers(notificationMessage);
    }
}
