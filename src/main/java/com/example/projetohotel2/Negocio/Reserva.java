package com.example.projetohotel2.Negocio;

import java.util.Date;

public class Reserva {
    private Date dataCheckIn;
    private Date dataCheckOut;
    private Hospede hospede;
    private Quarto quartoReservado;
    private Quarto quarto;
    private double preco;
    private int id;
    private Pagamento pagamento;

    public Reserva(Date dataCheckIn, Date dataCheckOut, Hospede hospede, Quarto quartoReservado, Quarto quarto, double preco, int id, Pagamento pagamento) {
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.hospede = hospede;
        this.quartoReservado = quartoReservado;
        this.quarto = quarto;
        this.preco = preco;
        this.id = id;
        this.pagamento = pagamento;

    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuartoReservado() {
        return quartoReservado;
    }

    public void setQuartoReservado(Quarto quartoReservado) {
        this.quartoReservado = quartoReservado;
    }


    public void fazerReserva() {
        if (hospede != null) {
            System.out.println("Reserva realizada com sucesso para o hóspede: " + hospede.getNome());
        } else {
            System.out.println("Não foi possível fazer a reserva, o hóspede não está definido.");
        }
    }


    public void cancelarReserva() {
        if (hospede != null) {
            System.out.println("Reserva cancelada para o hóspede: " + hospede.getNome());
        } else {
            System.out.println("Não foi possível cancelar a reserva, o hóspede não está definido.");
        }
    }


    public void exibirDetalhesReserva() {
        System.out.println("Detalhes da Reserva - ID: " + id);

        if (hospede != null) {
            System.out.println("Hóspede: " + hospede.getNome());
        } else {
            System.out.println("Hóspede não definido.");
        }

        if (quartoReservado != null) {
            System.out.println("Quarto Reservado: " + quartoReservado.getNumeroQuarto());
        } else {
            System.out.println("Quarto reservado não definido.");
        }

        System.out.println("Check-In: " + dataCheckIn);
        System.out.println("Check-Out: " + dataCheckOut);
        System.out.println("Preço: " + preco);

        if (pagamento != null && pagamento.getMetodoPagamento() != null) {
            System.out.println("Método de Pagamento: " + pagamento.getMetodoPagamento());
        } else {
            System.out.println("Método de pagamento não definido.");
        }
    }

    }
