package SUM;

import java.util.Scanner;

public class SUM4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (long T = sc.nextLong(); T-- > 0;) {
                double n = sc.nextDouble();
                System.out.printf("%.8f%n", (2.0 * n) / (n + 1.0));
            }
        }
    }
}
/*
Có thể do web luyện code đang bị lỗi thế nên code bằng ngôn ngữ java không được AC hết.
Code C++ đúng dùng tham khảo 

#include <cstdio>

int main() {
    int T;
    std::scanf("%d", &T);
    while (T--) {
        int n;
        std::scanf("%d", &n);
        std::printf("%.8lf\n", 2 * n * 1.0 / (n + 1));
    }
    return 0;
}
*/