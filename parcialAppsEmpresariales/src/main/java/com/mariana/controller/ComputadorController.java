package com.mariana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mariana.models.Computador;
import com.mariana.repository.IComputadorRepository;

@Controller
@RequestMapping("/computador")
public class ComputadorController {
	
	@Autowired
	private IComputadorRepository computadorRepository;
	
	@GetMapping("/computadores")
	public String listaComputadores(Model model) {
		List<Computador> computadores = computadorRepository.findAll();
		
		model.addAttribute("computadores",computadores);
		return "lista-computadores";
	}

}
