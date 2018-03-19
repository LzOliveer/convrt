/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author luizo
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String resultado = "";
        int num;
        double r2;

        System.out.println("Digite o número 1 para converter de decimal para binário");
        System.out.println("Digite o número 2 para converter de decimal para octal");
        System.out.println("Digite o número 3 para converter de decimal para hexadecimal");
        int a;
        a = ler.nextInt();
        System.out.println("Digite o número para converter: ");
        num = ler.nextInt();

        if (a == 1) {
            while ((num / 2) >= 1) {

                resultado = num % 2 + resultado;
                num = num / 2;

            }
            resultado = num + resultado;
            System.out.println(resultado);

        }
        if (a == 2) {
            while ((num / 8) >= 1) {

                resultado = num % 8 + resultado;
                num = num / 8;

            }
            resultado = num + resultado;
            System.out.println(resultado);

        }
        if (a == 3) {
            while (num/16 >= 1) {
                int n;

                n = num%16;

                
                if (n == 10) {
                    resultado = "A" + resultado;
                }
                else if (n == 11) {
                    resultado = "B" + resultado;
                }
                else if (n == 12) {
                    resultado = "C" + resultado;
                }
                else if (n == 13) {
                    resultado = "D" + resultado;
                }
                else if (n == 14) {
                    resultado = "E" + resultado;
                }
                else if (n == 15) {
                    resultado = "F" + resultado;
                }
                else if (n < 10){
                    resultado = n + resultado;
                }

                num = num/16;

            }
            r2 = num%16;
            if (r2 == 10) {
                resultado = "A" + resultado;
            }
            else if (r2 == 11) {
                resultado = "B" + resultado;
            }
            else if (r2 == 12) {
                resultado = "C" + resultado;
            }
            else if (r2 == 13) {
                resultado = "D" + resultado;
            }
            else if (r2 == 14) {
                resultado = "E" + resultado;
            }
            else if (r2 == 15) {
                resultado = "F" + resultado;
            } else {
                resultado = num + resultado;
            }
            
            System.out.println(resultado);
        }
    }

}
