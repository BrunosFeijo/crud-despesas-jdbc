package br.com.ifrs.dao;

import br.com.ifrs.model.Categoria;
import br.com.ifrs.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesasDAO {

    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(Long id);
    List<Despesa> findByCategoria(Categoria categoria);
}
