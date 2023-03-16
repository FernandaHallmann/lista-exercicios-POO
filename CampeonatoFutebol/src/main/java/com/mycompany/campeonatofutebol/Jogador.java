package com.mycompany.campeonatofutebol;

/**
 *
 * @author Ferna
 */
public class Jogador {
    private String nomeJogador;
    private int numJogador;
    private String posicao;
    private String time;
    private int idade;
    
    public void reserva () {
        if (idade >= 30) {
            System.out.println("Jogador reserva");
        } else {
            System.out.println("Jogador escalado");
        }
    }
    
    public void substituicao () {
        System.out.println("O jogador " + nomeJogador + " " + numJogador + " está sendo substituído");
    }
    
    public void falta () {
        System.out.println("O jogador " + nomeJogador + " cartão amarelo");
    }
    
    public Jogador (String nome, int num, String posi, String tm, int idd) {
        nomeJogador = nome;
        numJogador = num;
        posicao = posi;
        time = tm;
        idade = idd;
    }
}
