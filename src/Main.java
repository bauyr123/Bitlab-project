import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        IntStream.range(0,n).forEach(x -> list.add(in.nextInt()));

        System.out.println(list.stream().sorted(Integer::compare).max(Integer::compare));
    }
}