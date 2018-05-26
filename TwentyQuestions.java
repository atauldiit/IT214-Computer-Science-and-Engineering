public class TwentyQuestions
{
    public static void main(String[] args)
    { 
// Generate a number and answer questions
// while the user tries to guess the value.
        
        int limit = 0;
        int attempt = 5;
        StdOut.print("I'm thinking of a number ");
        StdOut.print("between 1 and ");
                
        limit = StdIn.readInt();
        int N = 1 + (int)(Math.random() * limit);
        
        int m = 0;   
        while(attempt >= 0 && m != N)
        {
            if (attempt > 0 )
            {               
// Solicit one guess and provide one answer
                StdOut.println("You have " +attempt+ " guesses left.");
                StdOut.print("What's your guess? ");
                m = StdIn.readInt();
                if (m == N) StdOut.println("You win!");
                if (m < N) StdOut.println("Too low");
                if (m > N) StdOut.println("Too high");
                attempt = attempt - 1;
            }            
            else
            {
                StdOut.println("You lose! \nSecret number is: "+N);
                break;
            }
        }
    }
}
//Run java TwentyQuestions 100