package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void criar(String nome){
        File arquivo = new File("/workspaces/aed-II/atv2/atv2_recursao/src/arquivos/" + nome + ".txt");
        try {
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void popularListaInt(String nome) throws IOException{
        FileWriter fw = new FileWriter("/workspaces/aed-II/atv2/atv2_recursao/src/arquivos/" + nome + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 1; i < 31; i++) 
            fw.write(String.valueOf(i) + ";"); 

        System.out.println("Escrito com sucesso!"); 

        bw.close();
    }

    public static int[] arqParaListaInt(String nome) throws IOException{
        FileReader fr = new FileReader("/workspaces/aed-II/atv2/atv2_recursao/src/arquivos/" + nome + ".txt");
        BufferedReader br = new BufferedReader(fr);
        
        String read = br.readLine();
        String[] lista = read.split(";");

        int[] listaInt = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            listaInt[i] = Integer.parseInt(lista[i]);
        }

        br.close();
        
        return listaInt;
    }
}
