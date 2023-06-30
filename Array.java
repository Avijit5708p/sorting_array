import java.util.Scanner;
class Array
{
    void sort(int arr[])
    {
        int i,j,temp;
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
class Input
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner f1=new Scanner(System.in);
        System.out.println("enter 10 integer");
        for(int i=0;i<10;i++)
        {
            arr[i]=f1.nextInt();
        }
        Array f2=new Array();
        f2.sort(arr);


    }
}
