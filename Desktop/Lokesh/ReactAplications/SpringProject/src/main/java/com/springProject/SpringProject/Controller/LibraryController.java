package com.springProject.SpringProject.Controller;

import com.springProject.SpringProject.Entity.Books;
import com.springProject.SpringProject.Repository.LibraryRepo;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ltipgond/")
public class LibraryController {
    @Autowired
    private LibraryRepo libraryRepo;
    @GetMapping("/library")
    public List<Books> getAllBooks(){
        return libraryRepo.findAll();
    }

    // create employee rest api

    @PostMapping("/books")
    public Books createLibary(@RequestBody Books books) {
        return libraryRepo.save(books);
    }

    // get Book by id rest api
    @GetMapping("/books/{id}")
    public ResponseEntity<Object> getBookByID(@PathVariable Long id) {
        Books books = libraryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
        return ResponseEntity.ok(books);
    }

    // update Book rest api

    @PutMapping("/Books/{id}")
    public ResponseEntity<Object> updateBook(@PathVariable Long id, @RequestBody Books bookDetails){
        Books books = libraryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));

        books.setBookName(bookDetails.getBookName());
        books.setBookAuthor(bookDetails.getBookAuthor());
        books.setBookPrice(bookDetails.getBookPrice());

        Books updatedBooks = libraryRepo.save(books);
        return ResponseEntity.ok(updatedBooks);
    }

    // delete Book rest api
    @DeleteMapping("/Books/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBook(@PathVariable Long id){
        Books books = libraryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));

        libraryRepo.delete(books);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
