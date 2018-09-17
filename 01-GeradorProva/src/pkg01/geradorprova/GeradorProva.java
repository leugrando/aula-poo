/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 6514995
 */
public class GeradorProva {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome, nomeArquivo;
        int numObj, numDisc;

        System.out.println("Digite o nome da disciplina: ");
        nome = leitor.nextLine();
        Prova p1 = new Prova(nome); //cria a prova p1

        System.out.println("Digite o local da prova: ");
        p1.setLocal(leitor.nextLine());

        System.out.println("Digite a data da prova: "); //FALTA TRYCATCH DATA
        p1.setData(leitor.nextLine());

        boolean verdade = true;
        while (verdade == true) {

            try {

                System.out.println("Digite o peso da prova: ");
                while (!leitor.hasNextInt()) {
                    System.out.println("NUMERO INVALIDO !!! Digite novamente: ");
                    leitor.nextLine();

                }
                int pesoProva = leitor.nextInt();
                //System.out.println("TESTE: "+pesoProva);
                p1.setPeso(pesoProva);

                if (pesoProva <= 0) {

                    throw new Exception();
                    // break;

                } else {
                    verdade = false;
                }
                leitor.nextLine(); //limpar buffer
                System.out.println("");
            } catch (Exception e) {
                System.out.println("ERRO");

                verdade = true;

            }
        }

        String opcaoDO = "", addQuestao = "";

        int verifica = 0;
        ArrayList<Questao> q = new ArrayList<Questao>();
        System.out.println("Digite o tipo de questao que deseja adicionar: ");
        do {
            verdade = true;
            while (verdade == true) {
                System.out.println("Digite D para adicionar Discursiva, e O para Objetiva.");
                opcaoDO = leitor.nextLine();

                try {
                    if ("D".equals(opcaoDO) || "d".equals(opcaoDO) || "O".equals(opcaoDO) || "o".equals(opcaoDO)) {
                        //System.out.println("IGUAL");
                        verdade = false;
                    } else {
                        //System.out.println("DIFERENTE");
                        verdade = true;
                        throw new Exception();
                        //break;
                    }

                } catch (Exception e) {
                    System.out.println("Erro!!");
                    verdade = true;
                }
            }
            verdade = true;
            if ("D".equals(opcaoDO) || "d".equals(opcaoDO)) {
                /*System.out.println("Digite o numero de questões discursivas: ");
                numDisc = leitor.nextInt();
                leitor.nextLine();
                System.out.println("");
                 */
                Discursiva d = new Discursiva();
                //Discursiva[] vetorPerguntaDiscursiva;
                //vetorPerguntaDiscursiva = new Discursiva[numDisc];
                //for (int i = 0; i < numDisc; i++) {
                //  vetorPerguntaDiscursiva[i] = new Discursiva();

                System.out.println("Digite a pergunta discursiva: ");
                //vetorPerguntaDiscursiva[i].setPergunta(leitor.nextLine());
                d.setPergunta(leitor.nextLine());
                System.out.println();

                while (verdade == true) {
                    try {
                        System.out.println("Digite o peso da pergunta: ");
                        while (!leitor.hasNextInt()) {
                            System.out.println("NUMERO INVALIDO !! Digite novamente: ");
                            leitor.nextLine();
                        }
                        int pesoDis = leitor.nextInt();
                        leitor.nextLine();
                        //System.out.println("");
                        //System.out.println("TESTE: "+pesoDis);
                        //vetorPerguntaDiscursiva[i].setPeso(pesoDis);

                        if (pesoDis > 0) {
                            verdade = false;
                            d.setPeso(pesoDis);
                        } else {
                            verdade = true;
                            throw new Exception();

                        }
                    } catch (Exception e) {
                        System.out.println("ERRO !");
                        verdade = true;
                    }

                }
                System.out.println("Digite o criterio de avaliacao da pergunta: ");
                //vetorPerguntaDiscursiva[i].setCriterios(leitor.nextLine());
                d.setCriterios(leitor.nextLine());

                //}
                //p1.setDis(vetorPerguntaDiscursiva);
                q.add(d);
            } else {
                Objetiva o = new Objetiva();

                String[] alternativas = new String[5];
                while (verdade == true) {
                    try {
                        System.out.println("Digite o peso da pergunta objetiva: ");
                        while (!leitor.hasNextInt()) {
                            System.out.println("NUMERO INVALIDO !!! Digite novamente: ");
                            leitor.nextLine();
                        }
                        int pesoObj = leitor.nextInt();
                        o.setPeso(pesoObj);
                        leitor.nextLine();
                        System.out.println("");
                        //System.out.println("TESTE: "+pesoObj);

                        if (pesoObj > 0) {
                            verdade = false;
                        } else {
                            verdade = true;
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.println("ERRO !");
                        verdade = true;
                    }

                }
                System.out.println("Digite a pergunta objetiva: ");
                o.setPergunta(leitor.nextLine());
                System.out.println();

                System.out.println("Digite as 5 alternativas: ");

                for (int j = 0; j < 5; j++) {

                    alternativas[j] = leitor.nextLine();

                }

                o.setOpcoes(alternativas);

                verdade = true;
                int correta = 0;
                while (verdade == true) {

                    try {
                        System.out.println("Digite o numero da alternativa correta: ");
                        correta = leitor.nextInt();
                        leitor.nextLine();
                        System.out.println("");

                        o.setRespostaCorreta(correta);
                        if (correta < 6 && correta > 0) {
                            verdade = false;
                        } else {
                            throw new Exception();
                        }

                    } catch (Exception e) {
                        System.out.println("ERRO");
                        verdade = true;
                    }
                }

                System.out.println("\n");

                q.add(o);
            }

            verdade = true;
            while (verdade == true) {
                try {
                    System.out.println("Deseja adicionar mais alguma questao? S para sim e N para nao: ");
                    addQuestao = leitor.nextLine();

                    if ("S".equals(addQuestao) || "s".equals(addQuestao) || "N".equals(addQuestao) || "n".equals(addQuestao)) {
                        verdade = false;
                    } else {
                        verdade = true;
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Caracter nao aceito. ");
                    verdade = true;

                }
            }

            if ("S".equals(addQuestao) || "s".equals(addQuestao)) {
                verifica = 0;
            } else {
                verifica = 1;
            }

        } while (verifica == 0);
        p1.setQ(q);
        System.out.println("Digite o nome do arquivo em que deseja salvar a prova: ");
        nomeArquivo = leitor.nextLine();
        System.out.println(nomeArquivo);
        //System.out.println(p1.obtemDetalhe());
        for (int i = 0; i < q.size(); i++) {
            System.out.println(q.get(i));
        }
        //System.exit(0);
    }

}
