package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Ferna
 */
public class CadastrarBicicletas {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta("Caloi", "Modelo Ultra", "China");
        bike1.setmarchaAro(6, 20);
        bike1.setcorPreco("Preta", 1239.9);
        
        Bicicleta bike2 = new Bicicleta("Sense", "Modelo Comum", "Brasil");
        bike2.setmarchaAro(5, 21);
        bike2.setcorPreco("Preta", 889.9);
        
        Bicicleta bike3 = new Bicicleta("Oggi", "Modelo Clássico", "Inglaterra");
        bike3.setmarchaAro(7, 19);
        bike3.setcorPreco("Preta", 559.5);
        
        Bicicleta bike4 = new Bicicleta("Focus", "Modelo Novo", "Marrocos");
        bike4.setmarchaAro(4, 22);
        bike4.setcorPreco("Preta", 1669.8);
        
        System.out.println(bike1.getMarca());
        System.out.println(bike1.getInfos());
        System.out.println(bike2.getMarca());
        System.out.println(bike2.getInfos());
        
    }
}
