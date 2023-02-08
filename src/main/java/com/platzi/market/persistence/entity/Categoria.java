package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
@Getter @Setter
public class Categoria {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    private String descripcion;
    private Boolean estado;
    //Aqui lo que se esta haciendo es hacer una conexión con todos los productos que esten asociados con una categoria
    //El mappedBy lleva el nombre del campo que esta relacionado con la otra tabla
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
