import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class FileReadMain {
    public static void main(String[] args)throws IOException {
        String sentence;
        int wordsInTextCount = 0;
        int char_Count = 0;
        int paragraphs_Count = 0;
        int sentences_Count = 0;

        ArrayList<String> wording = new ArrayList<String>();
        Scanner in = null;
        try {
            File dict = new File("Metamorphosis.txt");
            FileInputStream fileInputStream = new FileInputStream(dict);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            in = new Scanner(dict);

            while ((sentence = bufferedReader.readLine()) != null) {
                if (sentence.equals("")) {
                    paragraphs_Count += 1;
                }
                else {
                    char_Count += sentence.length();
                    String wordsInText[] = sentence.split("\\s+");
                    wordsInTextCount += wordsInText.length;
                    String sentences[] = sentence.split("[!?.:]+");
                    sentences_Count += sentences.length;
                }
            }
            if (sentences_Count > 1) {
                paragraphs_Count++;
            }
            System.out.println("Total word count = " + wordsInTextCount);
            System.out.println("Total number of sentences = " + sentences_Count);
            System.out.println("Total number of characters = " + char_Count);
            System.out.println("Number of paragraphs = " + paragraphs_Count);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                in.close();
            }
        }
    }
}

