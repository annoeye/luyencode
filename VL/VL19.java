    import java.util.Scanner;
    
    public class VL19 {
        public static void main(String[] s) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(), b = sc.nextInt(); sc.close();
            if (a >= b - 1) System.out.println("NOT FOUND");
            else {
                StringBuilder r = new StringBuilder();
                for (int i = b - (b % 3 == 0 ? 3 : b % 3); i > a; i -= 3) r.append(i).append(" ");
                System.out.println(r.isEmpty() ? "NOT FOUND" : r.deleteCharAt(r.length() - 1));
            }
        }
    }
