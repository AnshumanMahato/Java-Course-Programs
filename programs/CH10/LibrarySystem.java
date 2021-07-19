package programs.CH10;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        
    }
}

class Book {
    private int bno;

    public int getBno() {
	    return this.bno;
    }       
    public void setBno(int bno) {
	    this.bno = bno; 
    }

    private String name;

    public String getName() {
	    return this.name;
    }   
    public void setName(String name) {
	    this.name = name;
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

    public LibraryBook(){
        this.availablecopies = 0;
        this.totalCopies = 0;
    }

}

class IssuedBook extends Book {
    private int uno;
    private String userName;

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

    private int lastBookBno() {
        return libraryBooks[totalBooks - 1].getBno();
    }

    private boolean canAddBook(){
        return totalBooks < 10;
    }

    private boolean noBooks(){
        return totalBooks == 0;
    }

    public Library(){
        this.libraryBooks = new LibraryBook[10];
        this.issuedBooks = new IssuedBook[100];
        this.totalBooks = 0;
        this.booksIssued = 0;
        
    }

    public void addBook(){
        if(!canAddBook()){
            System.out.println("Library is full. Cannot add new books.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        LibraryBook book = new LibraryBook();
        String bookName;
        int noc;

        if(noBooks())
            book.setBno(1000);
        else
            book.setBno(lastBookBno() + 1);
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


    }
}



