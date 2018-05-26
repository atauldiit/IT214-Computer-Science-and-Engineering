class TriangleArea {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        int s = (a + b + c) / 2;
        
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        StdOut.println(area);
    }
}