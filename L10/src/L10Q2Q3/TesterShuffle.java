package L10Q2Q3;

public class TesterShuffle {
    public static void main(String[] args) throws Exception {
        ShuffleCipher sc =
            new ShuffleCipher("input.txt", "output.txt", 1);

        sc.processEncode();
        sc.processDecode();
    }
}
