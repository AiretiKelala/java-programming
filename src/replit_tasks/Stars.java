package replit_tasks;


import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String star = "";
        for (int i = 1; i <= n; i++) {
            star = star + "*";
            System.out.println(star);


        }

    }
}
