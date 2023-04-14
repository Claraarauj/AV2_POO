package AV2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q5_anaclara {


        public static List<String> PalavrasComLink(String path){
            List<String> link = new ArrayList<>();
            String linha;
            try (BufferedReader br = new BufferedReader(new FileReader(path))){
                while((linha = br.readLine()) != null) {
                    String[] palavras = linha.split("\\s+");
                    for (String palavra : palavras) {
                        if(palavra.contains("link")) {
                            link.add(palavra);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return link;
        }
        public static void main(String []args) {
            String path = "C:\\Users\\Usuario\\IdeaProjects\\av2_anaclara\\src\\AV2\\Questao5.txt";
            List<String> link = PalavrasComLink(path);
            System.out.println(link);
        }
    }

