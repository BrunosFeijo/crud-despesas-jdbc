package br.com.ifrs;

import br.com.ifrs.dao.DespesaDAO;
import br.com.ifrs.model.Categoria;
import br.com.ifrs.model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa("Livro de Prog",
                LocalDate.of(2023,12,9),
                150,
                Categoria.EDUCACAO);

        Despesa despesaInsercao = dao.save(despesa);
        System.out.println("Foi inserido a despesa com id: " + despesaInsercao.getId());

    }
}
