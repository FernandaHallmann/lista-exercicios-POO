package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Ferna
 */
public class CadastrarPacientes {

    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente("Ana", "123.456.789-10", 20, 67, false);
        System.out.println(paciente1.getInfoClientes());
        Sintomas sintoma1 = new Sintomas("Tosse", false, 3, 3.5, 'A');
        System.out.println(sintoma1.getInfoCadastro());
        
        Paciente paciente2 = new Paciente("Breno", "987.654.321-01", 45, 70, false);
        System.out.println(paciente2.getInfoClientes());
        Sintomas sintoma2 = new Sintomas("Febre e Vomito", false, 1, 8.7, 'B');
        System.out.println(sintoma2.getInfoCadastro());
        
        Paciente paciente3 = new Paciente("Valdineia", "222.333.444-55", 12, 37, false);
        System.out.println(paciente3.getInfoClientes());
        Sintomas sintoma3 = new Sintomas("Dor de cabeça", true, 9, 0.3, 'B');
        System.out.println(sintoma3.getInfoCadastro());
        
        Paciente paciente4 = new Paciente("Flávia", "777.888.999-11", 76, 88, true);
        System.out.println(paciente4.getInfoClientes());
        Sintomas sintoma4 = new Sintomas("Gripe", true, 16, 10.5, 'O');
        System.out.println(sintoma4.getInfoCadastro());
        
        Paciente paciente5 = new Paciente("Luiza", "252.252.255-52", 44, 67, true);
        System.out.println(paciente5.getInfoClientes());
        Sintomas sintoma5 = new Sintomas("Dor nas costas", true, 34, 2.4, 'A');
        System.out.println(sintoma5.getInfoCadastro());
        
        Paciente paciente6 = new Paciente("Guilherme", "787.888.547-51", 22, 55, false);
        System.out.println(paciente6.getInfoClientes());
        Sintomas sintoma6 = new Sintomas("Pedra no rim", true, 40, 17.8, 'A');
        System.out.println(sintoma6.getInfoCadastro());

    }
}
