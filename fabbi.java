import java.util.Scanner;
public class fabbi {
    public static void main(String[] args){
        int c,a=0, b=1 , i;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("enete the n number");
        int n=scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        
        for(i=0;i<n-2;i++)
      
         {   c=a+b;
            System.out.println(+c);
            a=b;
            b=c;

          scanner.close();
        }
    

}
}