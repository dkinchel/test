public class BCoeff
{
    public static int rec(int n, int k)
    {
        //Base cases
        if(k==0 || k==n)
        return 1;

        //Recur
        return rec(n-1, k-1) + rec(n-1, k);
    }

    public static int dp(int n, int k)
    {
        int[] der = [n+1];
        // Base cases
        der[0] = 1;
        der[1] = 0;
        der[2] = 1;

        //Fill der[0..n] in bottom up manner
        for (int i = 3 to n)
        der[i] = (i-1)*(der[i-1] + der[i-2]);

    }

    public static void main(String[] args)
    {
        System.out.println("rec solution" + BCoeff.rec (4,2));
        System.out.println("dynamic solution" + BCoeff.dp (4,2));

    }


}
