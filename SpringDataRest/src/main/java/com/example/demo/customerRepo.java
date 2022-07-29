package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.customer;


@RepositoryRestResource(collectionResourceRel="customer",path = "customer")
public interface customerRepo extends JpaRepository< customer , Integer>
{

}
