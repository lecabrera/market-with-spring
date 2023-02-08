package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos")
@Getter @Setter
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK id;
    private Integer cantidad;
    private BigDecimal total;
    private Boolean estado;
    @ManyToOne
    //Cuando compras productos se vaya a guardar en cascadas sabra que que compras pertenercen
    //los productos
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

}
