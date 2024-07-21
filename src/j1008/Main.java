package j1008;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int idFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        float valorHora = sc.nextFloat();

        float salario = horasTrabalhadas * valorHora;
        
        System.out.println("NUMBER = " + idFuncionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
        
        sc.close();
    }
 
}