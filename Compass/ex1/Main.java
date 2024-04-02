import java.util.Scanner;

import entities.UsedProduct;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int N = scanner.nextInt();
        System.out.print("Common, used or imported (c/u/i)? ");
        String type = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();

    }
}
