package L10Q2Q3;
public class TesterSubstitution {
    public static void main(String[] args) throws Exception {
        SubstitutionCipher sc =
            new SubstitutionCipher("input.txt", "output.txt", 3);

        sc.processEncode();
        sc.processDecode();
    }
}