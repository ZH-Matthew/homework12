package homework12;

public class Book {
    private final String nameBook;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.nameBook = name;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}

