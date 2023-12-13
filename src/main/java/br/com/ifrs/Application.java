package br.com.ifrs;

import br.com.ifrs.dao.DespesaDAO;
import br.com.ifrs.model.Categoria;
import br.com.ifrs.model.Despesa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(2L);
        despesaOptional.ifPresent(despesa -> {
            System.out.println("Id: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Data: " + despesa.getData());
            System.out.println("Valor: " + despesa.getValor());
            System.out.println("Categoria: " + despesa.getCategoria());
        });


//        List<Despesa> despesas = dao.findAll();
//
//        for (Despesa despesa : despesas) {
//            System.out.println("Id: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Data: " + despesa.getData());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("Categoria: " + despesa.getCategoria());
//            System.out.println();
//        }


//        Despesa despesa = new Despesa("Viagem de uber até o aeroporto",
//                LocalDate.of(2023,12,28),
//                110,
//                Categoria.TRANSPORTE);
//
//        Despesa despesaInsercao = dao.save(despesa);
//        System.out.println("Foi inserido a despesa com id: " + despesaInsercao.getId());

    }
}
