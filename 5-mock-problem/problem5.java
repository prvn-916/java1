import java.util.Scanner;

class problem5{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter radius:");
        int radius = s.nextInt();
        Double area = 3.14159265359*radius*radius;
        Double perimeter = 2*3.14159265359*radius;
        System.out.println("Area of circle is:"+area);
        System.out.println("Perimeter of circle is:"+perimeter);
    }
}

