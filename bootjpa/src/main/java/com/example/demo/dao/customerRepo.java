package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.customer;

public interface customerRepo extends JpaRepository<customer, Integer>
{

}
