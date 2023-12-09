package excs;

public class Author {
    private String name;
    private Book[] booksWritten;

    public Author(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBooksWritten(Book[] booksWritten){
        this.booksWritten = booksWritten;
    }

    public String getName(){
        return name;
    }
    public Book[] getBooksWritten(){
        return booksWritten;
    }

    public double getAvgPageNumber(){
        int sum = 0;
        for (int i = 0; i < booksWritten.length; i++) {
            sum += booksWritten[i].getNumberOfPages();
        }
        return (double) sum / (double) booksWritten.length;
    }
}
