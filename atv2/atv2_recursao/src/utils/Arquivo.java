package utils;

import utils.ListaEncadeadaDupla;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void criar(String nome){
         File arquivo = new File("src/arquivos/"+ nome + ".txt");
        try {
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void popularListaInt(String nome) throws IOException{
        FileWriter fw = new FileWriter("src/arquivos/"+ nome + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 1; i < 31; i++) 
            fw.write(String.valueOf(i) + ";"); 

        System.out.println("Escrito com sucesso!"); 

        bw.close();
    }

    public static ListaEncadeadaDupla<Integer> arqParaListaInt(String nome) throws IOException{
        FileReader fr = new FileReader("src/arquivos/"+ nome + ".txt");
        BufferedReader br = new BufferedReader(fr);
        
        String read = br.readLine();
        String[] lista = read.split(";");

        ListaEncadeadaDupla<Integer> listaInteiros = new ListaEncadeadaDupla<>();
        for (int i = 0; i < lista.length; i++) {
            listaInteiros.inserir(Integer.parseInt(lista[i]));
        }

        br.close();
        
        return listaInteiros;
    }

    public static String lerString(String nome) throws IOException{
        FileReader fr = new FileReader("src/arquivos/"+ nome + ".txt");
        BufferedReader br = new BufferedReader(fr);
        
        String read = br.readLine();
        br.close();

        return read.trim();
        
    }
}
