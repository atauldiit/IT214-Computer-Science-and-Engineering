public class SquareAbsolute 
{
    public static double square(double a)
    {
        //double x = Math.pow(a, 2);
        double x = a*a;
        
        return x;
    }
    public static double absolute(double b)
    {
        //double y = Math.abs(b);        
        double y = b*-1; 
        
        return y;
    }
    
    public static void main (String[] args)
    {
        double x = Integer.parseInt(args[0]); 
        double y = Integer.parseInt(args[1]); 
        
        //x = absolute(x);
        //y = absolute(y);
        
        double e =  (square(x)+square(y));
        
        StdOut.println("x: "+ x +"\ny: "+ y +"\nAbsolute value of (x^2 + y^2): "+ e);
        
        
    }
}