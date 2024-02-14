package com.example.projetohotel2.Dados;
import com.example.projetohotel2.Negocio.Reserva;

import java.util.ArrayList;

public class RepositorioReserva {
    private ArrayList<Reserva> reservas;

    public RepositorioReserva() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        // adiciona uma reserva na lista de reservas do sistema
    }

    public ArrayList<Reserva> getAllReserva() {
        return reservas;
        // retorna a lista completa de reservas
    }

    public void removerReserva(int id) {
        reservas.removeIf(reserva -> reserva.getId() == id);
        // remove uma reserva da lista de reservas do sistema
    }

    public Reserva getReservaPorId(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
        // procura uma reserva na lista com base no id fornecido, caso não encontre retorna nulo
    }
}
