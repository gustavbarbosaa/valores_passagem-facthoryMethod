package org.example;

import lombok.Data;

@Data
public class Passagem {
    private final double valorPassagem;
    private double taxaEmbarque;
    private double taxaBagagem;

    protected Passagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public double calculaValorComEmbarque() {
        return this.valorPassagem * this.taxaEmbarque;
    }

    public double calculaValorBagagem() {
        return this.valorPassagem * this.taxaBagagem;
    }
}
