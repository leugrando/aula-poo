/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

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
    private Discursiva[] dis;
    private Objetiva[] obj;
    private int tamDis;
    private int tamObj;

    public Prova(String nomeDaProva) {
        this.nomeDisciplina = nomeDaProva;

    }

    public String obtemDetalhe() {
        String retorno = "";
        retorno += "Nome: " + this.getNomeDisciplina() + "\n";
        retorno += "Local: " + this.getLocal() + "\n";
        retorno += "Data: " + this.getData() + "\n";
        retorno += "Peso: " + this.getPeso() + "\n";

        return retorno;

    }
    
    public String printaDiscursivas()
    {
        String retorno = "";
        for(int i=0;i<tamDis;i++){
        retorno += "Questao: " +dis[i].getPergunta()+ "\n";
        retorno += "Peso da questao: " +dis[i].getPeso()+ "\n";
        retorno += "Criterio de avaliacao: " +dis[i].getCriterios()+"\n\n";
        
        }
        return retorno;
    }
    
    public String printaObjetivas()
    {
        String retorno = "";
        for(int i=0;i<tamObj;i++){
        retorno += "Questao: " +obj[i].getPergunta()+ "\n";
        retorno += "Peso da questao: " +obj[i].getPeso()+ "\n";
        retorno += "Opcoes: " +Arrays.toString(obj[i].getOpcoes())+"\n";
        retorno += "Alternativa correta: " +obj[i].getRespostaCorreta()+"\n\n";
        
        }
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
    public Discursiva[] getDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    /**
     * @return the obj
     */
    public Objetiva[] getObj() {
        return obj;
    }

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
     * @return the tamDis
     */
    public int getTamDis() {
        return tamDis;
    }

    /**
     * @param tamDis the tamDis to set
     */
    public void setTamDis(int tamDis) {
        this.tamDis = tamDis;
    }

    /**
     * @return the tamObj
     */
    public int getTamObj() {
        return tamObj;
    }

    /**
     * @param tamObj the tamObj to set
     */
    public void setTamObj(int tamObj) {
        this.tamObj = tamObj;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(Discursiva[] dis) {
        this.dis = dis;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Objetiva[] obj) {
        this.obj = obj;
    }

    /**
     * @return the dis
     */
}
