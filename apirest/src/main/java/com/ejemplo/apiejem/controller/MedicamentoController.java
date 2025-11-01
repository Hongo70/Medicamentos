package com.ejemplo.apiejem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.apiejem.model.Medicamento;
import com.ejemplo.apiejem.service.MedicamentoService;

	@RestController
	@RequestMapping("/api/medicamentos")
	@CrossOrigin(origins = "*")
		public class MedicamentoController {
	
		@Autowired 
		private MedicamentoService medicamentoService;
		
		//GETMAPPING obtener lista de personas
		@GetMapping
		public List<Medicamento> mostrar(){
			return 	medicamentoService.mostrarMedicamento();
		}
		
		//POSTMAPPING 
		@PostMapping 
		public Medicamento agregar (@RequestBody Medicamento medicamento){
			return medicamentoService.agregarMedicamento(medicamento);
			
		}
		

}
