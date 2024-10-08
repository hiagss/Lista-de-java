import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual sua idade?");
		int idade = scanner.nextInt();

		if (idade >= 16 && idade <= 17 ) {
			System.out.print("Eleitor Facultativo");
		}
		
		else if (idade >= 18 && idade <=65 ) {
			System.out.print("Eleitor obrigatorio");
		}

		else if (idade >= 65 ) {
			System.out.print("Eleitor Dispensado");
		}
		
		else {
            System.out.print("Idade inválida para classificação.");
		}
		
		 scanner.close();
    }
}