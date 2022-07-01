package homework.books;

import homework.books.command.Commands;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.students.model.Lesson;
import homework.students.model.Student;

import java.util.Scanner;

import static homework.books.command.Commands.EXIT;
import static homework.books.command.Commands.printCommands;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        Author Jack = new Author("Ջեք", "Լոնդոն", "x", "male");
        authorStorage.add(Jack);
        Author Mariam = new Author("Մարիամ", "Պետրոսյան", "y", "female");
        authorStorage.add(Mariam);
        Author Mark = new Author("Մարկ", "Արեն", "z", "male");
        authorStorage.add(Mark);

        bookStorage.add(new Book("Սպիտակ Ժանիք", Jack, 6, 300, "Արկածային"));
        bookStorage.add(new Book("Մարտին Իդեն", Jack, 3, 1200, "Դրամա"));
        bookStorage.add(new Book("Տուն որտեղ", Mariam, 11, 600, "Աբստրակտ"));

        boolean run = true;
        while (run) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case Commands.ADD_BOOK:
                    addBook();
                    break;
                case Commands.PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case Commands.PRINT_BOOKS_BY_AUTHOR_NAME:
                    PrintBooksByAuthorName();
                    break;
                case Commands.PRINT_BOOKS_BY_GENRE:
                    PrintBooksByGenre();
                    break;
                case Commands.PRINT_BOOKS_BY_PRICE_RANGE:
                    PrintBooksByPriceRange();
                    break;
                case Commands.ADD_AUTHOR:
                    addAuthor();
                    break;
                case Commands.PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }

        }

    }

    private static void addAuthor() {
        System.out.println("Please input author name:");
        String name = scanner.nextLine();
        System.out.println("Please input author surname:");
        String surname = scanner.nextLine();
        System.out.println("Please input author's gmail:");
        String gmail = scanner.nextLine();
        System.out.println("Please input author's gender:");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, gmail, gender);
        authorStorage.add(author);
        System.out.println("Author created!");

    }

    private static void PrintBooksByPriceRange() {
        System.out.println("Please input start price:");
        double price1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input end price:");
        double price2 = Double.parseDouble(scanner.nextLine());
        bookStorage.printBookByPriceRange(price1, price2);
    }

    private static void PrintBooksByGenre() {
        System.out.println("Please input genre:");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void PrintBooksByAuthorName() {
        System.out.println("Please input author name:");
        String author = scanner.nextLine();
        bookStorage.printBookByAuthorName(author);
    }

    private static void addBook() {
        if (authorStorage.getSize() == 0) {
            System.out.println("Please add Author:");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("Please choose Author index:");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("Please input correct index:");
                addBook();
            } else {
                System.out.println("Please input title:");
                String title = scanner.nextLine();

                System.out.println("Please input count:");
                String countStr = scanner.nextLine();

                System.out.println("Please input price:");
                String priceStr = scanner.nextLine();

                System.out.println("Please input genre:");
                String genre = scanner.nextLine();

                int count = Integer.parseInt(countStr);
                double price = Double.parseDouble(priceStr);
                Book book = new Book(title, author, count, price, genre);
                bookStorage.add(book);
                System.out.println("Thank you, book added.");
            }

        }


    }

}



