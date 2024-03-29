public class ShapeTest
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Square(1.0);
        shapes[1] = new Circle(1.0);
        shapes[2] = new Sphere(1.0);
        shapes[3] = new Cube(1.0);


        for(Shape s : shapes)
        {
            if(s instanceof TwoDimensionalShape)
                System.out.printf("%sArea: %.2f\nType : Two dimensional Shape\n\n", s.toString(),((TwoDimensionalShape) s).calculateArea() );
            else if(s instanceof ThreeDimensionalShape)
                System.out.printf("%sSurface Area: %.2f\nVolume: %.2f\nType : Three dimensional Shape\n\n", s.toString(),
                        ((ThreeDimensionalShape) s).calculateArea(),
                        ((ThreeDimensionalShape) s).calculateVolume());
        }
    }

}