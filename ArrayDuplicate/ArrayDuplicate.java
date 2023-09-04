package ArrayDuplicate;
import java.util.Scanner;

public class ArrayDuplicate{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int array[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            array[i] = s.nextInt();
        }
        
        int dupcount = 0;
        int dupArray[] = new int[n];
        for(int i = 0 ; i<array.length; i++)
        { 
            if(dupArray[i] == 1){
                continue;
            }
            int duplicate = 0;
            dupArray[i] = 1;
            
            for(int j = i+1; j<array.length; j++)
            {
                if(array[i] == array[j]){
                    dupArray[j] = 1;
                    //System.out.print(array[j]+ " ");
                    duplicate++;
                }               
            }   
            if (duplicate > 0){
                System.out.print(array[i] + " ");
                dupcount++;
            } 
        }
        if(dupcount == 0)
            System.out.println("-1");
        s.close();
    }
}