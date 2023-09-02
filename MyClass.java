import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num;

        ArvoreBinaria arv = new ArvoreBinaria();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            num = scanner.nextInt();
            arv.inserir(num);
        }
        
        System.out.println("ok");
        arv.exibirNoEsq();
    }
}