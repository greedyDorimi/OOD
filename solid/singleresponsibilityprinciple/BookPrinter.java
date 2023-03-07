package solid.singleresponsibilityprinciple;

public class BookPrinter {

    public void printToConsole(Books book) {
        System.out.printf("%s %s %s\n", book.getAuthorName(), book.getBookName(), book.getText());
    }

    public void shareToOtherMedium(String text) {

    }
}
