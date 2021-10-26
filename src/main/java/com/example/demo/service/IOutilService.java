package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.Outil;

public interface IOutilService {
	// Crud sur les evenements
	public Outil addOutil(Outil o);

	public void deleteOutil(Long id);

	public Outil updateOutil(Outil o);

	public Outil findOutil(Long id);

	public List<Outil> findAll();

	// Filtrage par propriété
	public Outil findBySource(String Source);

	public Outil findByDate(Date Date);

	// other ...
}
