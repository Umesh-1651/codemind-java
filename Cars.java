import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int ans = a>=b?-1:(x/(b-a))+1;
        System.out.println(ans);
    }
}