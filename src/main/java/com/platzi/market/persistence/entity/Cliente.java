package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter @Setter
public class Cliente {
    @Id
    @Column(name = "id")
    private String idCliente;
    private String nombre;
    @Column(name = "apellidos")
    private String apellido;
    private String celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
