package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
//Se coloca categoryMapper.class para indicar que sera utilizada el mapeador de categoria
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto" , target = "productId"),
            @Mapping(source = "idCategoria" , target = "categoryId"),
            @Mapping(source = "precioVenta" , target = "price"),
            @Mapping(source = "cantidadStock" , target = "stock"),
            @Mapping(source = "estado" , target = "active"),
            @Mapping(source = "nombre" , target = "name"),
            @Mapping(source = "categoria" , target = "category"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);
    @InheritInverseConfiguration
    @Mapping(target = "codigoBarra", ignore = true)
    Producto toProducto(Product product);
}
