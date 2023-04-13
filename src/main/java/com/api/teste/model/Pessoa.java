package com.api.teste.model;

import java.util.Objects;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nome;
	@Column
	private String nasciData;
	
	@ManyToOne
	private Endereco endereco;
	@ManyToOne
	private Endereco enderecoSec;
	
	public Pessoa() {
		this(0,"","",null,null);
	}
	
	public Pessoa(Integer id, String nome, String nasciData, Endereco endereco, Endereco enderecoSec) {
		this.id = id;
		this.nome = nome;
		this.nasciData = nasciData;
		this.endereco = endereco;
		this.enderecoSec = enderecoSec;
		
		
	}
	
	public Endereco getEnderecoSec() {
		return enderecoSec;
	}

	public void setEnderecoSec(Endereco enderecoSec) {
		this.enderecoSec = enderecoSec;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNasciData() {
		return nasciData;
	}
	public void setNasciData(String nasciData) {
		this.nasciData = nasciData;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
}
