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
final class Discursiva extends Questao {

    private String criterios;

    /**
     * @return the criterios
     */
    public String getCriterios() {
        return criterios;
    }

    /**
     * @param criterios the criterios to set
     */
    public void setCriterios(String criterios) {
        this.criterios = criterios;
    }

    @Override
    public String retornaQuestao() {
        String retorno = "";

        retorno += "Questao 1 (Peso " + this.getPeso() + ")" + this.getPergunta() + "\r\n";
        retorno += "Resposta: ________________________________________________________________________\r\n"
                + "__________________________________________________________________________________\r\n______"
                + "____________________________________________________________________________\r\n";
        retorno += "Criterio de avaliacao: " + this.getCriterios() + "\r\n\r\n";

        return retorno;
    }

}
