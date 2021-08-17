package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

//        Fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        PrintWriter pw = new PrintWriter("lorem2.txt");
        pw.println("print writerlorem ipsum dolor sit amet, consectetur adipiscing elit, sed");
        pw.println("fidsfhsduhdsuhfusdhfuskgor");

        pw.close();
    }
}