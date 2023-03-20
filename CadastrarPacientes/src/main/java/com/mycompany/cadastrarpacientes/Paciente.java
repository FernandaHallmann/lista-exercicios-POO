package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Ferna
 */
public class Paciente {
    private String nomePaciente;
    private int idadePaciente;
    private double pesoPaciente;
    private boolean deficiente;
    private Sintoma sintoma;
    
    public Paciente (String nome, int idade, double peso, boolean defic) {
        nomePaciente = nome;
        idadePaciente = idade;
        pesoPaciente = peso;
        deficiente = defic;
    }
    
    public void setSintoma (Sintoma sint) {
        sintoma = sint;
    }
    
    public Sintoma getSintoma () {
        return sintoma;
    }
    
}
