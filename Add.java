public class Add {
    public static void main(String[] args) {
        
        // prompt user for first integer and read from standard input
        StdOut.println("Type the first integer");
        int x = StdIn.readInt();
        
        // prompt user for second integer and read from standard input
        StdOut.println("Type the second integer");
        int y = StdIn.readInt();
        
        while(x<0 || y <0)
        {
            StdOut.println("You enter negetive number. Please enter positive number:");
            StdOut.println("Type the first integer");
            x = StdIn.readInt();
            StdOut.println("Type the second integer");
            y = StdIn.readInt();            
        }        
        // compute sum and print to standard output
        int sum = x + y;
        StdOut.println("Their sum is " + sum);
    }
}