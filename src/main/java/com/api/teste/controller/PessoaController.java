package com.api.teste.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.teste.model.Pessoa;
import com.api.teste.repository.PessoaRepository;

@RestController
@RequestMapping("/clientes")
public class PessoaController {
	
	@Autowired
	private PessoaRepository rep;
	
	@PostMapping
	public Pessoa add(@RequestBody Pessoa p) {
		return rep.save(p);
	}

	@GetMapping
	public List<Pessoa> list(){
		return rep.findAll();
	}
	
	@PutMapping
	public Pessoa edit(@RequestBody Pessoa p) {	
		return rep.save(p);
	}
	
	@GetMapping("/consulta/{nome}")
	public List<Pessoa> consult(@PathVariable("nome") String nome){
		return rep.findByNome(nome);
	}
	
}
