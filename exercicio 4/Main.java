import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual sua matricula?");
		int Matricula = scanner.nextInt();
		
		System.out.print("Quantidade de hora extra trabalhadas");
		double HoraExtra = scanner.nextDouble();
		
		double SalarioMinimo = 788;
		double ValorHoraExtra = 10;
		double SalarioHoraExtra = HoraExtra * ValorHoraExtra;
		double SalarioBruto = (3 * SalarioMinimo) + SalarioHoraExtra;
		double DescontoInss = 0;
		double ImpostoDeRenda = 0;
		
		if (SalarioBruto > 1500){
		    DescontoInss = SalarioBruto * 0.12;
		    
		}
		
		if (SalarioBruto > 2000){
		    ImpostoDeRenda = SalarioBruto * 0.2;
		}
		
		double SalarioLiquido = SalarioBruto - (DescontoInss + ImpostoDeRenda);
		
	    System.out.printf("Matrícula: %d%n", Matricula);
        System.out.printf("Salário Bruto: R$ %.2f%n", SalarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", DescontoInss);
        System.out.printf("Desconto Imposto de Renda: R$ %.2f%n", ImpostoDeRenda);
        System.out.printf("Salário Líquido: R$ %.2f%n", SalarioLiquido);
		
		scanner.close();

    }
}
