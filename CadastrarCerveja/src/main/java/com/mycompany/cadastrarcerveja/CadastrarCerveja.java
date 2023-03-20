package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Ferna
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        Cerveja cerv1 = new Cerveja(12345);
        cerv1.setInfos("Skol", 4.5, "10/10/24", 2, 23);
        System.out.println(cerv1.getInfos());
        
        Cerveja cerv2 = new Cerveja(98765);
        cerv2.setInfos("Amstel", 3.8, "10/09/23", 1, 12);
        System.out.println(cerv2.getInfos());
        
        Cerveja cerv3 = new Cerveja(39727);
        cerv3.setInfos("Corona", 3.2, "23/05/24", 3, 19);
        System.out.println(cerv3.getInfos());
        
        Cerveja cerv4 = new Cerveja(06423);
        cerv4.setInfos("Itaipava", 4.9, "09/02/24", 1, 25);
        System.out.println(cerv4.getInfos());
        
        Cerveja cerv5 = new Cerveja(19376);
        cerv5.setInfos("Antarctica", 5.2, "13/11/23", 2, 20);
        System.out.println(cerv5.getInfos());
    }
}
