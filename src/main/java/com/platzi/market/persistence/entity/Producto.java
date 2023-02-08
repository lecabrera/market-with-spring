package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//Indicara a java que esta es una clase que mapea una tabla de una base de datos
@Entity
@Table(name = "productos")
@Getter @Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    private String nombre;
    @Column(name="id_categoria")
    private Integer idCategoria;
    @Column(name="codigo_barras")
    private String codigoBarra;
    @Column(name="precio_venta")
    private Double precioVenta;
    @Column(name="cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;
    //El Many esta indicando la clase y el one la relación con la otra entidad, osea el atributo
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;




}