/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) { //1 <= 5 V
            System.out.printf("%d\n", i);

            for (int j = 1; j <= 3; j++) { //1<= 3 / 2<= 3 V // 3<= 3 V/
                System.out.printf("%d ", j*i);
            }
            System.out.printf("\n-------------\n");
        }
    }
}
