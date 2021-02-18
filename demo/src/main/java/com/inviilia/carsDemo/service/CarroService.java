package com.inviilia.carsDemo.service;

import java.util.List;

import com.inviilia.carsDemo.entity.Carro;

public interface CarroService {
	public List<Carro> findCarros();
	public List<Carro> findCarros(double valor);
	public String saveCarro(Carro carroNew);
	public String updateCarro(Carro carro);
	public String deleteCarro(Carro carro);
}
