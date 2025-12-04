package com.olve_almacen.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.olve_almacen.tienda.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}