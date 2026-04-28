public class Book {
    private String bookId; // attributes of book
    private String bookName;
    private String author;
    private boolean isIssue;
    public String name;
    public String balance;

    // defining constructor- create obj, initialize the instance variable.
    public Book(String bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        isIssue = false;

    }

    public Book(String bookId2, String bookName2, int i) {
        // TODO Auto-generated constructor stub
    }

    // setter and getter method
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    // methods to display the book details
    public void bookInfo1() {

    }
    public boolean getIsIssue() {
        return isIssue;
    }

    public void setIsIssue(boolean isIssue) {
        this.isIssue = isIssue;
    }

    //method to display the book details
    public void bookInfo(){
        System.out.println("Book Id= "+bookId);
        System.out.println("Book Name= "+bookName);
        System.out.println("Book Author= "+author);
        System.out.println("Book Issue= "+isIssue);
    }

    public void deposit(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    public void withdraw(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    public void customerInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'customerInfo'");
    }

    public boolean transactionsFee(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transactionsFee'");
    }



}