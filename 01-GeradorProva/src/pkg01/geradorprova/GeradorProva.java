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
            String nome;
            int numObj,numDisc;
            Scanner leitor = new Scanner(System.in);
            
            System.out.println("Digite o nome da disciplina: ");
            nome = leitor.nextLine();
            Prova p1 = new Prova(nome); //cria a prova p1
            
            System.out.println("Digite o local da prova: ");
            p1.setLocal (leitor.nextLine());
            
            System.out.println("Digite a data da prova: ");
            p1.setData (leitor.nextLine());
            
            System.out.println("Digite o peso da prova: ");
            p1.setPeso (leitor.nextInt());
            
            
            System.out.println("Digite o numero de questões discursivas: ");
            numDisc = leitor.nextInt();
            leitor.nextLine();
            System.out.println("");
            
            
            
            
            Discursiva[] vetorPerguntaDiscursiva;
            vetorPerguntaDiscursiva = new Discursiva[numDisc];
            for(int i=0;i<numDisc;i++)
            {
            /*Discursiva[]*/ vetorPerguntaDiscursiva[i] = new Discursiva();
            
            System.out.println("Digite a pergunta discursiva: ");
            vetorPerguntaDiscursiva[i].setPergunta(leitor.nextLine());
            System.out.println();
            
            System.out.println("Digite o peso da pergunta: ");
            vetorPerguntaDiscursiva[i].setPeso(leitor.nextInt());
            leitor.nextLine();
            System.out.println("");
            
            System.out.println("Digite o criterio de avaliacao da pergunta: ");
            vetorPerguntaDiscursiva[i].setCriterios(leitor.nextLine());
            
            }
           p1.setDis(vetorPerguntaDiscursiva);
         
        
            
            System.out.println("Digite o numero de questões objetivas: ");
            numObj = leitor.nextInt();
            leitor.nextLine();
            System.out.println("");
            Objetiva[] vetorPerguntaObjetiva = new Objetiva[numObj];
            String[] alternativas = new String[5];
            
            for (int i=0; i<numObj;i++)
            {
                vetorPerguntaObjetiva[i] = new Objetiva();   
            
                System.out.println("Digite o peso da pergunta objetiva: ");
                vetorPerguntaObjetiva[i].setPeso(leitor.nextInt());
                System.out.println();
                
                System.out.println("Digite a pergunta objetiva: ");
                vetorPerguntaObjetiva[i].setPergunta(leitor.nextLine());
                System.out.println();
                
                
                System.out.println("Digite as 5 alternativas: ");
                
                for (int j=0;j<5;j++){
                
                alternativas[j] = leitor.nextLine();
               
                  }
                vetorPerguntaObjetiva[i].setOpcoes(alternativas);
                System.out.println("Digite a alternativa correta: ");
                    
                vetorPerguntaObjetiva[i].setRespostaCorreta(leitor.nextInt());
                System.out.println("\n");
                
                
            }
            p1.setObj(vetorPerguntaObjetiva);
            System.out.println(p1.obtemProvaImpressao());
            
            
            
                p1.setObj(vetorPerguntaObjetiva);
            
           
            
             
            
            
           
            
            
            //forma didatica de printar
            //String retornoDoMetodo = x.obtemDetalhe();
            //System.out.println(retornoDoMetodo);
           
            //ou forma resumida
        
            /*System.out.println(p1.obtemDetalhe());
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
   */                
            
        }
    }
