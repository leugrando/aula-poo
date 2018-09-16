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

        System.out.println("Digite a data da prova: "); //FALTA TRYCATCH DATA
        p1.setData(leitor.nextLine());

        boolean verdade = true;
        while (verdade == true) {

            try {
                System.out.println("Digite o peso da prova: ");
                int pesoProva;
                pesoProva = leitor.nextInt();
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
        System.out.println("Digite o tipo de questao que deseja adicionar: ");
        do {
            verdade = true;
            while (verdade == true) {
                System.out.println("Digite D para adicionar Discursiva, e O para Objetiva.");
                opcaoDO = leitor.nextLine();

                try {
                    if ("D".equals(opcaoDO) || "d".equals(opcaoDO) || "O".equals(opcaoDO) || "o".equals(opcaoDO)) {
                        System.out.println("IGUAL");
                        verdade = false;
                    } else {
                        System.out.println("DIFERENTE");
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

                    while (verdade == true) {
                        try {
                            System.out.println("Digite o peso da pergunta: ");
                            int pesoDis;
                            pesoDis = leitor.nextInt();
                            leitor.nextLine();
                            System.out.println("");
                            vetorPerguntaDiscursiva[i].setPeso(pesoDis);

                            if (pesoDis > 0 && pesoDis < 6) {
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

                    System.out.println("Digite o criterio de avaliacao da pergunta: ");
                    vetorPerguntaDiscursiva[i].setCriterios(leitor.nextLine());

                }
                p1.setDis(vetorPerguntaDiscursiva);

            } else {

                System.out.println("Digite o numero de questões objetivas: ");
                numObj = leitor.nextInt();
                leitor.nextLine();
                System.out.println("");
                Objetiva[] vetorPerguntaObjetiva = new Objetiva[numObj];
                String[] alternativas = new String[5];

                for (int i = 0; i < numObj; i++) {
                    vetorPerguntaObjetiva[i] = new Objetiva();
                    while (verdade == true) {
                        try {
                            System.out.println("Digite o peso da pergunta objetiva: ");
                            int pesoObj;
                            pesoObj = leitor.nextInt();
                            leitor.nextLine();
                            System.out.println("");
                            vetorPerguntaObjetiva[i].setPeso(pesoObj);
                            if (pesoObj > 0 && pesoObj < 6) {
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
                    vetorPerguntaObjetiva[i].setPergunta(leitor.nextLine());
                    System.out.println();

                    System.out.println("Digite as 5 alternativas: ");

                    for (int j = 0; j < 5; j++) {

                        alternativas[j] = leitor.nextLine();

                    }

                    vetorPerguntaObjetiva[i].setOpcoes(alternativas);

                    verdade = true;
                    int correta = 0;
                    while (verdade == true) {

                        try {
                            System.out.println("Digite o numero da alternativa correta: ");
                            correta = leitor.nextInt();
                            leitor.nextLine();
                            System.out.println("");

                            vetorPerguntaObjetiva[i].setRespostaCorreta(correta);
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
                    p1.setObj(vetorPerguntaObjetiva);
                }
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
                System.out.println(p1.obtemDetalhe());
            }

        } while (verifica == 0);

        //System.exit(1);
    }
}
