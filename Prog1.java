import java.util.*;
public class Prog1
{
    void Sort_binary(int[] a,int n1)
    {
        for (int in = 0; in <n1 - 1; in++)  
        {  
            int index = in;  
            for (int j = in + 1; j <n1; j++)
            {  
                if (a[j] < a[index])
                {  
                    index = j;
                }  
            }  
            int temp = a[index];   
            a[index] = a[in];  
            a[in] = temp;
        }    
    }
    
    public static void main(String args[])
    {
        int n,i,s;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
           s=sc.nextInt();
           if(s>=0&s<=1)
           {
              arr[i]=s;
           }
           else
           {
               System.out.println("Invalid input");
           }
           
        }
        System.out.println("Unsorted array is:");
        for(i=0;i<n;i++)
        {
           System.out.println(arr[i]);
        }
        Prog1 ob=new Prog1();
        ob.Sort_binary(arr,n);
        
        System.out.println("Sorted array is:");
        for(i=0;i<n;i++)
        {
           System.out.println(arr[i]);
        }
    }
}