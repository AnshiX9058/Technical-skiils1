package p1;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        String ans = "";
        for(int i=0; i<A; i++) {
            String temp = q.remove();        
            String rev = new StringBuilder(temp).reverse().toString();
            ans = temp + rev;
            q.add(temp + "1");
            q.add(temp + "2");
        }
        System.out.println("Ath Perfect Number = " + ans);
    }
}