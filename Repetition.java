import java.util.Scanner;

public class Repetition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0; i<str.length(); i++){
            repetition(str.charAt(i), str);
        }
    }
    public static void repetition(char ch, String str){
        String ans = "";
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i+1)!=ch){
                ans = ans+ch;
                break;
            }
        }
        System.out.println(ans);
    }

}
