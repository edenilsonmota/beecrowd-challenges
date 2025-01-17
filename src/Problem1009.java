

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Problem1009 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.nextLine();        
        Double salarioFixo = sc.nextDouble();
        Double totalVenda = sc.nextDouble();

        double totalComissao = ((double)15/100) * totalVenda;
        double salarioTotal = salarioFixo + totalComissao;
        
        
        System.out.println("TOTAL = R$ " + String.format("%.2f", salarioTotal));
        
        sc.close();
    }
 
}