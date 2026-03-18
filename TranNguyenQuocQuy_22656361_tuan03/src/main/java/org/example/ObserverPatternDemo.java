package org.example;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Khởi tạo hệ thống thư viện
        LibrarySystem library = new LibrarySystem();

        // Khởi tạo các đối tượng quan tâm (người dùng, nhân viên)
        User user1 = new User("Nguyễn Văn A");
        User user2 = new User("Trần Thị B");
        Librarian staff1 = new Librarian("NV_001");

        // Đăng ký nhận thông báo
        library.registerObserver(user1);
        library.registerObserver(user2);
        library.registerObserver(staff1);

        // Hệ thống nhập sách mới -> Tất cả những người đã đăng ký sẽ nhận thông báo
        library.addNewBook("Clean Code - Robert C. Martin");

        // Một người dùng hủy đăng ký
        library.removeObserver(user2);
        System.out.println("\n(Trần Thị B vừa hủy đăng ký theo dõi)");

        // Hệ thống nhập sách khác -> Chỉ những ai còn đăng ký mới nhận được thông báo
        library.addNewBook("Design Patterns - Gang of Four");
    }
}
