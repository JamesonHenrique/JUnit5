package com.jhcs.mockito.testDoubles.fake;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book) {
        bookRepository.save(book);
    }
    public int findNumberOfBooks() {
        return bookRepository.findAll().size();
    }
}
