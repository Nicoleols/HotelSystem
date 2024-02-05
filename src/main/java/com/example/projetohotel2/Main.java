package com.example.projetohotel2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Quarto quarto1 = new Quarto(101, "Simples", true);

        try {
            Date checkIn1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2024");
            Date checkOut1 = new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2024");
            // Criando um objeto de Hospede
            Hospede hospede1 = new Hospede("João", "Silva", "Rua A, 123", 30, "123.456.789-01", "123456789", "joao@email.com", 1);

            // Criando um objeto Pagamento
            Pagamento pagamento1 = new Pagamento(500.0, LocalDate.of(2025, 12, 1), 123, "MasterCard");

            // Criando uma reserva
            Reserva reserva1 = new Reserva(checkIn1, checkOut1, null, quarto1, quarto1, 500.0, 1, pagamento1);

            // Criando o repositório de reservas
            RepositorioReserva repositorio = new RepositorioReserva();

            // Adicionando a reserva ao repositório
            repositorio.adicionarReserva(reserva1);
            reserva1.fazerReserva();
            reserva1.cancelarReserva();
            reserva1.exibirDetalhesReserva();

            // Obtendo todas as reservas
            ArrayList<Reserva> todasAsReservas = repositorio.getAllReserva();
            System.out.println("Todas as reservas:");
            for (Reserva reserva : todasAsReservas) {
                System.out.println("ID: " + reserva.getId() + ", Quarto: " + reserva.getQuartoReservado().getNumeroQuarto());
            }

            // Removendo uma reserva pelo ID
            repositorio.removerReserva(1);
            System.out.println("Reserva removida.");

            // Obtendo todas as reservas novamente após a remoção
            todasAsReservas = repositorio.getAllReserva();
            System.out.println("Todas as reservas após a remoção:");
            for (Reserva reserva : todasAsReservas) {
                System.out.println("ID: " + reserva.getId() + ", Quarto: " + reserva.getQuartoReservado().getNumeroQuarto());
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
