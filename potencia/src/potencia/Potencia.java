/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

/**
 *
 * @author Micro
 */import java.util.Scanner;
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner 
        (System.in);
        double n1,a;
        int i;
        System.out.print("Digite um número para o calculo: ");
        n1 = entrada.nextInt();
        i = 1;
        while(1<=15){
        a = Math.pow(n1,i);
        System.out.println(a);
        i = i+1;
        
        }
    }
    
}
