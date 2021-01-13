package Question53;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class TextReader {

    private int x;
    private int y;

    TextReader(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Question53/example.txt"));
        List<TextReader> arr = new ArrayList<>();
        while (scan.hasNextLine()) {
            String[] line = scan.nextLine().split(",");
            TextReader tr = new TextReader(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            arr.add(tr);
        }
        Comparator<TextReader> cmp = Comparator.comparing(TextReader::getX).thenComparing(TextReader::getY);
        arr.sort(cmp);
        System.out.println(arr);
    }
}
