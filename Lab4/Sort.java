/**
 * The Sort class contains the sorting algorithms called from the Lab4Client 
 * class.
 * 
 */
public class Sort
{
    //Attributes
    //Constructors
    //Methods
    public static void selectionSort(String[] list, int count)
    {
        
        System.out.println("selectionSort with " + count + " elements");
        System.out.println();
        System.out.println("Original list:");
        for(int i = 0; i < count; i++)
        {
            System.out.println(list[i]);
        }
        System.out.println("");
        for (int i = 0; i<count; i++)
        {
           String currentMin = list[i];
           int currentMinIndex = i;
           for(int j = i + 1; j < count; j++)
           {
               if (currentMin.compareTo(list[j]) > 0)
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
        System.out.println("Sorted list:");
        for(int i = 0; i < count; i++)
        {
            System.out.println(list[i]);
        }
    }
    
    //mergeSort implements quickSort in the text pg 871
    public static void mergeSort(String[] list)
    {
        System.out.println("mergeSort");
        System.out.println();
        quickSort(list, 0, list.length-1);
    }
    
    public static int partition(String[] list, int first, int last)
    {
        String pivot = list[first];
        int low = first+1;
        int high = last;
        while (pivot.compareTo(list[high]) > pivot.compareTo(list[low]))
        {
            while (pivot.compareTo(list[low]) <= pivot.compareTo(list[high]) && pivot.compareTo(list[low]) <= 0)
            {
                low++;
            }
            while (pivot.compareTo(list[low]) <= pivot.compareTo(list[high]) && pivot.compareTo(list[high]) >= 0)
            {
                high --;
            }
            if (high > low)
            {
                String temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (pivot.compareTo(list[high]) > pivot.compareTo(list[first]) && pivot.compareTo(list[low]) <= 0)
        {
            high --;
        }
        
            if (pivot.compareTo(list[high]) >= 0)
            {
                list[first] = list[high];
                list[high] = pivot;
                return high;
            }
            else
            {
                
                return first;
            }
        }
        
    

    
    public static void quickSort(String[] list, int first, int last)
    {
        if (last > first)
        {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex-1);
            
        }
    }
}
