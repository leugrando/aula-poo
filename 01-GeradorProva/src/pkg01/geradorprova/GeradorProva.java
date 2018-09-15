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
        int numObj, numDisc;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina: ");
        nome = leitor.nextLine();
        Prova p1 = new Prova(nome); //cria a prova p1

        System.out.println("Digite o local da prova: ");
        p1.setLocal(leitor.nextLine());

        System.out.println("Digite a data da prova: ");
        p1.setData(leitor.nextLine());
     //   int verif1 =0;
     //       do{
      //      try{
        System.out.println("Digite o peso da prova: ");
        p1.setPeso(leitor.nextInt());
     
     //   if (leitor.nextInt()<0){
       //     throw new Exception();
        //}
        leitor.nextLine();  
        
        System.out.println("");
       //     }catch(Exception e){
                System.out.println("ERRO");
         //       verif1 = 1;
       //     }
    //}while(verif1 == 1);
        
    System.out.println("Digite o tipo de questao que deseja adicionar: ");
    System.out.println("Digite D para adicionar Discursiva, e O para Objetiva.");
        
    System.out.println("Digite o numero de questões discursivas: ");
        numDisc = leitor.nextInt();
        leitor.nextLine();
        System.out.println("");

        Discursiva[] vetorPerguntaDiscursiva;
        vetorPerguntaDiscursiva = new Discursiva[numDisc];
        for (int i = 0; i < numDisc; i++) {
            vetorPerguntaDiscursiva[i] = new Discursiva();

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

        for (int i = 0; i < numObj; i++) {
            vetorPerguntaObjetiva[i] = new Objetiva();

            System.out.println("Digite o peso da pergunta objetiva: ");
            vetorPerguntaObjetiva[i].setPeso(leitor.nextInt());
            leitor.nextLine();
            System.out.println("");

            System.out.println("Digite a pergunta objetiva: ");
            vetorPerguntaObjetiva[i].setPergunta(leitor.nextLine());
            System.out.println();

            System.out.println("Digite as 5 alternativas: ");

            for (int j = 0; j < 5; j++) {

                alternativas[j] = leitor.nextLine();

            }

            vetorPerguntaObjetiva[i].setOpcoes(alternativas);
            System.out.println("Digite o numero da alternativa correta: ");
            int verif = 0;
            do{
                
            try{
                
            vetorPerguntaObjetiva[i].setRespostaCorreta(leitor.nextInt());
            if(leitor.nextInt()>5 || leitor.nextInt()<0)
            {
                throw new Exception();
            }
            }catch(Exception e){
                verif = 1;
            }
            }while(verif==1);

            System.out.println("\n");

        }
        p1.setObj(vetorPerguntaObjetiva);
        p1.setDis(vetorPerguntaDiscursiva);

        System.out.println(p1.obtemDetalhe());
        
    }
}
