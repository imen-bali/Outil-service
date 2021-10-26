package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OutilRepository;

import com.example.demo.entity.Outil;

@Service
public class OutilImpl implements IOutilService {
	@Autowired
	OutilRepository outilRepository;

	@Override
	public Outil addOutil(Outil o) {
		outilRepository.save(o);
		return o;
	}

	@Override
	public void deleteOutil(Long id) {
		outilRepository.deleteById(id);

	}

	@Override
	public Outil updateOutil(Outil o) {
		return outilRepository.saveAndFlush(o);

	}

	@Override
	public Outil findOutil(Long id) {
		Outil o = (Outil) outilRepository.findById(id).get();
		return o;
	}

	@Override
	public List<Outil> findAll() {
		return outilRepository.findAll();
	}

	@Override
	public Outil findBySource(String Source) {
		return outilRepository.findBySource(Source);
	}

	@Override
	public Outil findByDate(Date Date) {
		return outilRepository.findByDate(Date);
	}

}
