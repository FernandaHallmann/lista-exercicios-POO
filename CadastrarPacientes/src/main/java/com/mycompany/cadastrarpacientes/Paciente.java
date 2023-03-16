package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Ferna
 */
public class Paciente {
    public String nomePaciente;
    public String cpfPaciente;
    public int idadePaciente;
    public double pesoPaciente;
    public boolean deficiente;
    
    public Paciente (String nome, String cpf, int idade, double peso, boolean defic) {
        nomePaciente = nome;
        cpfPaciente = cpf;
        idadePaciente = idade;
        pesoPaciente = peso;
        deficiente = defic;
    }
    
    public String getInfoClientes () {
        return "Nome do paciente: " + nomePaciente + "\nCPF do paciente: " + cpfPaciente + "\nIdade do paciente: " + idadePaciente + "\nPeso do paciente: " + pesoPaciente + "\nDeficiente: " + deficiente;
    }
    
}
