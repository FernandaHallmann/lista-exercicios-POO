package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Ferna
 */
public class Sintoma {
    public String sintoma;
    public boolean dorLocalizada;
    public int intensidade;
    public double temperatura;
    public char gravidade;

    public Sintoma (String sint, boolean dorLoc, int intens, double temp, char grav) {
        sintoma = sint;
        dorLocalizada = dorLoc;
        intensidade = intens;
        temperatura = temp;
        gravidade = grav;
    }

    public String getInfoCadastro () {
        return "\nSintoma informado: " + sintoma + "\nDor localizada: " + dorLocalizada + "\nIntensidade da dor: " + intensidade + "\nTemperatura: " + temperatura + "\nGravidade: " + gravidade;
    }

}
