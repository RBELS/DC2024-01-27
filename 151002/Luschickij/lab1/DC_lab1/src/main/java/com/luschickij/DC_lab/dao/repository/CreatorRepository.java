package com.luschickij.DC_lab.dao.repository;

import com.luschickij.DC_lab.model.entity.Creator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatorRepository extends JpaRepository<Creator, Long> {

}
