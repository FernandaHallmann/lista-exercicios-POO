package com.mycompany.cadastraradvogados;

/**
 *
 * @author Ferna
 */
public class CadastrarAdvogados {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado("Ademir Veiga", 50);
        adv1.setInfoAdv(123678910, 88554, "(45)998752256", "veiga@gmail.com", "Crime");
        if (adv1.nome == null || adv1.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv2 = new Advogado("Ulisses", 23);
        adv2.setInfoAdv(1236534510, 8859, "(45)998658856", "ulisses@gmail.com", "Civil");
        if (adv2.nome == null || adv2.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv3 = new Advogado("Bernadete", 54);
        adv3.setInfoAdv(1236712910, 8454, "(45)998752256", "bebe@gmail.com", "Defesa");
        if (adv3.nome == null || adv3.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv4 = new Advogado("Mari", 23);
        adv4.setInfoAdv(12128910, 8004, "(45)998752256", "mari@gmail.com", "Crime");
        if (adv4.nome == null || adv4.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv5 = new Advogado("Antonieta", 43);
        adv5.setInfoAdv(1236123910, 0054, "(45)998752256", "ant@gmail.com", "Assassinatos");
        if (adv5.nome == null || adv5.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv6 = new Advogado("Jonas", 23);
        adv6.setInfoAdv(1236425910, 88894, "(45)998752256", "jonas@gmail.com", "Crime");
        if (adv6.nome == null || adv6.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv7 = new Advogado("Gustavo", 34);
        adv7.setInfoAdv(123453910, 84214, "(45)998752256", "gust@gmail.com", "Civil");
        if (adv7.nome == null || adv7.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        Advogado adv8 = new Advogado("Lorena", 89);
        adv8.setInfoAdv(1245238910, 7754, "(45)998752256", "lolorena@gmail.com", "Acidentes");
        if (adv8.nome == null || adv8.idade == 0) {
            System.out.println("Preencha o nome e/ou a idade");
        }
        
        System.out.println(adv6.getInfoAdv());
        System.out.println(adv7.getInfoAdv());
        System.out.println(adv8.getInfoAdv());
      
    }
}
