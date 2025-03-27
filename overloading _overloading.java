import java.util.Scanner;

class Overl {
    // Method to calculate area of a circle
    public void calarea(int r) {
        float result = (float) 3.14 * r * r;  // Explicit cast to float
        System.out.println("Area of Circle: " + result);
    }

    // Method to calculate area of a rectangle
    public void calarea(int l, int w) {
        int ans = l * w;
        System.out.println("Area of Rectangle: " + ans);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Overl obj = new Overl();

        // Taking user input for circle
        System.out.print("Enter radius of the circle: ");
        int radius = sc.nextInt();
        obj.calarea(radius);

        // Taking user input for rectangle
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int width = sc.nextInt();
        obj.calarea(length, width);

        sc.close();
    }
}
