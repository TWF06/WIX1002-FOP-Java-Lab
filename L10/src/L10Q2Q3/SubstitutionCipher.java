package L10Q2Q3;
import java.io.*;

public class SubstitutionCipher implements MessageEncoder {
    private int shift;
    private String inputFile;
    private String outputFile;

    public SubstitutionCipher(String inputFile, String outputFile, int shift) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.shift = shift;
    }

    @Override
    public String encode(String plainText) {
        StringBuilder sb = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            sb.append((char)(c + shift));
        }
        return sb.toString();
    }

    @Override
    public String decode(String cipherText) {
        StringBuilder sb = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            sb.append((char)(c - shift));
        }
        return sb.toString();
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
