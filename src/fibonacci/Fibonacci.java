/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author janil
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1;

        while (b <= n) {
            if (b == n) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }
}
