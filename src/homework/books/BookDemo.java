package homework.books;

import homework.books.command.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

import static homework.books.command.Commands.EXIT;
import static homework.books.command.Commands.printCommands;

public class BookDemo {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        Author author1 = new Author("Ջեք", "Լոնդոն", "x", "male");
        authorStorage.add(author1);
        Author Mariam = new Author("Մարիամ", "Պետրոսյան", "y", "female");
        authorStorage.add(Mariam);
        Author Mark = new Author("Մարկ", "Արեն", "z", "male");
        authorStorage.add(Mark);

        bookStorage.add(new Book("Սպիտակ Ժանիք", author1, 6, 300, "Արկածային"));
        bookStorage.add(new Book("Մարտին Իդեն", author1, 3, 1200, "Դրամա"));
        bookStorage.add(new Book("Տուն որտեղ", Mariam, 11, 600, "Աբստրակտ"));

        boolean run = true;
        while (run) {
            printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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
                    printBooksByAuthorName();
                    break;
                case Commands.PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case Commands.PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
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

    private static void printBooksByPriceRange() {
        System.out.println("Please input start price:");
        try {
            double price1, price2;
            price1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input end price:");
            price2 = Double.parseDouble(scanner.nextLine());
            bookStorage.printBookByPriceRange(price1, price2);
        } catch (NumberFormatException e) {
            System.out.println("You can input only number. Please try again!");
            printBooksByPriceRange();
        }
    }

    private static void printBooksByGenre() {
        System.out.println("Please input genre:");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void printBooksByAuthorName() {
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
            try {
                Author author = authorStorage.getAuthorByIndex(authorIndex);
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
            } catch (AuthorNotFoundException e) {
                System.out.println(e.getMessage());
                addBook();
            }

        }


    }

}



