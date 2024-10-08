import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();
        
        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();

        if (B == 0) {
            
            System.out.println("Erro: Divisão por zero não é permitida.");
        } 
        
        else {
            
            if (A % B == 0) {
                
                System.out.println(A + " é divisível por " + B + ".");
            
            } 
            
            else {
                
                System.out.println(A + " não é divisível por " + B + ".");
            
            }
        }

        scanner.close();
    }
} 
