package solid.singleresponsibilityprinciple;


public class Books {
    private String authorName;
    private String bookName;
    private String text;

    public Books(String authorName, String bookName, String text) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.text = text;
    }
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean findAuthor(String authName) {
        return authorName.contains(authName);
    }

    public boolean findBook(String bookName) {
        return this.bookName.contains(bookName);
    }

    /*
        @printToConsole Single responsibility principle will get break here.

    public void printToConsole() {

    }
     */
}
