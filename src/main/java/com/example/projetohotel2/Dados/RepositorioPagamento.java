package com.example.projetohotel2;
import java.util.ArrayList;

public class RepositorioPagamento {

    private ArrayList<Pagamento> pagamentos;

    public RepositorioPagamento() {
        this.pagamentos = new ArrayList<>();
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
        // adiciona um pagamento na lista de pagamentos do sistema
    }

    public ArrayList<Pagamento> getAllPagamentos() {
        return pagamentos;
        // retorna a lista completa de pagamentos
    }

    public void removerPagamento(int id) {
        pagamentos.removeIf(pagamento -> pagamento.getId() == id);
    }

    public Pagamento getPagamentoPorId(int id) {
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getId() == id) {
                return pagamento;
            }
        }
        return null;
        // procura um pagamento na lista com base na id fornecida, caso não encontre retorna nulo
    }
}

