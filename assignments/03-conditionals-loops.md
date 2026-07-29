QUESTION: 1
Area Of Circle Java Program
CODING:
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        double area = 3.14 * r * r;

        System.out.println("Area of Circle = " + area);
    }
}
OUTPUT:
Enter the radius: 78
Area of Circle = 19103.760000000002

QUESTION:2
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double b = sc.nextDouble();

        System.out.print("Enter the height: ");
        double h = sc.nextDouble();

        double area = (b * h) / 2;

        System.out.println("Area of Triangle = " + area);
    }
}
OUTPUT:
Enter the base: 67
Enter the height: 66
Area of Triangle = 2211.0

QUESTION: 3
Area Of Rectangle Program
CODING:
public class SimpleRectangleArea {
    public static void main(String[] args) {
        // Define fixed dimensions
        double length = 5.5;
        double width = 4.0;

        // Compute the area
        double area = length * width;

        // Display the output
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Calculated Area: " + area);
    }
}
OUTPUT:
Length: 5.5
Width: 4.0
Calculated Area: 22.0

QUESTION: 4
Area Of Rectangle Program 
CODING:
import java.util.Scanner; // User input vaanga ithu thandhaan mukkiyam

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
        input.close();
    }
}
OUTPUT:
Enter the base: 5
Enter the height: 7
The area of the triangle is: 17.5

QUESTION: 5
Area Of Parallelogram 
CODING:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double area = base * height;

        System.out.println("The area of the parallelogram is: " + area);

        input.close();
    }
}
OUTPUT:
Enter the base: 23.67
Enter the height: 77.89
The area of the parallelogram is: 1843.6563

QUESTION: 6
Area Of Rhombus
CODING:
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first diagonal (d1): ");
        double d1 = scanner.nextDouble();

        System.out.print("Enter second diagonal (d2): ");
        double d2 = scanner.nextDouble();

        double area = (d1 * d2) / 2.0;

        System.out.println("The Area of the Rhombus is: " + area);
        
        scanner.close();
    }
}
OUTPUT:
Enter first diagonal (d1): 45.8
Enter second diagonal (d2): 55.8
The Area of the Rhombus is: 1277.82

QUESTION: 7
Area Of Equilateral Triangle
CODING:
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the Equilateral Triangle: ");
        double side = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("The Area of the Equilateral Triangle is: " + area);
        
        scanner.close();
    }
}
OUTPUT:
Enter the side of the Equilateral Triangle: 45.66
The Area of the Equilateral Triangle is: 902.7602961570859

QUESTION: 8
Perimeter Of Circle
CODING:
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("The Perimeter of the Circle is: " + perimeter);
        
        scanner.close();
    }
}
OUTPUT:
Enter the radius of the Circle: 67.89
The Perimeter of the Circle is: 426.56545050442213

QUESTION: 9
Perimeter Of Equilateral Triangle:
CODING:
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the Equilateral Triangle: ");
        double side = scanner.nextDouble();

        double perimeter = 3 * side;

        System.out.println("The Perimeter of the Equilateral Triangle is: " + perimeter);
        
        scanner.close();
    }
}
OUTPUT:
Enter the side of the Equilateral Triangle: 45.16
The Perimeter of the Equilateral Triangle is: 135.48

QUESTION: 10
Perimeter Of Parallelogram
CODING:
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the Parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the side of the Parallelogram: ");
        double side = scanner.nextDouble();

        double perimeter = 2 * (base + side);

        System.out.println("The Perimeter of the Parallelogram is: " + perimeter);
        
        scanner.close();
    }
}
OUTPUT:
Enter the base of the Parallelogram: 56.34
Enter the side of the Parallelogram: 56.90
The Perimeter of the Parallelogram is: 226.48000000000002

QUESTION: 11
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the Rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("The Perimeter of the Rectangle is: " + perimeter);
        
        scanner.close();
    }
}
OUTPUT:
Enter the length of the Rectangle: 87
Enter the width of the Rectangle: 32
The Perimeter of the Rectangle is: 238.0

QUESTION: 12
Perimeter Of Square
CODING:
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the Square: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;

        System.out.println("The Perimeter of the Square is: " + perimeter);
        
        scanner.close();
    }
}
OUTPUT:
Enter the side of the Square: 45
The Perimeter of the Square is: 180.0

QUESTION: 13
Perimeter Of Rhombus
CODING:
import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the Rhombus: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;

        System.out.println("The Perimeter of the Rhombus is: " + perimeter);
        
        scanner.close();
    }
}
OUTPUT:
Enter the side of the Rhombus: 23
The Perimeter of the Rhombus is: 92.0

QUESTION: 14
Volume Of Cone Java Program
CODING:
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the Cone: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the Cone: ");
        double height = scanner.nextDouble();

        double volume = (Math.PI * radius * radius * height) / 3.0;

        System.out.println("The Volume of the Cone is: " + volume);
        
        scanner.close();
    }
}
OUTPUT:
Enter the radius of the Cone: 78.34
Enter the height of the Cone: 34.98
The Volume of the Cone is: 224809.96476082434

QUESTION: 15
Volume Of Prism
CODING:
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base area of the Prism: ");
        double baseArea = scanner.nextDouble();

        System.out.print("Enter the height of the Prism: ");
        double height = scanner.nextDouble();

        double volume = baseArea * height;

        System.out.println("The Volume of the Prism is: " + volume);
        
        scanner.close();
    }
}
OUTPUT:
Enter the base area of the Prism: 67
Enter the height of the Prism: 34.6
The Volume of the Prism is: 2318.2000000000003

QUESTION: 16
Volume Of Cylinder
CODING:
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the Cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the Cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("The Volume of the Cylinder is: " + volume);
        
        scanner.close();
    }
}
OUTPUT:
Enter the radius of the Cylinder: 56.45
Enter the height of the Cylinder: 89.0
The Volume of the Cylinder is: 890979.6233480673

QUESTION: 17
Volume Of Sphere 
CODING:
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the Sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The Volume of the Sphere is: " + volume);
        
        scanner.close();
    }
}
OUTPUT:
Enter the radius of the Sphere: 78.89
The Volume of the Sphere is: 2056622.0013056041

QUESTION: 18
Volume Of Pyramid
CODING:
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base area of the Pyramid: ");
        double baseArea = scanner.nextDouble();

        System.out.print("Enter the height of the Pyramid: ");
        double height = scanner.nextDouble();

        double volume = (baseArea * height) / 3.0;

        System.out.println("The Volume of the Pyramid is: " + volume);
        
        scanner.close();
    }
}
OUTPUT:
Enter the base area of the Pyramid: 234
Enter the height of the Pyramid: 678
The Volume of the Pyramid is: 52884.0

QUESTION: 19
Curved Surface Area Of Cylinder
CODING:
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the Cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the Cylinder: ");
        double height = scanner.nextDouble();

        double csa = 2 * Math.PI * radius * height;

        System.out.println("The Curved Surface Area of the Cylinder is: " + csa);
        
        scanner.close();
    }
}
OUTPUT:
Enter the radius of the Cylinder: 345
Enter the height of the Cylinder: 23
The Curved Surface Area of the Cylinder is: 49857.07541247002

QUESTION: 20
Total Surface Area Of Cube 
CODING:
import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the Cube: ");
        double side = scanner.nextDouble();

        double tsa = 6 * side * side;

        System.out.println("The Total Surface Area of the Cube is: " + tsa);
        
        scanner.close();
    }
}
OUTPUT:
Enter the side length of the Cube: 34
The Total Surface Area of the Cube is: 6936.0

QUESTION: 21

