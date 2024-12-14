import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
             
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();

        int max = a;
       if(b>max){
        max = b;
       }
        if (c>max){
            max=c;
        }

        System.out.println(max);
        t.close();
    }
}
