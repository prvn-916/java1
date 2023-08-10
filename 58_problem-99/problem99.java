class problem99
{
    public static void main(String[] args) {
        int[] num = {10,20,30,20,40,20,50,20};
        int result = 0;
        int x = 20;
        for(int  i = 0; i<num.length-1; i++)
        {
            if (num[i] != x && num[i+1] !=x )
            {
                result=1;
            }
         }
         if(result==0)
         {
            System.out.println(String.valueOf(true));
         }
         else
         {
             System.out.println(String.valueOf(false));
         }
    }
}