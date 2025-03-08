import java.util.Scanner;

public class missing_number2 {
   
        



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array A");
        int n = sc.nextInt();

        int[] ar = new int[n];
        int[] ar2 = new int[n + 1];

        System.out.println("Enter the array:");
        for (int i = 0; i < n - 1; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            ar2[ar[i]] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            if (ar2[i] == 0) {
                System.out.println("The missing element is: " + i);
            }
        }
    }
}

    

