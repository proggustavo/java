package exercicios;

import java.util.Scanner;

public class ImprimirInvertido {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);



int tamanho = 0;

System.out.println("Digite quantos números quer cadastrar: ");
tamanho = teclado.nextInt();

int[] numeros = new int[tamanho];

for(int i = 0; i < numeros.length; i++ ) {
System.out.println("Digite o número");
numeros[i] = teclado.nextInt();

}
for(int i = numeros.length-1; i >= 0; i--) {

System.out.println("Resultado " + numeros[i]);

}

teclado.close();

}

}