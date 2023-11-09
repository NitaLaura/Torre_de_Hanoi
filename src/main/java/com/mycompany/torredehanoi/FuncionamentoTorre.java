/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torredehanoi; // Declaração do pacote onde a classe está localizada

/**
 *
 * @author Nyta
 */
public class FuncionamentoTorre {
    public long moveDisco(int n, char torreInicial, char torreTemporaria, char torreAlvo) {
        long movimentos = 0;
        if (n == 1) {
            movimentos++;
        } else {
            movimentos += moveDisco(n - 1, torreInicial, torreAlvo, torreTemporaria);
            movimentos++;
            movimentos += moveDisco(n - 1, torreTemporaria, torreInicial, torreAlvo);
        }
        return movimentos;
    }
}