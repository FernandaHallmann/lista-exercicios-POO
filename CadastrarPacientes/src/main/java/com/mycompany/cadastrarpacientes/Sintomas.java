package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Ferna
 */
public class Sintomas {
    public String sintoma;
    public boolean dorLocalizada;
    public int diasComSintoma;
    public double riscoInfeccao;
    public char tipoSanguineo;

    public Sintomas (String sint, boolean dorLoc, int dias, double risco, char tipoSangue) {
        sintoma = sint;
        dorLocalizada = dorLoc;
        diasComSintoma = dias;
        riscoInfeccao = risco;
        tipoSanguineo = tipoSangue;
    }

    public String getInfoCadastro () {
        return "Sintoma informado: " + sintoma + "\nDor localizada: " + dorLocalizada + "\nDias com sintoma: " + diasComSintoma + "\nRisco de infeccao: " + riscoInfeccao + "\nTipo sanguíneo: " + tipoSanguineo + "\n";
    }

}
