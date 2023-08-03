

public class arrayMerge {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c = new int[10];
        int k = 0;

        for(int i = 0; i<a.length; i++,k++)
        c[k] = a[i];
        for(int i = 0; i<b.length; i++,k++)
        c[k] = b[i];
        System.out.println("The merged array is:");
        for(int i=0; i<10; i++)
        System.out.println(c[i]);
        
    }
    
}
