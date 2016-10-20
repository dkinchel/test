import java.util.*;

public class subSequence
{
    public static void main (String[] args )
    {
        int N = Integer.parseInt(args[0]);
        int[] num = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++)
        {
            if (Math.random() < 0.5)
                num[i] = r.nextInt(Integer.MAX_VALUE)*-1;
            else
                num[i] = r.nextInt(Integer.MAX_VALUE);
        }
    
        long start = System.nanoTime();
        methodOne(num);
        long stop = System.nanoTime();
        System.out.println("methodOne " + (stop-start));
        
        
        start = System.nanoTime();
        methodTwo(num);
        stop = System.nanoTime();
        System.out.println("methodTwo " + (stop-start));
                            
        start = System.nanoTime();
        methodThree(num);
        stop = System.nanoTime();
        System.out.println("methodThree " + (stop-start));
     
    }

        public static int methodOne(int[] num)
        {
            int best = 0;
            for (int i = 0; i < num.length; i++)
            {
                for (int j = 0; j < num.length; j++)
                {
                    int current = 0;
                    for (int k = i; k <= j; k++)
                    {
                        current += num[k];
                    }
                    if (current > best)
                        best = current;
                }
                            
            }
                            
            return best;
        }
    
        
        public static int methodTwo(int[] num)
        {
            int best = 0;
            for (int i = 0; i < num.length; i++)
            {
                int current = 0;
                for (int j = i; j < num.length; j++)
                {
                    current += num[j];
                    if (current > best)
                        best = current;
                }
            }
            return best;
        }

        public static int methodThree(int[] num)
        {
            int best = 0;
            int current = 0;
            for (int j = 0; j < num.length; j++)
            {
                current += num[j];
                if (current < 0)
                    current = 0;
                else
                    current = best;
            }
            return best;
        }
        


}