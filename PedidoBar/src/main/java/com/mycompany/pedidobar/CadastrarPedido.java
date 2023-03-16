package com.mycompany.pedidobar;

/**
 *
 * @author Ferna
 */
public class CadastrarPedido {
    private String nomeCliente;
    private int numMesa;
    private String data;
    private String pedido;
    private double valor;
    
    public void setNomeCliente (String nome) {
        nomeCliente = nome;
    }
    
    public void setNumMesa (int mesa) {
        numMesa = mesa;
    }
    
    public void setData (String dt) {
        data = dt;
    }
    
    public void setPedido (String pdd) {
        pedido = pdd;
    }
    
    public void setValor (double vlr) {
        valor = vlr;
    }
    
    public double getValor() {
        return valor;
    }
}
