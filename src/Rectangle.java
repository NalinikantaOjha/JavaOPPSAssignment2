public class Rectangle {
    public int length;
    public  int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void perimeter(){
        System.out.println("perimeter is "+2*(length+breadth));
    }
    public void area(){
        System.out.println("area is "+length*breadth);
    }
}
