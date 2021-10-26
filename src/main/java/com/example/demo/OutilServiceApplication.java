package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entity.Outil;
import com.example.demo.service.IOutilService;

@SpringBootApplication
public class OutilServiceApplication implements CommandLineRunner {
	@Autowired
	OutilRepository outilRepository;
	@Autowired
	IOutilService outilService;

	public static void main(String[] args) {
		SpringApplication.run(OutilServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormatter.parse("2020-05-01");
		Date date2 = dateFormatter.parse("2020-05-02");

		Outil outil1 = new Outil();
		outil1.setSource("source1");

		outil1.setDate(date1);
		outilRepository.save(outil1);
		System.out.println(outil1);

		Outil outil2 = new Outil();
		outil2.setSource("source2");

		outil2.setDate(date2);
		outilRepository.save(outil2);
		System.out.println(outil2);
		outilService.findOutil(1L);

		outil1.setSource("la source 1");
		outilService.updateOutil(outil1);
		/*
		 * delete outilService.deleteOutil(1L);
		 */
		Outil o = outilRepository.findBySource("source1");
		System.out.println(o);
	}
}
