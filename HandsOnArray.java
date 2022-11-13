import java.util.*;
class HandsOnArray
{
    public static void main(String []args)
     {
        //declaration type 1
      int arr[]=new int[5];
     Arrays.fill(arr,-1); //like bariore where arr is null this function is fill -1. 
      
      //declartion type2
      //int arr[]={13,22,43,42,53,46,37,28,49};
       insertionAtBegining(arr,5);
       insertionAtBegining(arr,53);
       insertionAtMid(arr,9,3);
       insertionAtEnd(arr,8);
       
    // HandsOnArray obj=new HandsOnArray(); //when method is not static 
    //   obj.printArray(arr);
    printArray(arr);
           
    }
    //print method is start
    static void printArray(int arr[])
    {
        for(int i:arr)
        {
            System.out.println(i);
        }
    }

    //insertionAtbegining method is start
   static void insertionAtBegining (int arr[],int element)
    {
        int lastindex=arr.length-1;
        if(arr[lastindex]!=-1)
        {
            System.out.println("Array is full");
            return; //return control 
        }
        if(arr[0]==-1)
        {
            arr[0]=element;
        }
        else{
            for(int i=lastindex-1;i>=0;i--)
            {
                arr[i+1]=arr[i];
            }arr[0]=element;
        }
    }
    //lastinsertionatend
    static void insertionAtEnd (int arr[],int element)
    {
        int lastindex=arr.length-1;
        if(arr[lastindex]!=-1)
        {
            System.out.println("Array is full");
            return; //return control 
        }
        
        else{
            arr[lastindex]=element;
        }
    }
    static void insertionAtMid(int arr[],int element,int index)
    {
        int lastindex=arr.length-1;
        if(arr[lastindex]!=-1)
        {
            System.out.println("Array is full");
            return;
        }
        if(arr[index]==-1)
        {
            arr[index]=element;
        }
        else{
            //shifting logic
            for(int i=lastindex-1;i>index;i++)
            {
                arr[i+1]=arr[i];
            }
            arr[index]=element;
        }
    }

}