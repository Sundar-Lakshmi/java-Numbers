public class Main {
    public static void main(String[] args) {

        int num = 0001123;

        int count = 2;
        String ans = "";

        if (numCount(num) % 2 == 0) {
            num = num / 10;
        }

        while (num / 10 != 0) {
            int rem = num % 10;
            num = num / 10;

            if (count % 2 == 0) {
                ans = ans + rem;
            }

            count++;
        }

        ans = ans + num;

        int rev = Integer.parseInt(ans);

        while (rev / 10 != 0) {
            int rem = rev % 10;
            rev = rev / 10;
            System.out.print(rem);
        }

        System.out.println(rev);

    }

    public static int numCount(int num) {

        int numCount = 1;

        while (num / 10 != 0) {
            num = num / 10;
            numCount++;
        }

        return numCount;
    }
}
