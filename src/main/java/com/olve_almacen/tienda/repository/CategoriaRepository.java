package com.olve_almacen.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.olve_almacen.tienda.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}