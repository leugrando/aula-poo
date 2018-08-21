import java.util.Scanner;
public class exer5 {
	public static void main (String[] args){
int dias;
float salario,resposta,pordia;
Scanner leitor = new Scanner(System.in);
System.out.println("Digite o numero de dias trabalhados:");
dias = leitor.nextInt();
System.out.println("Digite seu salario integral: ");
salario = leitor.nextFloat();
pordia = salario/22;
resposta = pordia*dias;
System.out.println(resposta);
}
}