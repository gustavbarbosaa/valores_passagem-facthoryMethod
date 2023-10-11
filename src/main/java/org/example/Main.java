package org.example;

import org.example.Internacional.PassagemInternacional;
import org.example.Nacional.PassagemNacional;

public class Main {
    public static void main(String[] args) {

        System.out.println("Passagem Nacional");
        var passagemNacional = new PassagemNacional(100);
        System.out.print("Valor total: ");
        System.out.println(passagemNacional.getValorPassagem()
                + passagemNacional.calculaValorBagagem() + passagemNacional.calculaValorComEmbarque()
        );

        System.out.println("=======================================================");

        System.out.println("Passagem Internacional");
        var passagemInternacional = new PassagemInternacional(100);
        System.out.print("Valor total: ");
        System.out.println(passagemInternacional.getValorPassagem()
                + passagemInternacional.calculaValorBagagem() + passagemInternacional.calculaValorComEmbarque()
        );
    }
}