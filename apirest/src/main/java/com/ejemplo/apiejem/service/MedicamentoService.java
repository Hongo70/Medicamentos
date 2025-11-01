package com.ejemplo.apiejem.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.ejemplo.apiejem.model.Medicamento;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {
	
	private List<Medicamento> medicamentos = new ArrayList<>();
		public List<Medicamento> mostrarMedicamento(){
			return medicamentos;
		}
		
		public Medicamento agregarMedicamento(Medicamento med) {
			medicamentos.add(med);
			return med;
		}
}
