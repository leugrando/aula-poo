/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 6514995
 */
public class Prova {

    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    //private Discursiva[] dis;
    //private Objetiva[] obj;
    private ArrayList<Questao> q;

    public Prova(String nomeDaProva) {
        this.nomeDisciplina = nomeDaProva;

    }

    public String obtemDetalhe() {
        String retorno = "";
        retorno += "###########################################INSTITUICAO:" + this.getLocal() + "####################################### " + "\r\n";
        retorno += "Disciplina: " + this.getNomeDisciplina() + "  \r\n";
        retorno += "Data: " + this.getData() + "\r\n";
        retorno += "Peso: " + this.getPeso() + "\r\n";

        for (int i = 0; i < q.size(); i++) {
//        retorno += "Questao: " +dis[i].getPergunta()+ "\n";
//        retorno += "Peso da questao: " +dis[i].getPeso()+ "\n";
//        retorno += "Criterio de avaliacao: " +dis[i].getCriterios()+"\n\n";
            retorno += this.q.get(i).retornaQuestao();
        }
        /*
        for (Objetiva obj1 : this.obj) {
//        retorno += "Questao: " +obj[i].getPergunta()+ "\n";
//        retorno += "Peso da questao: " +obj[i].getPeso()+ "\n";
//        retorno += "Opcoes: " +Arrays.toString(obj[i].getOpcoes())+"\n";
//        retorno += "Alternativa correta: " +obj[i].getRespostaCorreta()+"\n\n";
//         foi passado direto pra discursiva, agora a responsabilidade de printar esta la
            retorno += obj1.retornaQuestao();
        }*/
        return retorno;

    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the dis
     */
    /**
     * @param obj the obj to set
     */
    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @param dis the dis to set
     */
    /**
     * @return the q
     */
    public ArrayList<Questao> getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(ArrayList<Questao> q) {
        this.q = q;
    }

    /**
     * @return the q
     */
    /**
     * @return the dis
     */
}
