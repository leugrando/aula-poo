import java.util.Scanner;
public class exer7 {
	public static void main (String[] args){
Scanner leitor = new Scanner(System.in);
float m1,m2,m3,media;

System.out.println("Digite seu nome:");
String nome = leitor.nextLine();
System.out.println("Digite sua M1:");
m1 = leitor.nextFloat();
System.out.println("Digite sua M2:");
m2 = leitor.nextFloat();
System.out.println("Digite sua M3:");
m3 = leitor.nextFloat();

media=(m1+m2+m3)/3;
System.out.println("Nome do aluno: "+nome);
System.out.println("Media: "+media);
if (media>=5.75)
System.out.println("Situacao: APROVADO !!!");
else
System.out.println("Situacao: REPROVADO !!!:");

}
}