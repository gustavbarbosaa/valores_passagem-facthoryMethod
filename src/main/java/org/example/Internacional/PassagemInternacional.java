package org.example.Internacional;

import org.example.Passagem;

public class PassagemInternacional extends Passagem {
    public PassagemInternacional(double valorPassagem) {
        super(valorPassagem);
        setTaxaBagagem(0.05);
        setTaxaEmbarque(0.1);
    }
}