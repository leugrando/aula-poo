/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

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
}
