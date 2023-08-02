import java.util.Arrays;

class problem
{
    public static void main(String[] args) {
        
        int[] num1 = {10, 11, 10, 20, 43, 20, 50};
        int[] num2 = {10, 13, 11, 20, 44, 30, 50}; 
        System.out.println("Array1:"+Arrays.toString(num1));
        System.out.println("Array2:"+Arrays.toString(num2));
        int ctr = 0;

        for(int i=0;i<num1.length;i++ )
        {
            if (Math.abs(num1[i]-num2[i])<=1 && num1[i]!=num2[i])
            {
                ctr++;
            }
        }
        System.out.println("number of elements:"+ctr);
    }
}