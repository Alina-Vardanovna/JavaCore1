package homework.books.command;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHORS = 7;

    static void printCommands() {

        System.out.println("Please input " + EXIT + " for exit:");
        System.out.println("Please input " + Commands.ADD_BOOK + " to add a book:");
        System.out.println("Please input " + Commands.PRINT_ALL_BOOKS + " for print all books:");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name:");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_GENRE + " for print books by genre:");
        System.out.println("Please input " + Commands.ADD_AUTHOR + " for add author:");
        System.out.println("Please input " + Commands.PRINT_ALL_AUTHORS + " for print all authors:");

    }

}
