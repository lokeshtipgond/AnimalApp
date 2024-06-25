package com.springProject.SpringProject.Repository;

import com.springProject.SpringProject.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository <Books,Long>{

}
