import java.util.Arrays;
import java.util.Scanner;

public class UsingArray {
    public static void main(String[] args) {
        int num, rev;
        int rem = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        rev = num;
        int count = numOfDigits(num);
        int arr[] = new int[count];
        for (int i = count; count > 0; count--) {
            rem = num%10;
            arr[count-1] = rem;
            num = num/10;
        }
        count = numOfDigits(rev);
        for(int i =0; i<count; i=i+2){
            System.out.println(arr[i]);
        }
    }

    public static int numOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
