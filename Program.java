import csm10jlab07.Line;


public class Program {
    public static void main(String[] args){
        // test cases

        // default constructor
        Line slopeOfOne = new Line();

        // test the get / set methods
        System.out.println("Test Get / Set");
        slopeOfOne.setA(-1);
        System.out.println("A == -1 ? " + (slopeOfOne.getA() == -1));
        slopeOfOne.setB(1);
        System.out.println("B == 1 ? " + (slopeOfOne.getB() == 1));
        slopeOfOne.setC(1);
        System.out.println("C == 1 ? " + (slopeOfOne.getC() == 1));
        System.out.println();

        // special constructor
        Line slopeOfTwo = new Line(-2, 1, 2);
        System.out.println("Test special constructor");
        System.out.println("A == -2 ? " + (slopeOfTwo.getA() == -2));
        System.out.println("B == 1 ? " + (slopeOfTwo.getB() == 1));
        System.out.println("C == 2 ? " + (slopeOfTwo.getC() == 2));
        System.out.println();

        // slope defined
        System.out.println("Test slope defined");
        System.out.println("Slope defined ? " + slopeOfTwo.getSlope());
        System.out.println();

        // slope undefined
        System.out.println("Test slope undefined");
        slopeOfTwo.setB(0);
        System.out.println("Slope NaN ? " + slopeOfTwo.getSlope());
        slopeOfTwo.setB(1);
        System.out.println();

        // Not required, but probably good to do
        // Horizontal
        System.out.println("Test Horizontal");
        slopeOfTwo.setA(0);
        System.out.println("IsHorizontal ? " + slopeOfTwo.isHorizontal());

        // not horizontal
        slopeOfTwo.setA(4);
        System.out.println("Not Horizontal ? " + slopeOfTwo.isHorizontal());
        System.out.println();
        // Not horizontal

        // Not required, but probably good to do
        // vertical
        System.out.println("Test Vertical");
        slopeOfTwo.setB(0);
        System.out.println("IsVertical ? " + slopeOfTwo.isVertical());
        // not vertical
        slopeOfTwo.setB(4);
        System.out.println("Not Vertical ? " + slopeOfTwo.isVertical());
        System.out.println();


        System.out.println("Test parallel"); 
        slopeOfOne = new Line(1, 1, 1);
        slopeOfTwo = new Line(1, 1, 45);
        System.out.println("Are parallel? " + slopeOfOne.parallelTo(slopeOfTwo));
        // not parallelTo
        slopeOfOne = new Line(1, 2, 3);
        slopeOfTwo = new Line(1, 3, 2);
        System.out.println("Are not parallel? " + slopeOfOne.parallelTo(slopeOfTwo));
        System.out.println();

        // perpendicularTo
        System.out.println("Test perpendicular");
        slopeOfTwo = new Line(-2, 1, 3);
        
        System.out.println("Are perpendicular? " + slopeOfTwo.perpendicularTo(slopeOfOne));
        // not perpendicularTo
        slopeOfTwo = new Line(5, 5, 5);
        System.out.println("Are not perpendicular? " + slopeOfOne.perpendicularTo(slopeOfTwo));
        System.out.println();

        System.out.println("Test equality");
        // equal (same coefficient)
        slopeOfOne = new Line(1, 1, 1);
        slopeOfTwo = new Line(1, 1, 1);
        System.out.println("Same coefficients, are equal? " + slopeOfOne.equals(slopeOfTwo));
        // equal (multiple of coefficients)
        slopeOfTwo = new Line(2, 2, 2);

        System.out.println("Different coefficients, same multiplier, are equal? "
                + slopeOfOne.equals(slopeOfTwo));

        // not equal
        slopeOfTwo = new Line(7, 8, 7);
        System.out.println("Are not equal? " + slopeOfOne.equals(slopeOfTwo));


    } 
    
}
