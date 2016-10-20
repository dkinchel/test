public class ArrayList<T>
{
    //Using generics
    private T[] array;
    private int size;
    public static final int capacity = 10;
    
    public ArrayList()
    {
        size = 0;
        T[] array = (T[])(new Object[capacity]); //Due to use of generics
    }

    public ArrayList(T[] A)
    {
        size = A.length;
        array = A;
    }

    public static void min(String[] args)
    {
        ArrayList<Integer> a1 = new ArrayList<>();
        Integer [] ia = {3,5,9,1};
        ArrayList<Integer> other = new ArrayList<>(ia);
        System.out.println(a1); //requires implementation of testing method
        System.out.println(other); //requires implementation of toString method
    }
}
