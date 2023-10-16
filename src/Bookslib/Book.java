package Bookslib;

public class Book {
    private String title;
    private Author[] authors;
    private int year;

    public Book(String title, Author[] authors, int year) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Год издания не может быть отрицательным.");
        }
    }

    @Override
    public String toString() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        authorNames.delete(authorNames.length() - 2, authorNames.length());  // Удаляем лишнюю запятую и пробел
        return "Book{title='" + title + "', authors=[" + authorNames + "], year=" + year + '}';
    }
}

