package com.inviilia.carsDemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.inviilia.carsDemo.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{
	Carro findByIdCarro (int idCarro);
	
	@Modifying
	@Query("select c FROM Carro c where valor < ?1 order by horsePower desc")
	List<Carro> getCarrosByPrice(double valor);
}