package com.drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drugstore.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByTipoContainingIgnoreCase(String tipo);

}
