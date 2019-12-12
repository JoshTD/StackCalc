import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String string;
        Calc c = new Calc();
        while (true) {
            System.out.print("Введите формулу -> ");
            string = in.next();
            while (string.contains("[") || string.contains("]"))
            {
                string = string.replace("[", "(");
                string = string.replace("]", ")*2");
            }
            c.compile(string.toCharArray());
        }
    }
}
