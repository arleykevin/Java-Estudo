import java.util.Scanner;

public class Exercicio0205Java {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int CodProduto  = input.nextInt();
         int QtdProduto = input.nextInt();
         double pagar;

         if(CodProduto == 1){
             pagar = QtdProduto * 4;

         } else if(CodProduto == 2){
             pagar = QtdProduto * 4.5;

         } else if(CodProduto == 3){
             pagar = QtdProduto * 5;

         } else if(CodProduto == 4){
             pagar = QtdProduto * 2;

         } else{
             pagar = QtdProduto * 1.5;
         }
         System.out.printf("Total: R$ %.2f%n" , pagar);
     }

}
