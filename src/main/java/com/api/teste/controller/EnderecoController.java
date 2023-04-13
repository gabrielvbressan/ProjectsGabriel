package com.api.teste.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.teste.model.Endereco;
import com.api.teste.repository.EnderecoRepository;

@RestController
@RequestMapping("/adress")
public class EnderecoController {

	@Autowired
	private EnderecoRepository endRep;
	
	@PostMapping
	public Endereco add(@RequestBody Endereco ed) {
		return endRep.save(ed);
	}

	@GetMapping
	public List<Endereco> list(){
		return endRep.findAll();
	}
	
	@PutMapping
	public Endereco edit(@RequestBody Endereco ed) {	
		return endRep.save(ed);
	}
	

}
