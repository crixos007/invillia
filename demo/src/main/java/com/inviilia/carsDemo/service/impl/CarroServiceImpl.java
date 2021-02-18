package com.inviilia.carsDemo.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inviilia.carsDemo.entity.Carro;
import com.inviilia.carsDemo.repository.CarroRepository;
import com.inviilia.carsDemo.service.CarroService;

@Service
public class CarroServiceImpl implements CarroService {
	@Autowired
	CarroRepository repository;	
	
	@PersistenceContext	
	EntityManager entityManager;

	@Override
	public List<Carro> findCarros() {
		return repository.findAll();
	}
	
	@Override
	public List<Carro> findCarros(double valor) {
		return repository.getCarrosByPrice(valor);
	}

	@Override
	public String saveCarro(Carro carroNew) {
		if (carroNew != null) {
			List<Carro> carros =  repository.findAll()
								     	 	.stream()
								     	 	.filter(p->p.getSku().toLowerCase()
					     	 				.contains(carroNew.getSku().toLowerCase()))
								     	 	.collect(Collectors.toList());
			if(carros.size() > 0) {
				return "Registro existente";
			}else {
				carroNew.setFechaAlta(LocalDate.now());
				repository.save(carroNew);
				return "Registro creado";
			}
		}
		return "Error al crear el Registro";
	}

	@Override
	public String updateCarro(Carro carro) {
		if (carro != null) {
			Carro carroNew = repository.findByIdCarro(carro.getIdCarro());
			carroNew.setValor(carro.getValor());
			repository.save(carroNew);
			return "Registro modificado";
		}
		return "Error al modificar el Registro";
	}

	@Override
	public String deleteCarro(Carro carro) {
		if (carro != null) {			
			repository.delete(carro);
			return "Registro eliminado";
		}
		return "Error al eliminar el Registro";
	}

}
