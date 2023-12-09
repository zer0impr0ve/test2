package excs;

public class Book {

    private String name;
    private int yearPublished;
    private int numberOfPages;

    public Book(String name, int yearPublished, int numberOfPages){
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
    }

    public String getName(){
        return name;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public  void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}
