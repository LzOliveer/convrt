/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author Luiz Cassol
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String r = "";
        int ndec;
        double r2;

        System.out.println("Digite 1 para decimal - binário");
        System.out.println("Digite 2 para decimal - octal");
        System.out.println("Digite 3 para decimal - hexadecimal");
        int b;
        b = ler.nextInt();
        System.out.println("Digite o número decimal que deseja converter: ");
        ndec = ler.nextInt();

        if (b == 1) {
            while ((ndec / 2) >= 1) {

                r = ndec % 2 + r;
                ndec = ndec / 2;

            }
            r = ndec + r;
            System.out.println(r);

        }
        if (b == 2) {
            while ((ndec / 8) >= 1) {

                r = ndec % 8 + r;
                ndec = ndec / 8;

            }
            r = ndec + r;
            System.out.println(r);

        }
        if (b == 3) {
            while (ndec/16 >= 1) {
                int n;

                n = ndec%16;

                
                if (n == 10) {
                    r = "A" + r;
                }
                else if (n == 11) {
                    r = "B" + r;
                }
                else if (n == 12) {
                    r = "C" + r;
                }
                else if (n == 13) {
                    r = "D" + r;
                }
                else if (n == 14) {
                    r = "E" + r;
                }
                else if (n == 15) {
                    r = "F" + r;
                }
                else if (n < 10){
                    r = n + r;
                }

                ndec = ndec/16;

            }
            r2 = ndec%16;
            if (r2 == 10) {
                r = "A" + r;
            }
            else if (r2 == 11) {
                r = "B" + r;
            }
            else if (r2 == 12) {
                r = "C" + r;
            }
            else if (r2 == 13) {
                r = "D" + r;
            }
            else if (r2 == 14) {
                r = "E" + r;
            }
            else if (r2 == 15) {
                r = "F" + r;
            } else {
                r = ndec + r;
            }
            
            System.out.println(r);
        }
    }

}
