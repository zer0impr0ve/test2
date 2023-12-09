package excs;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2);
        //System.out.println(rectangle.getArea());
        rectangle.setA(3);
        //System.out.println("The area is: " + rectangle.getArea());
        //System.out.println("The perimeter is: " + rectangle.getPerimeter());

        Employee[] employees = new Employee[]{
                new Employee(30, "Name","LatName"),
                new Employee(34, "Name","LastName"),
                new Employee(51, "Name","LastName"),
                new Employee(27, "Name","LastName"),
                new Employee(48, "Name","LastName")
        };
        Company company = new Company("CompanyName");
        company.setEmployees(employees);
        //System.out.println(company.toString());


        Book[] books = new Book[]{
                new Book("name", 1998, 200),
                new Book("name", 1998, 134),
                new Book("name", 1998, 257)
        };
        Author author = new Author("AuthorName");
        author.setBooksWritten(books);
        System.out.println("Average page number of " + author.getName()
                + " is "+author.getAvgPageNumber());

        Book[] anotherAuthorsBooks = new Book[]{
                new Book("name", 1998, 200),
                new Book("name", 1998, 134)
        };
        Author anotherAuthor = new Author("AnotherAuthor");
        anotherAuthor.setBooksWritten(anotherAuthorsBooks);
        System.out.println("Average page number of " + anotherAuthor.getName()
                + " is "+anotherAuthor.getAvgPageNumber());
    }
}
