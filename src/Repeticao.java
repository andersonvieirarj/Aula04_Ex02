// Estruturas de Repetição -> permitem repetir
// um determinado trecho de código mediante
// uma condição ou um laço de repetição
// WHILE (ENQUANTO) -> funciona enquanto o teste der verdadeiro
// DO...WHILE (FAÇA...ENQUANTO) -> repete pelo menos uma vez
//    já que o teste é feito no final
// FOR (PARA) -> repete um determinado numero de vezes
public class Repeticao {
    public static void main(String[] args) {
        int numero = 1;
        while (numero<=100) {
            System.out.println(numero);
            numero = numero + 1;
        }
        int numero2 =1;
        do {
            System.out.println(numero2);
            numero2 = numero2 + 1;
        }
        while (numero<=100);
    }
}
