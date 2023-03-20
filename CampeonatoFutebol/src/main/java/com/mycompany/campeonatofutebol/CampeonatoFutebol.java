package com.mycompany.campeonatofutebol;

/**
 *
 * @author Ferna
 */
public class CampeonatoFutebol {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("José Urubu", 12, "Goleiro", "Internacional", 19);
        Jogador jogador2 = new Jogador("Luanzinho", 10, "Atacante", "Palmeiras", 17);
        Jogador jogador3 = new Jogador("Bananinha", 5, "Zagueiro", "Internacional", 22);
        Jogador jogador4 = new Jogador("Otavio Luiz", 8, "Lateral", "Internacional", 30);
        Jogador jogador5 = new Jogador("Marco Antonio", 18, "Volante", "Palmeiras", 26);
        
        TimeFutebol time1 = new TimeFutebol("Palmeiras", "Verde", "Tite", 2, jogador1);
        if (time1.getJogador() != null) {
            System.out.println("Jogador está cadastrado no " + time1.nomeTime);
        }
        
        TimeFutebol time2 = new TimeFutebol("Internacional", "Vermelha", "Murilinho", 4, jogador2);
        if (time2.getJogador() != null) {
            System.out.println("Jogador está cadastrado no " + time2.nomeTime);
        }
        
        System.out.println("Jogo de hoje é " + time1.nomeTime + " com a camisa " + time1.corTime +  " vs " + time2.nomeTime + " com a camisa " + time2.corTime);
    }
}
