import java.util.Scanner;

class pattern9{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <=n ; i++){
            for(int j = 0; j <= n-i; j++){
            
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++ ){
                if(j==i || j==1||i==n)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        s.close();
    }
}