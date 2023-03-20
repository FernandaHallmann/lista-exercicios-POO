package com.mycompany.campeonatofutebol;

/**
 *
 * @author Ferna
 */
public class TimeFutebol {
    public String nomeTime;
    public String corTime;
    public String tecnico;
    public int titulos;
    public Jogador jogadorTime;

    public TimeFutebol (String nome, String cor, String tecn, int ttls, Jogador jogador) {
        nomeTime = nome;
        corTime = cor;
        tecnico = tecn;
        titulos = ttls;
        jogadorTime = jogador;
    }
    
    public Jogador getJogador () {
        return jogadorTime;
    }
    
}
