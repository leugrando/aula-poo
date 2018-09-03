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

public class Prova {

    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    private Discursiva dis;
    private int numDisc;
    private int numObj;
    private Objetiva obj ;
            
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
    public String infoDiscursiva() {
        String retorno = "";
        retorno += 
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
    public Discursiva getDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(Discursiva dis) {
        this.dis = dis;
    }

    /**
     * @return the obj
     */
    public Objetiva getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Objetiva obj) {
        this.obj = obj;
    }

    /**
     * @return the numdisc
     */
    public int getNumDisc() {
        return numDisc;
    }

    /**
     * @param numDisc the numdisc to set
     */
    public void setNumDisc(int numDisc) {
        this.numDisc = numDisc;
    }

    /**
     * @return the numobj
     */
    public int getNumObj() {
        return numObj;
    }

    /**
     * @param numobj the numobj to set
     */
    public void setNumObj(int numObj) {
        this.numObj = numObj;
    }
    
    
    
}


