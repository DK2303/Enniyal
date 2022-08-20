package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.OrganizerModel;

@Repository
public interface OrganizerRepository extends JpaRepository<OrganizerModel, Long>{

}
