package br.com.ifrs.dao;

import br.com.ifrs.model.Categoria;
import br.com.ifrs.model.Despesa;

import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesasDAO{

    @Override
    public Despesa save(Despesa despesa) {
        return null;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return null;
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {
        return null;
    }
}
