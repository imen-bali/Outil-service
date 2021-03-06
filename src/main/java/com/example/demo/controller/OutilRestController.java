package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.IOutilService;

import com.example.demo.entity.Outil;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class OutilRestController {
	@Autowired
	IOutilService outilService;

	@RequestMapping(value = "/outils", method = RequestMethod.GET)

	public List<Outil> findOutils() {
		return outilService.findAll();
	}

	@GetMapping(value = "/outil/{id}")

	public Outil findOneOutilById(@PathVariable Long id) {

		return outilService.findOutil(id);
	}

	@GetMapping(value = "/outil/search/source")

	public Outil findOneOutilBySource(@RequestParam String source)

	{
		return outilService.findBySource(source);
	}

	@GetMapping(value = "/outil/search/date")

	public Outil findOneOutilByDate(@RequestParam Date Date)

	{
		return outilService.findByDate(Date);
	}

	@PostMapping(value = "/outil")

	public Outil addOutil(@RequestBody Outil o)

	{
		return outilService.addOutil(o);

	}

	@DeleteMapping(value = "/outil/{id}")

	public void deleteOutil(@PathVariable Long id)

	{

		outilService.deleteOutil(id);

	}

	@PutMapping(value = "/outils/{id}")

	public Outil updateOutil(Outil o)

	{

		return outilService.updateOutil(o);

	}

}
