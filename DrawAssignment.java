public class DrawAssignment
{
    public static void main(String[] args) { 
        
        //Rectangle
        StdDraw.setPenColor(StdDraw.RED);       
        StdDraw.filledRectangle(.10, .9, .7, .3);
        
        //Circle
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledCircle(.8, .2, .2);
        
        //Polygon
        StdDraw.setPenColor(StdDraw.BLUE);
        double[] xd = { .1, .2, .3, .2 };
        double[] yd = { .2, .3, .2, .1 };
        StdDraw.filledPolygon(xd, yd);
    }
}