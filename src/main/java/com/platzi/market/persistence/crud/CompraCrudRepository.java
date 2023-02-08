package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    //Es un query method y siempre debe de iniciar con findBy
    Optional<List<Compra>> findByIdCliente(String idCliente);
}
