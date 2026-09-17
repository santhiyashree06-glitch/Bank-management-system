package com.example.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.*;

public interface TransRepo extends JpaRepository<Transaction,Integer>{

}
