import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        // Fazer a tabuada básica de um número
        // informado pelo usuário -> 5 = 5X1=5, 5X2=10...
        Scanner entrada = new Scanner(System.in);
        int numero, op, resultado;
        System.out.println("Informe um número qualquer:");
        numero = entrada.nextInt();
        op = 1;

        while (op<=10){
            resultado = numero * op;
            System.out.println(numero + " X " +
                    op + " = " +resultado);
            op = op + 1;
        }
    }
}
