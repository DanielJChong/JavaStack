package com.daniel.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.daniel.mvc.models.Book;
import com.daniel.mvc.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // update a book
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional <Book> temp = bookRepository.findById(id);
    	if(temp != null) {
    		if (title != null) {
        		temp.get().setTitle(title);
    		}
    		if (desc != null) {
    			temp.get().setDescription(desc);
    		}
    		if (lang != null) {
    			temp.get().setLanguage(lang);
    		}
    		if (numOfPages != null) {
    			temp.get().setNumberOfPages(numOfPages);
    		}
    		bookRepository.save(temp.get());
    		return temp.get();
    	}
    	return null;        
    }
    
    //delete a book
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

}