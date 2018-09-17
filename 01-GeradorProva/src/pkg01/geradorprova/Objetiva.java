/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author 6514995
 */
final class Objetiva extends Questao {

    private String[] opcoes; //inicializa vetor no construtor

    private int RespostaCorreta;

    public Objetiva() {
        this.opcoes = new String[5];
    }

    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    /**
     * @return the RespostaCOrreta
     */
    public int getRespostaCorreta() {
        return RespostaCorreta;
    }

    /**
     * @param RespostaCorreta the RespostaCOrreta to set
     */
    public void setRespostaCorreta(int RespostaCorreta) {
        this.RespostaCorreta = RespostaCorreta;
    }

    @Override

    public String retornaQuestao() {
        String retorno = "";
        String[] auxiliar = new String[5];
        auxiliar = this.getOpcoes();

        retorno += "Questao: (Peso " + this.getPeso() + ") " + this.getPergunta() + "\r\n";

        retorno += "a) " + auxiliar[0] + "\r\n";
        retorno += "b) " + auxiliar[1] + "\r\n";
        retorno += "c) " + auxiliar[2] + "\r\n";
        retorno += "d) " + auxiliar[3] + "\r\n";
        retorno += "e) " + auxiliar[4] + "\r\n";

        retorno += "Alternativa correta: " + this.getRespostaCorreta() + "\r\n\r\n";
        return retorno;
    }

}
