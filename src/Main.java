import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringListAlphabet = new ArrayList<>();
        stringListAlphabet.add("A");
        stringListAlphabet.add("B");
        stringListAlphabet.add("C");
        stringListAlphabet.add("D");
        stringListAlphabet.add("E");
        stringListAlphabet.add("F");
        stringListAlphabet.add("G");
        stringListAlphabet.add("H");
        stringListAlphabet.add("I");
        stringListAlphabet.add("J");
        stringListAlphabet.add("K");
        stringListAlphabet.add("L");
        stringListAlphabet.add("M");
        stringListAlphabet.add("N");
        stringListAlphabet.add("O");
        stringListAlphabet.add("P");
        stringListAlphabet.add("Q");
        stringListAlphabet.add("R");
        stringListAlphabet.add("S");
        stringListAlphabet.add("T");
        stringListAlphabet.add("U");
        stringListAlphabet.add("V");
        stringListAlphabet.add("W");
        stringListAlphabet.add("X");
        stringListAlphabet.add("Y");
        stringListAlphabet.add("Z");

        System.out.println(stringListAlphabet.get(25));
        System.out.println(stringListAlphabet.get(0));
        System.out.println();

        Iterator<String> iterator = stringListAlphabet.iterator();
        while (iterator.hasNext())
        {
            String i = iterator.next();
            System.out.println(i);
        }
    }
}
