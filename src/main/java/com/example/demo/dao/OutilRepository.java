package com.example.demo.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Outil;

public interface OutilRepository extends JpaRepository<Outil, Long> {

	Outil findBySource(String Source);

	Outil findByDate(Date Date);
}
