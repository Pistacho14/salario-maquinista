package org.iesteis;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < cases; i++) {
            SalarioMaquinista salario = new SalarioMaquinista(
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt());

            if (i > 0) {
                output.append(System.lineSeparator());
            }
            output.append(salario.salarioTotal());
        }
        scanner.close();

        System.out.println(output);
    }
}
