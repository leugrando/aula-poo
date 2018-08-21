import java.util.Scanner;
public class exer6 {
	public static void main (String[] args){
Scanner leitor = new Scanner(System.in);

int vetor[] = new int[10]; 
int i,soma=0,maior,menor; 
float media;
for (i=0; i<10; i++) {
System.out.println("Digite um numero:");
vetor[i] = leitor.nextInt();
  		}
for (i=0;i<10;i++)
{
soma = soma+vetor[i];
}
media = soma/10;
maior = vetor[0];
menor = vetor[0];
for(i=0;i<10;i++)
{
if(vetor[i]>maior)
maior=vetor[i];
}
for(i=0;i<10;i++)
{
if(vetor[i]<menor)
menor=vetor[i];
}
System.out.println("Soma: "+soma);
System.out.println("Media: "+media);
System.out.println("Maior: "+maior);
System.out.println("Menor:"+menor);
}
}