package br.com.bytebank.banco.teste;

public class Teste {
    public static void main(String[] args) {

        int[] idade = new int[5];
//        idade[0]= 29;
//        idade[1]= 30;
//        idade[2]= 34;
//        idade[3]= 43;
//        idade[4]= 50;
//
//       int idade9 = idade[49];
//        System.out.println(idade9);
//        System.out.println(idade.length);

        for(int i = 0; i < idade.length; i++){
            idade[i] = i*i;
            System.out.println(idade[i]);
        }
    }
}

