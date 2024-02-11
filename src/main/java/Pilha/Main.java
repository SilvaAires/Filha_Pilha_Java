package Pilha;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Pilha p = new Pilha();
        Scanner e = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = e.nextLine();
        
        for (int i = 0; i < frase.length(); i++){
            p.empilharChar(frase.charAt(i));
        }
        
        String inv = "";
        while (!p.vazia()) {
            inv += p.desempilharChar();
        }
        if (frase.equals(inv)) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não Palíndromo");
        }

    }
}
