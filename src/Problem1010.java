

import java.util.Scanner;

public class Problem1010 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int idProduto = sc.nextInt();
        int quantProduto = sc.nextInt();
        double precoProduto = sc.nextDouble();

        int idProdutoDois = sc.nextInt();
        int quantProdutoDois = sc.nextInt();
        double precoProdutoDois = sc.nextDouble();

        double total = (quantProduto * precoProduto) + (quantProdutoDois * precoProdutoDois);


        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

        sc.close();
        
    }
}
