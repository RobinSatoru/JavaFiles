import java.util.*;

public class App {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int T = in.nextInt(), n, c, l;
                String S;
                while (T-- > 0) {
                        n = in.nextInt();
                        S = in.next();
                        c = 0;
                        l = S.length();
                        if (S.startsWith("1"))
                                c++;
                        if (S.endsWith("0"))
                                c++;
                        S = S.replaceAll("01", "");
                        System.out.println((l - S.length()) / 2 + c);
                }
        }
}
