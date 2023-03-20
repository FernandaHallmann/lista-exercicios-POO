package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Ferna
 */
public class CadastrarPacientes {

    public static void main(String[] args) {
        
        Sintoma sintoma1 = new Sintoma("Dor de cabeça", true, 3, 36.2, 'D');
        Sintoma sintoma2 = new Sintoma("Dor de garganta", true, 3, 37.1, 'D');
        Sintoma sintoma3 = new Sintoma("Tosse", false, 5, 37.5, 'C');
        Sintoma sintoma4 = new Sintoma("Gripe", false, 6, 37.2, 'C');
        Sintoma sintoma5 = new Sintoma("Virose", false, 9, 38.0, 'B');
        Sintoma sintoma6 = new Sintoma("Traumatismo Craniano", true, 30, 36.8, 'A');
        
        Paciente paciente1 = new Paciente("André", 12, 48.3, false);
        paciente1.setSintoma(sintoma3);
        if (paciente1.getSintoma() != null) {
            System.out.println("Sintoma cadastrado no paciente 1");
        }
        
        Paciente paciente2 = new Paciente("Laís", 25, 58.4, false);
        paciente2.setSintoma(sintoma1);
        if (paciente2.getSintoma() != null) {
            System.out.println("Sintoma cadastrado no paciente 2");
        }
        
        Paciente paciente3 = new Paciente("Francisco", 67, 86.6, true);
        paciente3.setSintoma(sintoma4);
        if (paciente3.getSintoma() != null) {
            System.out.println("Sintoma cadastrado no paciente 3");
        }
        
        Paciente paciente4 = new Paciente("Diego", 35, 76.1, false);
        paciente4.setSintoma(sintoma6);
        if (paciente4.getSintoma() != null) {
            System.out.println("Sintoma cadastrado no paciente 4");
        }
        
        Paciente paciente5 = new Paciente("Valentina", 5, 23.5, false);
        paciente5.setSintoma(sintoma2);
        if (paciente5.getSintoma() != null) {
            System.out.println("Sintoma cadastrado no paciente 5");
        }
        
        Paciente paciente6 = new Paciente("Antonia", 49, 66.3, true);
        paciente6.setSintoma(sintoma5);
        if (paciente6.getSintoma() != null) {
            System.out.println("Sintoma cadastrado no paciente 6");
        }
        
    }
}
