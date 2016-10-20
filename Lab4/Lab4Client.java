
/**
 * C202 Lab4
 * Lab4Client.java
 * Purpose: This program implements two algorithms to sort elements in a string 
 * array. 
 * One algorithm is a selection sort. The other algorithm is the merge sort. 
 * Both algorithms are in the sort class.
 * This program was tested with arrays containing zero elements, 7 elements and 
 * 134173 elements.
 *  
 * @author Dewey Kincheloe
 * @version 1.0 9/17/2016
 */

import java.util.*;
import java.io.*;

public class Lab4Client 
{
 public static void main(String[] args) 
 {    
     Lab4Client obj = new Lab4Client();
     int N = 1000;
     int[] num = new int[N];
     int[] temp = new int[N];
     Random r = new Random();
     for (int i = 0; i < N; i++)
     {
         num[i] = r.nextInt(Integer.MAX_VALUE);
     } 
     long sum = 0;
     long start, stop;
     for(int i = 0; i < 10; i++)
     {
         System.arraycopy(num,0,temp,0,N);
         start = System.nanoTime();
         obj.selectionSort(temp);
         //Arrays.sort(temp);
         stop = System.nanoTime();
         sum += (stop-start);
     }
     System.out.println(sum/10.0);
     
}
public static void selectionSort(int[] list)
{

for (int i = 0; i<list.length; i++)
{
    int currentMin = list[i];
    int currentMinIndex = i;
    for(int j = i + 1; j < list.length; j++)
    {
        if (currentMin > list[j])
        {
            currentMin = list[j];
            currentMinIndex = j;
        }
}
    // Swap
    if (currentMinIndex != i)
    {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
    }
}

}

    
    
    /*
  	public static void main(String[] args) {
        int elementCount = 0;
        Sort st = new Sort(); // Assumes you write all sort methods in a class named Sort
  		String[] a = new String[134173];
		File f = new File ("random_dictionary.txt");
		try{	
			int i = 0;
			Scanner in = new Scanner(f);
			while ( in.hasNext() && i < a.length){
				a[i] = in.next();
                                i++;
                                elementCount = i;
			}
			in.close();
		}
		catch(IOException e){
			System.out.println("Unable to read file");
		}
        
        if (elementCount == 0)
        { System.out.println("The list is empty");}
        else if (elementCount <= 50)
        {
            long start = System.nanoTime();
            Sort.selectionSort(a, elementCount);
            long stop = System.nanoTime();
            System.out.println("Time to sort using selectionSort " + (double)(stop-start)/Math.pow(10,9) +" sec");
            //for(String s:a) // uncomment only when you want to check if words are sorted.
            //System.out.println(s);
        }
        else
        {
            long start = System.nanoTime();
            Sort.mergeSort(a);
            long stop = System.nanoTime();
            System.out.println("Time to sort using selectionSort " + (double)(stop-start)/Math.pow(10,9) +" sec");
            //for(String s:a) // uncomment only when you want to check if words are sorted.
            //System.out.println(s);
        }
        
        
        /*
        //measure time
        long start = System.nanoTime();
        //st.xxxx(a); // change the method call with relevant sort method name
        long stop = System.nanoTime();
        
        System.out.println("Time to sort using xxxx sort " + (double)(stop-start)/Math.pow(10,9) +" sec");
        /*for(String s:a) // uncomment only when you want to check if words are sorted.
             System.out.println(s);
         */
          
  	}


