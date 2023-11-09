/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torredehanoi; // Declaração do pacote onde a classe está localizada
import javax.swing.JOptionPane; // Importação da classe JOptionPane para interação com o usuário
/**
 *
 * @author Nyta
 */
public class TorreDeHanoi {

    public static void main(String[] args) {      
        FuncionamentoTorre func = new FuncionamentoTorre(); // Criação de uma instância da classe FuncionamentoTorre
        
        // Usando o JOptionPane para obter a quantidade de discos
        int quantia = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantia de discos: "));
        // Solicita ao usuário que insira a quantidade de discos e armazena o valor em 'quantia'
        
        long tempoInicial = System.currentTimeMillis(); // Registra o tempo inicial da execução
        
        // Usando o método
        long movimentos = func.moveDisco(quantia, 'A', 'B', 'C');
        // Chama o método moveDisco da instância func, passando a quantidade de discos e as torres iniciais e de destino
        JOptionPane.showMessageDialog(null, "Quantia de movimentos: " + movimentos); // Exibe a quantidade de movimentos realizados
        
        long tempoFinal = System.currentTimeMillis(); // Registra o tempo final da execução
        long tempoPercorrido = tempoFinal - tempoInicial; // Calcula o tempo decorrido em milissegundos
        
        long horas = (tempoPercorrido / (1000 * 60 * 60)) % 24; // Calcula as horas
        long minutos = (tempoPercorrido / (1000 * 60)) % 60; // Calcula os minutos
        long segundos = (tempoPercorrido / 1000) % 60; // Calcula os segundos
        long milisegundos = tempoPercorrido % 1000; // Calcula os milissegundos
        
        String tempoFormatado = String.format("%02d:%02d:%02d:%03d", horas, minutos, segundos, milisegundos);
        // Formata o tempo em um formato legível (HH:MM:SS:SSS)
        
        JOptionPane.showMessageDialog(null, "Tempo executando: " + tempoFormatado); // Exibe o tempo decorrido formatado
    }
}