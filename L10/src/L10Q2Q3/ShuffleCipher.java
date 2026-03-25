package L10Q2Q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ShuffleCipher implements MessageEncoder {
    private int n;    
    private String inputFile;
    private String outputFile;

    public ShuffleCipher(String inputFile, String outputFile,int n) {
        this.n = n;
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    @Override
    public String encode(String text) {
        for (int i = 0; i < n; i++) {
            int mid = text.length() / 2;
            String first = text.substring(0, mid);
            String second = text.substring(mid);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < second.length(); j++) {
                if (j < first.length())
                    sb.append(first.charAt(j));
                sb.append(second.charAt(j));
            }
            text = sb.toString();
        }
        return text;
    }

    @Override
    public String decode(String text) {
        for (int i = 0; i < n; i++) {
            char[] arr = new char[text.length()];
            int index1 = 0, index2 = (text.length() + 1) / 2;

            for (int j = 0; j < text.length(); j++) {
                if (j % 2 == 0)
                    arr[index1++] = text.charAt(j);
                else
                    arr[index2++] = text.charAt(j);
            }
            text = new String(arr);
        }
        return text;
    }
    
    public void processEncode() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        String text = br.readLine();
        bw.write(encode(text));
        br.close();
        bw.close();
    }

    public void processDecode() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        String text = br.readLine();
        bw.write(decode(text));
        br.close();
        bw.close();
    }
}
