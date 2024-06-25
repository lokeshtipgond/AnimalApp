package com.springProject.SpringProject.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Books {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long bookId ;
    @Column(name = "book_name")
    String bookName ;
    @Column(name = "author_name")
    String bookAuthor;
    @Column(name = "book_price")
    long bookPrice;


}
