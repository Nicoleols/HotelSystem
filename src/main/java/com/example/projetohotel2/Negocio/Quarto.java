package com.example.projetohotel2.Negocio;

public class Quarto {
    private String tipoQuarto;
    private int numeroQuarto;
    private boolean statusDisponibilidade;

    public Quarto (int numeroQuarto, String tipoQuarto, boolean statusDisponibilidade) {
        this.tipoQuarto = tipoQuarto;
        this.numeroQuarto = numeroQuarto;
        this.statusDisponibilidade = statusDisponibilidade;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public boolean getStatusDisponibilidade() {
        return statusDisponibilidade;
    }

    public void setStatusDisponibilidade(boolean statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }

    public void reservar(Hospede hospede) {
        if (statusDisponibilidade) {
            System.out.println("Reserva realizada para o quarto " + numeroQuarto + " pelo hospede " + hospede.getNome());
            statusDisponibilidade = false;
        } else {
            System.out.println("Quarto já está ocupado!");
        }
    }

    public void realizarCheckOut() {
        if (!statusDisponibilidade) {
            System.out.println("CheckOut realizado para o quarto " + numeroQuarto);
            statusDisponibilidade = true;
        } else {
            System.out.println("Quarto não está ocupado!");
        }
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "tipoQuarto='" + tipoQuarto + '\'' +
                ", numeroQuarto=" + numeroQuarto +
                ", statusDisponibilidade=" + statusDisponibilidade +
                '}';
    }
}
