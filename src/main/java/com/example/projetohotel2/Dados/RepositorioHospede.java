package com.example.projetohotel2;

import java.util.ArrayList;

public class RepositorioHospede {
    private ArrayList<Hospede> hospedes;

    public RepositorioHospede() {
        this.hospedes = new ArrayList<>();
    }

    public void adicionarHospede(Hospede hospede) {
        hospedes.add(hospede);
        // Adiciona um hóspede à lista de hóspedes do sistema
    }

    public ArrayList<Hospede> getAllHospede() {
        return hospedes;
        // Retorna a lista completa de hóspedes
    }

    public void removerHospede(int id) {
        hospedes.removeIf(hospede -> hospede.getId() == id);
        // Remove um hóspede da lista de hóspedes do sistema
    }

    public Hospede getHospedePorId(int id) {
        for (Hospede hospede : hospedes) {
            if (hospede.getId() == id) {
                return hospede;
            }
        }
        return null;
        // Procura um hóspede na lista com base no ID fornecido, caso não encontre, retorna nulo
    }
}
