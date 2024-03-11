import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // vetor Poo Udemy
		//Programa que leia um numero inteiro positivo N(mx 10)Armazene no vetor.Enseguida mostrar na tela
		//os numeros NEGATIVO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];//quantas casas vou preencher(vetor)
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
        System.out.println("Numeros Negativos: ");
        for (int i = 0; i < n; i++) {
        	if(vet[i] < 0) {
        		System.out.println(vet[i]);
        	}
        }
        
        sc.close();

    }
}
