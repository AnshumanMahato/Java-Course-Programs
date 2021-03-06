package programs.CH10;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        do{
            System.out.println("Library Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Show Book List");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.println("Enter Choice (1-5):");

            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    library.addBook(sc);
                    break;
                case 2:
                    library.showBookList();
                    break;
                case 3:
                    library.issueBook(sc);
                    break;
                case 4:
                    library.returnBook();
                    break;
                case 5:
                    System.out.println("Thank you!!!");
                    break;            
                default:
                    System.out.println("Invalid value. Enter between 1-5.");
            }
        }while(n != 5);

        sc.close();
        
    }
}

class Book {
    private int bno;
    private String name;

    public int getBno() {
	    return this.bno;
    }       
    public void setBno(int bno) {
	    this.bno = bno; 
    }

    public String getName() {
	    return this.name;
    }   
    public void setName(String name) {
	    this.name = name;
    }

    public void getBook(){
        System.out.println("Book No.: " + this.bno);
        System.out.println("Book Name: " + this.name);
    }

    public Book()
    {
        this.name ="";
        this.bno = 0;
    }

}

class LibraryBook extends Book {
    private int availablecopies;
    private int totalCopies;

    public int getAvailablecopies() {
	    return this.availablecopies;
    }
    public void setAvailablecopies(int availablecopies) {
	    this.availablecopies = availablecopies;
    }


    public int getTotalCopies() {
    	return this.totalCopies;
    }
    public void setTotalCopies(int totalCopies) {
    	this.totalCopies = totalCopies;
    }

    public void removeCopy() {
        this.availablecopies--;
    }

    public void addCopy(){
        this.availablecopies++;
    }

    public boolean isBookAvailable(){
        return availablecopies > 0;
    }

    public LibraryBook(){
        this.availablecopies = 0;
        this.totalCopies = 0;
    }

}

class IssuedBook extends Book {
    private int uno;
    private String userName;

    public void setBookDetails(LibraryBook book){
        this.setBno(book.getBno());
        this.setName(book.getName());
    }

    public int getUno() {
	    return this.uno;
    }
    public void setUno(int uno) {
	    this.uno = uno;
    }


    public String getUserName() {
    	return this.userName;
    }
    public void setUserName(String userName) {
    	this.userName = userName;
    }

}

class Library{
    private LibraryBook[] libraryBooks;
    private IssuedBook[] issuedBooks;

    private int totalBooks;
    private int booksIssued;

    private boolean canAddBook(){
        return totalBooks < 10;
    }

    public Library(){
        this.libraryBooks = new LibraryBook[10];
        this.issuedBooks = new IssuedBook[100];
        this.totalBooks = 0;
        this.booksIssued = 0;
        
    }

    public void addBook(Scanner sc){
        if(!canAddBook()){
            System.out.println("Library is full. Cannot add new books.");
            return;
        }

        LibraryBook book = new LibraryBook();
        String bookName;
        int noc;

        book.setBno(1000 + totalBooks);
        System.out.println("Enter Book Name:");
        bookName = sc.nextLine();
        book.setName(bookName);
        do{
            System.out.println("Enter no. of copies (between 1 to 10):");
            noc = sc.nextInt();

            if(noc < 0 || noc > 10)
                System.out.println("A book can have something between 1 to 10 copies. Please insert a valid value.");
        }
        while(noc < 0 || noc > 10);

        book.setTotalCopies(noc);
        book.setAvailablecopies(noc);

        libraryBooks[totalBooks++] = book;

        System.out.println("Book has been added successfully!!!");
        // sc.close();
    }

    public void issueBook(Scanner sc){

        IssuedBook book = new IssuedBook();
        int bno;
        String username;

        System.out.println("Enter Book No.:");
        bno = sc.nextInt();
        bno %= 10;
        
        if(bno < 0 || bno > 9 ){
            System.out.println("Book Not Found!!! Please check booklist for available books and their respective book no.s");
            return;
        }

        if(!libraryBooks[bno].isBookAvailable()){
            System.out.println("No copies are available for this book. Sorry!!!");
            return;
        }

        book.setBookDetails(libraryBooks[bno]);
        libraryBooks[bno].removeCopy();

        book.setUno(1000 + booksIssued);
        System.out.println("Enter Username:");
        username = sc.next();
        book.setUserName(username);

        System.out.println("Following book has been issued to " + username + "(ID:" + book.getUno() + ")");
        book.getBook();
        System.out.println("Thank You for using our service. Please return the book on time...");

        issuedBooks[booksIssued++] = book;

    }

    public void showBookList(){

        System.out.println("BookList");
        System.out.printf("\n %30s | %30s | %30s | %30s","Book No.","Name","Total Copies","Available Copies");
        for (int book = 0; book < totalBooks; book++) {
            System.out.printf("\n %3d | %30s | %30d | %30d",libraryBooks[book].getBno(),libraryBooks[book].getName(),libraryBooks[book].getTotalCopies(),libraryBooks[book].getAvailablecopies());
        }
    }

    public void returnBook(){
        
    }
}



