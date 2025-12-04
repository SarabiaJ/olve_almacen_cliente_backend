package com.olve_almacen.tienda.controller;

import com.olve_almacen.tienda.model.Producto;
import com.olve_almacen.tienda.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") // permite que tu HTML pueda acceder desde cualquier lado
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }
}
