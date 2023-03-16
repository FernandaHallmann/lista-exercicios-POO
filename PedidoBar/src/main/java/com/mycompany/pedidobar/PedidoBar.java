package com.mycompany.pedidobar;

/**
 *
 * @author Ferna
 */
public class PedidoBar {

    public static void main(String[] args) {
        
        CadastrarPedido pedido1 = new CadastrarPedido();
        pedido1.setNomeCliente("Maria");
        pedido1.setNumMesa(13);
        pedido1.setData("15/03/23");
        pedido1.setPedido("Cerveja");
        pedido1.setValor(6.5);
        
        CadastrarPedido pedido2 = new CadastrarPedido();
        pedido2.setNomeCliente("Marcos");
        pedido2.setNumMesa(7);
        pedido2.setData("15/03/23");
        pedido2.setPedido("Coxinha");
        pedido2.setValor(6);
        
        CadastrarPedido pedido3 = new CadastrarPedido();
        pedido3.setNomeCliente("Pablo");
        pedido3.setNumMesa(3);
        pedido3.setData("15/03/23");
        pedido3.setPedido("Coca lata");
        pedido3.setValor(4.9);
        
        CadastrarPedido pedido4 = new CadastrarPedido();
        pedido4.setNomeCliente("Thainara");
        pedido4.setNumMesa(11);
        pedido4.setData("15/03/23");
        pedido4.setPedido("Pão de queijo");
        pedido4.setValor(4);
        
        CadastrarPedido pedido5 = new CadastrarPedido();
        pedido5.setNomeCliente("Thainara");
        pedido5.setNumMesa(2);
        pedido5.setData("15/03/23");
        pedido5.setPedido("Pastel");
        pedido5.setValor(5);
        
        System.out.println("Total de todos os pedidos: " + (pedido1.getValor() + pedido2.getValor() + pedido3.getValor() + pedido4.getValor() + pedido5.getValor()));
    }
}
