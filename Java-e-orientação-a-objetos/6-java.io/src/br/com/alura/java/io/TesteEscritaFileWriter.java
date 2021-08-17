package br.com.alura.java.io;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

//        Fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed");
        bw.newLine();
        bw.newLine();
        bw.write("fijfisdTesteEscritaFileWriterjfiojdsoif0ff0erj00");

        bw.close();
    }
}