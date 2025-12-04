package com.olve_almacen.tienda.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;
    private String descripcion;

    @Column(name = "imagen_url")
    private String imagenUrl;

    private Double precio;

    @Column(name = "stock_actual")
    private Integer stockActual;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    
}
