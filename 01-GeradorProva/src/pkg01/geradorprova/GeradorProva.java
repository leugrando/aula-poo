/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;
import java.util.Scanner;
/**
 *
 * @author 6514995
 */
public class GeradorProva {

        public static void main(String[] args) {
            String nome,local,data;
            int peso, disc, obj;
            Scanner leitor = new Scanner(System.in);
            //System.out.println("Digite seu peso:");
            //p = leitor.nextFloat();
            
            System.out.println("Digite o nome da disciplina: ");
            nome = leitor.nextLine();
            Prova p1 = new Prova(nome); //cria a prova p1
            
            System.out.println("Digite o local da prova: ");
            local = leitor.nextLine();
            p1.setLocal (local);
            
            System.out.println("Digite a data da prova: ");
            data = leitor.nextLine();
            p1.setData (data);
            
            System.out.println("Digite o peso da prova: ");
            peso = leitor.nextInt();
            p1.setPeso (peso);
            
            System.out.println("Digite o numero de questões discursivas: ");
            disc = leitor.nextInt();
            p1.setNumDisc (disc);
            
            System.out.println(p1.infos());
            
            
            
            System.out.println("Digite o numero de questões discursivas: ");
            obg = leitor.nextInt();
            p1.setNumObj (obj);
            //forma didatica de printar
            //String retornoDoMetodo = x.obtemDetalhe();
            //System.out.println(retornoDoMetodo);
           
            //ou forma resumida
        
            System.out.println(p1.obtemDetalhe());
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
