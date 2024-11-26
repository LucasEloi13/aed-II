package utils;

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

    public static ListaEncadeadaDupla<?> arqParaLista(String nome) throws IOException {
        FileReader fr = new FileReader("src/arquivos/" + nome + ".txt");
        BufferedReader br = new BufferedReader(fr);
    
        String read = br.readLine();
        if (read == null || read.isEmpty()) {
            br.close();
            throw new IllegalArgumentException("O arquivo está vazio.");
        }
    
        String[] elementos = read.split(";");
        // Determinar o tipo com base no primeiro elemento
        boolean isInteiro = elementos[0].trim().matches("-?\\d+"); // Verifica se é número inteiro
    
        if (isInteiro) {
            // Criar lista de inteiros
            ListaEncadeadaDupla<Integer> listaInteiros = new ListaEncadeadaDupla<>();
            for (String elemento : elementos) {
                listaInteiros.inserir(Integer.parseInt(elemento.trim()));
            }
            br.close();
            return listaInteiros;
        } else {
            // Criar lista de strings
            ListaEncadeadaDupla<String> listaStrings = new ListaEncadeadaDupla<>();
            for (String elemento : elementos) {
                listaStrings.inserir(elemento.trim());
            }
            br.close();
            return listaStrings;
        }
    }
    
    

    public static String lerString(String nome) throws IOException{
        FileReader fr = new FileReader("src/arquivos/"+ nome + ".txt");
        BufferedReader br = new BufferedReader(fr);
        
        String read = br.readLine();
        br.close();

        return read.trim();
        
    }
}