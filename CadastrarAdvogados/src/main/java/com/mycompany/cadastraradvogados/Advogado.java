package com.mycompany.cadastraradvogados;

/**
 *
 * @author Ferna
 */
public class Advogado {
    public String nome;
    public int idade;
    private int cpf;
    private int oab;
    private String telefone;
    private String email;
    private String area;
    
    public Advogado (String nomeAdv, int idadeAdv) {
        nome = nomeAdv;
        idade = idadeAdv;
    }
    
    public void setInfoAdv (int cpff, int oabb, String tel, String mail, String areaa) {
        cpf = cpff;
        oab = oabb;
        telefone = tel;
        email = mail;
        area = areaa;
    }
    
    public String getInfoAdv () {
        return "\nNome do Advogado: " + nome
                + "\nIdade: " + idade
                + "\nCPF: " + cpf
                + "\nNúmero OAB: " + oab
                + "\nTelefone: " + telefone
                + "\nE-mail: " + email
                + "\nÁrea de atuação: " + area;
    }
}
