package programs.CH10;

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



