package com.example.lab2.repository;

import com.example.lab2.model.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueRepository extends JpaRepository<Issue,Integer> {

    Page<Issue> findAll (Pageable pageable);
    boolean existsByTitle(String title);

}


