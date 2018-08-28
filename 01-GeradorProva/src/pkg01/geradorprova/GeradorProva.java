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
public class GeradorProva {

        public static void main(String[] args) {
            Prova x = new Prova("POO");
           
            x.setLocal ("LAB 3 - BLOCO 06");
            x.setData ("2018-08-28");
  
            //forma didatica de printar
            //String retornoDoMetodo = x.obtemDetalhe();
            //System.out.println(retornoDoMetodo);
           
            //ou forma resumida
        
            System.out.println(x.obtemDetalhe());
            Discursiva d = new Discursiva();
            d.setPergunta("Qual e seu nome?");
            d.setPeso(0);
            d.setCriterios("Saber o proprio nome");
            Objetiva o = new Objetiva();
            o.setPergunta("Qual o melhor time do Brasil?");
            o.setPeso(2);
            String[] opcoes = new String[5];
            opcoes[0] = "Gremio";
            opcoes[1] = "Inter";
            opcoes[2] = "Flamengo";
            opcoes[3] = "Corinthians";
            opcoes[4] = "Sao Paulo";
            o.setOpcoes(opcoes);
            o.setRespostaCorreta(3);
                   
            
        }
    }
