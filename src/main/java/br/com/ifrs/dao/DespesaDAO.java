package br.com.ifrs.dao;

import br.com.ifrs.infra.ConnectionFactory;
import br.com.ifrs.model.Categoria;
import br.com.ifrs.model.Despesa;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesasDAO {

    @Override
    public Despesa save(Despesa despesa) {
        String sql = "INSERT INTO Despesas (descricao, valor, data, categoria) VALUES (?,?,?,?)";

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            Long id = resultSet.getLong("id");
            despesa.setId(id);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return despesa;
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
        String sql = "SELECT id, descricao, data, valor, categoria FROM despesas";
        List<Despesa> despesas = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String descricao = resultSet.getString("descricao");
                Double valor =  resultSet.getDouble("valor");
                LocalDate data = resultSet.getDate("data").toLocalDate();
                Categoria categoria = Categoria.valueOf(resultSet.getString("categoria"));

                Despesa despesa = new Despesa(id, descricao, data, valor, categoria);
                despesas.add(despesa);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return despesas;
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
