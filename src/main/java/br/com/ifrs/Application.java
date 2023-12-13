package br.com.ifrs;

import br.com.ifrs.dao.DespesaDAO;
import br.com.ifrs.model.Categoria;
import br.com.ifrs.model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa("Pagamento do aluguel",
                LocalDate.of(2023,12,13),
                1200,
                Categoria.MORADIA);

        dao.save(despesa);

    }
}
