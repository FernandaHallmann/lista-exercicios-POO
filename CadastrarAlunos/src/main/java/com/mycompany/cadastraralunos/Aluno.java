package com.mycompany.cadastraralunos;

/**
 *
 * @author Ferna
 */
public class Aluno {
    private String nome;
    private int ra;
    private char sexo;
    private double nota;
    private boolean pcd;
    
    public Aluno (String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    public void setSexo (char sexo) {
        this.sexo = sexo;
    }
    
    public void setNota (double nota) {
        this.nota = nota;
    }
    
    public void setPcd (boolean pcd) {
        this.pcd = pcd;
    }
    
    public String getNome() {
        return nome;
    }
}
