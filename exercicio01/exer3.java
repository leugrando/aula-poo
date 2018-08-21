import java.util.Scanner;
public class exer3 {
	public static void main (String[] args){
int n,i;
String[] vetor = new String[12];
Scanner leitor = new Scanner(System.in);
System.out.println("Digite um numero de 1 a 12: ");
n = leitor.nextInt();
vetor[0]= "Janeiro";
vetor[1]= "Fevereiro";
vetor[2]= "Marco";
vetor[3]= "Abril";
vetor[4]= "Maio";
vetor[5]= "Junho";
vetor[6]= "Julho";
vetor[7]= "Agosto";
vetor[8]= "Setembro";
vetor[9]= "Outubro";
vetor[10]= "Novembro";
vetor[11]= "Dezembro";

for(i=0;i<12;i++){
if(i==n){
System.out.println(vetor[i-1]);}

	}
	
		}










		}