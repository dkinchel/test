import java.util.*;
import java.io.*;


public class Lab5
{
    private int CITI;
    private int [][] adjacency;
    private int bestcost = Integer.MAX_VALUE;
    private ArrayList<Integer>bestpath;
    
    public Lab5(int n)
    {
        CITI = n;
        adjacency = new int[CITI][CITI];
        bestpath = new ArrayList<>();
    
    }
    
    public void populsteMatrix(String fname)
    {
        File f = new File(fname);
        try
        {
            Scanner input = new Scanner(f);
            int i, j;
            for(i=0; i< CITI && input.hasNext(); i++)
            {
                for(j=i; j< CITI && input.hasNext(); j++)
                {
                    if(i==j)
                    {
                        adjacency [i][j] = 0;
                    }
                else
                {
                    int value = input.nextInt();
                    adjacency[i][j] = value;
                    adjacency[j][i] = value;
                }
                }
            }
            input.close();
        }
        catch(IOException e)
        {
            System.out.println("file reading failed!");
        }
    }
    
    public static void main (String[] args)
    {
        Lab5 tsp = new Lab5(Integer.parseInt(args[0]));
        //String input = in.next();
        tsp.populateMatrix(input);
        ArrayList<Integer> partialT = new ArrayList<>();
        partialT.add(0);
        ArrayList<Integer> remainingT = new ArrayList<>();
        for(int i=1; i< number;i++)
        {
            remainingT.add(i);
        }
    }
 }
