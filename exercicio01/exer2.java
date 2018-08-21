import java.util.Scanner;
public class exer2 {
	public static void main (String args[]){
Scanner leitor = new Scanner(System.in);
int n;
System.out.println("Digite um numero de 1 a 7");

n = leitor.nextInt();

switch(n){
case 1:
System.out.println("Domingo");
break;
case 2:
System.out.println("Segunda");
break;
case 3:
System.out.println("Terca");
break;
case 4:
System.out.println("Quarta");
break;
case 5:
System.out.println("Quinta");
break;
case 6:
System.out.println("Sexta");
break;
case 7:
System.out.println("Sabado");
break;
}
	}
		}
