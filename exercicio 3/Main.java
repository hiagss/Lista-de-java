import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual valor da compra?");
		double ValorDaCompra = scanner.nextDouble();
		
		if (ValorDaCompra < 0) {
		    System.out.print("Valor invalido");
		}
		
		else {
		    double lucro = 0;
		
		if (ValorDaCompra < 10 ){
		    lucro = ValorDaCompra + (ValorDaCompra * 0.30);
		}
		
		else if (ValorDaCompra >= 10 && ValorDaCompra < 30 ){
		    lucro = ValorDaCompra + (ValorDaCompra * 0.30);
		}
		
		else if (ValorDaCompra >= 30 && ValorDaCompra < 50 ){
		    lucro = ValorDaCompra + (ValorDaCompra * 0.30);
		}
		
		else if (ValorDaCompra >= 50 ){
		    lucro = ValorDaCompra + (ValorDaCompra * 0.30);
		}
		
		System.out.printf("Valor da venda: R$ %.2f%n", lucro);
		    
	    }
		
		scanner.close();

    }
}
