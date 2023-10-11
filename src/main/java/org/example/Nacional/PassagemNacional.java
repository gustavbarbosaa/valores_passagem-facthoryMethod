package org.example.Nacional;

import org.example.Passagem;

public class PassagemNacional extends Passagem {
    public PassagemNacional(double valorPassagem) {
        super(valorPassagem);
        setTaxaEmbarque(0.05);
        setTaxaBagagem(0.03);
    }
}
