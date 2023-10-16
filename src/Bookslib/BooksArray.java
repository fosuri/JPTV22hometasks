
package Bookslib;



public class BooksArray {
    public void runbooks() {
        Author author1 = new Author("Автор 1", 35);
        Author author2 = new Author("Автор 2", 42);
        Author author3 = new Author("Автор 3", 28);

        Author[] authors1 = {author1, author2};
        Author[] authors2 = {author2, author3, author1};
        Author[] authors3 = {author1, author3};
        Author[] authors4 = {author1};
        Author[] authors5 = {author2, author3};

        Book[] books = new Book[5];
        books[0] = new Book("Книга 1", authors1, 2000);
        books[1] = new Book("Книга 2", authors2, 2010);
        books[2] = new Book("Книга 3", authors3, 2020);
        books[3] = new Book("Книга 4", authors4, 1995);
        books[4] = new Book("Книга 5", authors5, 2015);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}