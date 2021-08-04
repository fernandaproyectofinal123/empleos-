package com.fernanda.gonzalez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernanda.gonzalez.model.Categoria;

public interface CategoriasRepository extends  JpaRepository<Categoria, Integer> {

}
