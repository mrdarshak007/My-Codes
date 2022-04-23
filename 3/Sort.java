import java.util.Scanner;

public class Sort {  
    
    
    static int partition(int a[], int lb, int ub)
    {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
      
        while(start < end)
        {
            while(a[start] <= pivot)
            {
                start++;
            }
            while(a[end] > pivot)
            {
                end--;
            }
            if(start < end)
            {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;

        return end;

    }

    static void quickSort(int a[], int start, int end)
    {
        if(start < end)
        {
            int p = partition(a, start, end);

            quickSort(a, start, p-1);
            quickSort(a, p+1, end);
        }
    }

    static void display(int a[], int size)
    {
        System.out.print("Array : ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a[];

        System.out.print("Enter the size of an array : ");
        int size = scan.nextInt();

        a = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.print("a["+i+"] = ");
            a[i] = scan.nextInt();
        }

        System.out.println("Array before sorting : ");
        display(a, size);

        quickSort(a, 0, size-1);

        System.out.println("Array after sorting : ");
        display(a, size);

    }
    
}
