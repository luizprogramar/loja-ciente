package com.comploja.clientloja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comploja.clientloja.entitys.Cliente;
import com.comploja.clientloja.repositorys.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository reposit;
	
	@GetMapping
	public List<Cliente> findAll(){
		List<Cliente>  ru = reposit.findAll();
		    return ru;
	}
	
	@GetMapping(value = "/{id}")
	public Cliente findById(@PathVariable Long id) {
		Cliente ru =    reposit.findById(id).get();
		   return ru;
	}

}
