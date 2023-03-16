package com.mycompany.cadastraradvogados;

/**
 *
 * @author Ferna
 */
public class CadastrarAdvogados {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado("Ademir Veiga", 50);
        adv1.setInfoAdv(123678910, 88554, "(45)998752256", "veiga@gmail.com", "Crime");
        
        Advogado adv2 = new Advogado("Ulisses", 23);
        adv2.setInfoAdv(1236534510, 8859, "(45)998658856", "ulisses@gmail.com", "Civil");
        
        Advogado adv3 = new Advogado("Bernadete", 54);
        adv3.setInfoAdv(1236712910, 8454, "(45)998752256", "bebe@gmail.com", "Defesa");
        
        Advogado adv4 = new Advogado("Mari", 23);
        adv4.setInfoAdv(12128910, 8004, "(45)998752256", "mari@gmail.com", "Crime");
        
        Advogado adv5 = new Advogado("Antonieta", 43);
        adv5.setInfoAdv(1236123910, 0054, "(45)998752256", "ant@gmail.com", "Assassinatos");
        
        Advogado adv6 = new Advogado("Jonas", 23);
        adv6.setInfoAdv(1236425910, 88894, "(45)998752256", "jonas@gmail.com", "Crime");
        
        Advogado adv7 = new Advogado("Gustavo", 34);
        adv7.setInfoAdv(123453910, 84214, "(45)998752256", "gust@gmail.com", "Civil");
        
        Advogado adv8 = new Advogado("Lorena", 89);
        adv8.setInfoAdv(1245238910, 7754, "(45)998752256", "lolorena@gmail.com", "Acidentes");
        
        System.out.println("Nome advogado: " + adv6.nome + "Idade: " + adv6.idade + adv6.getInfoAdv());
        System.out.println("Nome advogado: " + adv7.nome + "Idade: " + adv7.idade + adv7.getInfoAdv());
        System.out.println("Nome advogado: " + adv8.nome + "Idade: " + adv8.idade + adv8.getInfoAdv());
      
    }
}
