package com.example.projetohotel2;

import java.time.LocalDate;

public class Pagamento {
    private double valorTotal;
    private LocalDate dataPagamento;
    private int id;
    private String metodoPagamento;

    public Pagamento(double valorTotal, LocalDate dataPagamento, int id, String metodoPagamento) {
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.id = id;
        this.metodoPagamento = metodoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public int getId() {
        return id;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarPagamento(double novoValorTotal, LocalDate novaDataPagamento, String novoMetodoPagamento) {
        setValorTotal(novoValorTotal);
        setDataPagamento(novaDataPagamento);
        setMetodoPagamento(novoMetodoPagamento);
        System.out.println("Pagamento realizado com sucesso. ID do pagamento: " + getId());
    }

    public void exibirInformacoesPagamento() {
        System.out.println("Informações do Pagamento (ID " + getId() + "):");
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Data do Pagamento: " + getDataPagamento());
        System.out.println("Método de Pagamento: " + getMetodoPagamento());
    }
}
