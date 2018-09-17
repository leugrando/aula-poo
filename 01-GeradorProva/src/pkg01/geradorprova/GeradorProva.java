/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 6514995
 */
public class GeradorProva {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome, nomeArquivoProva, nomeArquivoGabarito;

        System.out.println("Digite o nome da disciplina: ");
        nome = leitor.nextLine();
        Prova p1 = new Prova(nome); //cria a prova p1

        System.out.println("Digite a instituicao: ");
        p1.setLocal(leitor.nextLine());

        System.out.println("Digite a data da prova: ");
        p1.setData(leitor.nextLine());

        boolean verdade = true; // verificacao p consistencia
        while (verdade == true) {

            try {

                System.out.println("Digite o peso da prova: ");
                while (!leitor.hasNextDouble()) { //se nao for double nao aceita
                    System.out.println("NUMERO INVALIDO !!! Digite novamente: ");
                    leitor.nextLine();

                }
                double pesoProva = leitor.nextDouble();
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
        ArrayList<Questao> q = new ArrayList<>(); // cria arraylist de questao
        System.out.println("Digite o tipo de questao que deseja adicionar: ");
        do {
            verdade = true;
            while (verdade == true) {
                System.out.println("Digite D para adicionar Discursiva, e O para Objetiva.");
                opcaoDO = leitor.nextLine();

                try {
                    if ("D".equals(opcaoDO) || "d".equals(opcaoDO) || "O".equals(opcaoDO) || "o".equals(opcaoDO)) { //verifica o que foi digitado
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
            if ("D".equals(opcaoDO) || "d".equals(opcaoDO)) { //verificacao p questao

                Discursiva d = new Discursiva();

                System.out.println("Digite a pergunta discursiva: ");

                d.setPergunta(leitor.nextLine());
                System.out.println();

                while (verdade == true) {
                    try {
                        System.out.println("Digite o peso da pergunta: ");
                        while (!leitor.hasNextDouble()) {
                            System.out.println("NUMERO INVALIDO !! Digite novamente: ");
                            leitor.nextLine();
                        }
                        double pesoDis = leitor.nextDouble();
                        leitor.nextLine();
                        //System.out.println("");
                        //System.out.println("TESTE: "+pesoDis);

                        if (pesoDis > 0) {//nao aceita peso negativo
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
                        while (!leitor.hasNextDouble()) {
                            System.out.println("NUMERO INVALIDO !!! Digite novamente: ");
                            leitor.nextLine();
                        }
                        double pesoObj = leitor.nextDouble();

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

                        while (!leitor.hasNextInt()) {//WHILE DO ERRO

                            System.out.println("NUMERO INVALIDO !! Digite novamente: ");
                            leitor.nextLine();

                        }

                        correta = leitor.nextInt();
                        leitor.nextLine();

                        if (correta > 1 && correta < 6) {
                            o.setRespostaCorreta(correta);
                            verdade = false;
                        } else {

                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.println("ERRO!!! Digite novamente: ");
                        verdade = true;

                    }

                }

                System.out.println("\n");

                q.add(o); // add questao no arraylist
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
        p1.setQ(q); // add arraylist no prova
        verdade = true;
        while (verdade == true) {
            try {
                System.out.println("Digite o nome do arquivo em que deseja salvar a prova: ");
                nomeArquivoProva = leitor.nextLine();
                //System.out.println(nomeArquivoProva);

                File arquivo = new File(nomeArquivoProva + ".txt");// criação do arquivo txt
                if (!arquivo.exists()) // se arquivo n existe cria
                {
                    arquivo.createNewFile(); // cria arquivo
                    //String linhaAtual = null;
                }
                //ESCREVER
                FileWriter escritor = new FileWriter(arquivo, true); //escreve sempre no fim do arquivo
                BufferedWriter escrita = new BufferedWriter(escritor);
                //LER
                FileReader leitura = new FileReader(arquivo);
                BufferedReader entrada = new BufferedReader(leitura); //buffered é oq esvreve no arquivo

                escrita.write(p1.obtemProva());
                escrita.close();
                entrada.close(); //fecha o arquivo
                verdade = false;

                //System.out.println("Arquivo ja existe ou esta aberto. Tente novamente. ");
            } catch (IOException e) {
                System.out.println("Falha ao manipular arquivo, tente novamente: ");

            }

        }
        verdade = true;
        while (verdade == true) {
            try {
                System.out.println("Digite o nome do arquivo em que deseja salvar o gabarito: ");
                nomeArquivoGabarito = leitor.nextLine();
                System.out.println(nomeArquivoGabarito);

                File arquivo2 = new File(nomeArquivoGabarito + ".txt");// criação do arquivo txt
                if (!arquivo2.exists()) // se arquivo n existe cria
                {
                    arquivo2.createNewFile(); // cria arquivo
                    //String linhaAtual = null;
                }
                FileWriter escritor2 = new FileWriter(arquivo2, true); //escreve sempre no fim do arquivo
                BufferedWriter escrita2 = new BufferedWriter(escritor2);

                FileReader leitura2 = new FileReader(arquivo2);
                BufferedReader entrada2 = new BufferedReader(leitura2); //buffered é oq esvreve no arquivo

                escrita2.write(p1.obtemGabarito());
                escrita2.close();
                entrada2.close(); //fecha o arquivo
                System.out.println(p1.obtemGabarito());
                verdade = false;

            } catch (IOException e) {
                System.out.println("Falha ao manipular arquivo, tente novamente: ");

            }
        }
    }

}
