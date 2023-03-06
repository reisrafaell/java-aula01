package br.com.calculadora.server.CalculadoraService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculadora {
    private double valor1 , valor2;
    public double soma(){
        return valor1 + valor2;
    }
}
