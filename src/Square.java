public class Square extends Rectangle{
    public int side;


    public Square(int side) {
        super(side, side);

        this.side=side;

    }


    @Override
    public void area() {
        System.out.println("area of square is "+side*side);
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter of square is " +4*side);
    }
}
