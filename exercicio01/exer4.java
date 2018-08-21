import java.util.Scanner;
public class exer4 {
	public static void main (String args[]){
float p,a,imc;
Scanner leitor = new Scanner(System.in);
System.out.println("Digite seu peso:");
p = leitor.nextFloat();
System.out.println("Digite sua altura:");
a = leitor.nextFloat();

imc=p/(a*a);
System.out.println(imc);
}
	}