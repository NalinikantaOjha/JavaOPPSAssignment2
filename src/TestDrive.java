import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("length");
        int length=scanner.nextInt();
        System.out.println("breadth");
        int breadth=scanner.nextInt();
        System.out.println("side");
        int side =scanner.nextInt();

        Rectangle rectangle=new Rectangle(length,breadth);
        rectangle.perimeter();
        rectangle.area();
        System.out.println("---------------------------------------------------");
        System.out.println();


        Square square=new Square(side);
        square.area();
        square.perimeter();
        System.out.println("---------------------------------------------------");
        System.out.println();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("side of square1");

        int side1=scanner1.nextInt();
        Square square1=new Square(side1);
        square1.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square2");
        int side2=scanner.nextInt();
        Square square2=new Square(side2);
        square2.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square3");
        int side3=scanner.nextInt();
        Square square3=new Square(side3);
        square3.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square4");
        int side4=scanner.nextInt();
        Square square4=new Square(side4);
        square4.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square5");
        int side5=scanner.nextInt();
        Square square5=new Square(side5);
        square5.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square6");
        int side6=scanner.nextInt();
        Square square6=new Square(side6);
        square6.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square7");
        int side7=scanner.nextInt();
        Square square7=new Square(side7);
        square7.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square8");
        int side8=scanner.nextInt();
        Square square8=new Square(side8);
        square8.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square9");
        int side9=scanner.nextInt();
        Square square9=new Square(side9);
        square9.area();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("side of square10");
        int side10=scanner.nextInt();
        Square square10=new Square(side10);
        square10.area();
    }
}
