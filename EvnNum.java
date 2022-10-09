import java.util.Scanner;

public class EvnNum {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int rem = 0;
        int count = numOfDigits(num);

        if(count == 5){
            rem = num%10000;
            int div = num/10000;
            System.out.println(div);
            count = numOfDigits(rem);
        }

        if(count ==4){
            rem = rem%1000;
            int div = rem/100;
            System.out.println(div);
            count = numOfDigits(rem);

        }

        if(count ==3){
            rem = rem%100;
            int div = rem/10;
            count = numOfDigits(rem);
        }

        if(count ==2){
            rem = rem%10;
            int div = rem;
            System.out.println(div);
        }

    }

        public static int numOfDigits(int num){
        int count=0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
