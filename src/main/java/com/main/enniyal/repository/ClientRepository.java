package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {

}
