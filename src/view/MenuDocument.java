package view;


import manager.BookManager;
import manager.MagazineManager;
import manager.NewsManager;
import model.Book;
import model.Magazine;
import model.News;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuDocument {
        private BookManager bookManager = new BookManager();
        private MagazineManager magazineManager = new MagazineManager();
        private NewsManager newsManager = new NewsManager();
        private Scanner inputNumber = new Scanner(System.in);
        private Scanner inputString = new Scanner(System.in);

        public void selectMenu() {
            int choice;
            do {
                System.out.println("============ Menu Tài Liệu ============");
                System.out.println("1. Thêm tài liệu");
                System.out.println("2. Sửa thông tin tài liệu");
                System.out.println("3. Xoá thông tin tài liệu");
                System.out.println("4. Hiển thị tất cả tài liệu");
                System.out.println("5. Tìm kiếm theo loại tài liệu");
                System.out.println("0. Thoát Menu tài liệu");
                System.out.print("Chọn phương thức thực hiện: ");
                choice = inputNumber.nextInt();
                switch (choice) {
                    case 1:
                        showMenuAdd();
                        break;
                    case 2:
                        showMenuEdit();
                        break;
                    case 3:
                        showMenuRemove();
                        break;
                    case 4:
                        showMenuShowAll();
                        break;
                    case 5:
                        showMenuFind();
                        break;
                    case 0:
                        System.out.println("Thoát Menu tài liệu!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                        break;
                }
            } while (choice !=0);
        }
        private void showMenuAdd() {
            int choice;
            do {
                System.out.println("======== Menu Thêm Mới ========");
                System.out.println("1. Thêm mới sách");
                System.out.println("2. Thêm mới báo");
                System.out.println("3. Thêm mới tạp chí");
                System.out.println("0. Quay lại trang quản lý");
                System.out.print("Nhập lựa chọn: ");
                choice = inputNumber.nextInt();
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        addNews();
                        break;
                    case 3:
                        addMagazine();
                        break;
                    case 0:
                        System.out.println("Quay lại trang quản lý!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                        break;
                }
            } while (choice != 0);
        }
        private void addBook(){
            System.out.println("===== Thêm mới sách =====");
            System.out.print("Nhập tên nhà xuất bản: ");
            String publisherName = inputString.nextLine();
            System.out.print("Nhập số trang: ");
            int releaseNumber = inputNumber.nextInt();
            Book book = new Book(publisherName,releaseNumber);
            bookManager.add(book);
            System.out.println("Thêm sách thành công!");
        }

        private void addNews() {
            System.out.println("===== Thêm mới báo =====");
            System.out.print("Nhập tên nhà xuất bản: ");
            String publisherName = inputString.nextLine();
            System.out.print("Nhập số bản phát hành: ");
            int releaseNumber = inputNumber.nextInt();
            System.out.print("Nhập ngày xuất bản (dd/MM/yyyy): ");
            String dateStr = inputString.nextLine();
            Date releaseDate = null;
            News news = new News(publisherName, releaseNumber, releaseDate);
            newsManager.add(news);
            System.out.println("Thêm báo thành công!");
        }
        private void addMagazine() {
            System.out.println("===== Thêm mới tạp chí =====");
            System.out.print("Nhập tên nhà xuất bản: ");
            String publisherName = inputString.nextLine();
            System.out.print("Nhập số phát hành: ");
            int issueNumber = inputNumber.nextInt();
            System.out.print("Nhập tháng phát hành: ");
            int releaseMonth = inputNumber.nextInt();
            System.out.print("Nhập số bản phát hành: ");
            int releaseNumber = inputNumber.nextInt();

            Magazine magazine = new Magazine(publisherName, releaseNumber, issueNumber, releaseMonth);
            magazineManager.add(magazine);
            System.out.println("Thêm tạp chí thành công!");
        }
    private void showMenuRemove() {
        int choice;
        do {
            System.out.println("======== Menu Xoá ========");
            System.out.println("1. Xoá sách");
            System.out.println("2. Xoá báo");
            System.out.println("3. Xoá tạp chí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuRemoveBook();
                    break;
                case 2:
                    showMenuRemoveNews();
                    break;
                case 3:
                    showMenuRemoveMagazine();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }
    private void showMenuRemoveBook() {
        System.out.print("Nhập ID sách muốn xoá: ");
        int id = inputNumber.nextInt();
        bookManager.remove(id);
        System.out.println("Xoá sách thành công!");
    }

    private void showMenuRemoveNews() {
        System.out.print("Nhập ID báo muốn xoá: ");
        int id = inputNumber.nextInt();
        newsManager.remove(id);
        System.out.println("Xoá báo thành công!");
    }

    private void showMenuRemoveMagazine() {
        System.out.print("Nhập ID tạp chí muốn xoá: ");
        int id = inputNumber.nextInt();
        magazineManager.remove(id);
        System.out.println("Xoá tạp chí thành công!");
    }
    private void showMenuShowAll() {
        int choice;
        do {
            System.out.println("======== Menu Hiển thị Tất Cả ========");
            System.out.println("1. Hiển thị tất cả sách");
            System.out.println("2. Hiển thị tất cả báo");
            System.out.println("3. Hiển thị tất cả tạp chí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showAllBooks();
                    break;
                case 2:
                    showAllNews();
                    break;
                case 3:
                    showAllMagazines();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    private void showAllBooks() {
        ArrayList<Book> books = bookManager.getAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private void showAllNews() {
        ArrayList<News> newsList = newsManager.getAll();
        for (News news : newsList) {
            System.out.println(news);
        }
    }

    private void showAllMagazines() {
        ArrayList<Magazine> magazines = magazineManager.getAll();
        for (Magazine magazine : magazines) {
            System.out.println(magazine);
        }
    }

    private void showMenuEdit() {
        int choice;
        do {
            System.out.println("======== Menu Sửa ========");
            System.out.println("1. Sửa sách");
            System.out.println("2. Sửa báo");
            System.out.println("3. Sửa tạp chí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuEditBook();
                    break;
                case 2:
                    showMenuEditNews();
                    break;
                case 3:
                    showMenuEditMagazine();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    private void showMenuEditBook() {
        System.out.print("Nhập ID sách muốn sửa: ");
        int id = inputNumber.nextInt();
        Book book = bookManager.findById(id);
        if (book != null) {
            System.out.println("Nhập tên nhà xuất bản mới (hiện tại: " + book.getPublisherName() + "): ");
            String publisherName = inputString.nextLine();
            System.out.println("Nhập số bản phát hành mới (hiện tại: " + book.getReleaseNumber() + "): ");
            int releaseNumber = inputNumber.nextInt();
            inputNumber.nextLine(); // Đọc ký tự newline còn lại
            System.out.println("Nhập tên tác giả mới (hiện tại: " + book.getAuthor() + "): ");
            String author = inputString.nextLine();
            System.out.println("Nhập số trang mới (hiện tại: " + book.getNumberOfPages() + "): ");
            int numberOfPages = inputNumber.nextInt();
            book.setPublisherName(publisherName);
            book.setReleaseNumber(releaseNumber);
            book.setAuthor(author);
            book.setNumberOfPages(numberOfPages);
            bookManager.update(book,id);
            System.out.println("Sửa sách thành công!");
        } else {
            System.out.println("Sách không tồn tại.");
        }
    }

    private void showMenuEditNews() {
        System.out.print("Nhập ID báo muốn sửa: ");
        int id = inputNumber.nextInt();
        News news = newsManager.findById(id);
        if (news != null) {
            System.out.println("Nhập tên nhà xuất bản mới (hiện tại: " + news.getPublisherName() + "): ");
            String publisherName = inputString.nextLine();
            System.out.println("Nhập số bản phát hành mới (hiện tại: " + news.getReleaseNumber() + "): ");
            int releaseNumber = inputNumber.nextInt();
            String releaseDateStr = inputString.nextLine();
            Date releaseDate;
            news.setPublisherName(publisherName);
            news.setReleaseNumber(releaseNumber);
            newsManager.update(news,id);
            System.out.println("Sửa báo thành công!");
        } else {
            System.out.println("Báo không tồn tại.");
        }
    }

    private void showMenuEditMagazine() {
        System.out.print("Nhập ID tạp chí muốn sửa: ");
        int id = inputNumber.nextInt();
        Magazine magazine = magazineManager.findById(id);
        if (magazine != null) {
            System.out.println("Nhập tên nhà xuất bản mới (hiện tại: " + magazine.getPublisherName() + "): ");
            String publisherName = inputString.nextLine();
            System.out.println("Nhập số bản phát hành mới (hiện tại: " + magazine.getReleaseNumber() + "): ");
            int releaseNumber = inputNumber.nextInt();
            System.out.println("Nhập số phát hành mới (hiện tại: " + magazine.getIssueNumber() + "): ");
            int issueNumber = inputNumber.nextInt();
            System.out.println("Nhập tháng phát hành mới (hiện tại: " + magazine.getReleaseMonth() + "): ");
            int releaseMonth = inputNumber.nextInt();
            magazine.setPublisherName(publisherName);
            magazine.setReleaseNumber(releaseNumber);
            magazine.setIssueNumber(issueNumber);
            magazine.setReleaseMonth(releaseMonth);
            magazineManager.update(magazine,id);
            System.out.println("Sửa tạp chí thành công!");
        } else {
            System.out.println("Tạp chí không tồn tại.");
        }
    }

    private void showMenuFind() {
        int choice;
        do {
            System.out.println("======== Menu Tìm kiếm ========");
            System.out.println("1. Tìm kiếm sách");
            System.out.println("2. Tìm kiếm báo");
            System.out.println("3. Tìm kiếm tạp chí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    findBook();
                    break;
                case 2:
                    findNews();
                    break;
                case 3:
                    findMagazine();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    private void findBook() {
        System.out.print("Nhập ID sách muốn tìm: ");
        int id = inputNumber.nextInt();
        Book book = bookManager.findById(id);
        if (book != null) {
            System.out.println("Sách tìm thấy: " + book);
        } else {
            System.out.println("Sách không tồn tại.");
        }
    }

    private void findNews() {
        System.out.print("Nhập ID báo muốn tìm: ");
        int id = inputNumber.nextInt();
        News news = newsManager.findById(id);
        if (news != null) {
            System.out.println("Báo tìm thấy: " + news);
        } else {
            System.out.println("Báo không tồn tại.");
        }
    }

    private void findMagazine() {
        System.out.print("Nhập ID tạp chí muốn tìm: ");
        int id = inputNumber.nextInt();
        Magazine magazine = magazineManager.findById(id);
        if (magazine != null) {
            System.out.println("Tạp chí tìm thấy: " + magazine);
        } else {
            System.out.println("Tạp chí không tồn tại.");
        }
    }
}

