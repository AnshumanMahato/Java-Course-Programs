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

    public Book(String name, int bno)
    {
        this.name = name;
        this.bno = bno;
    }

}



