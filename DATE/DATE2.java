import java.util.Scanner;

public class DATE2 {
    public static void main(String[] args){
        int time = new Scanner(System.in).nextInt();
        if (time < 60) System.out.println(formatTime(0, 0, time));
        else if (time < 3600) System.out.println(formatTime(0, time / 60, time % 60));
        else System.out.println(formatTime(time / 3600, (time / 60) % 60, time % 60));
    }
    static String formatTime(int hh, int mm, int ss){
        if (mm == 24) mm = 0;
        return String.format("%02d:%02d:%02d",hh, mm, ss);
    }
}