public class MirrorInverse {
    public static void main(String args[])
    {
        int count = 0;
        int arr[]={3,4,2,0,1};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[arr[i]]==i)
            {
                count++;
            }
        }
        if(count!=0)
        {System.out.println("Given array is mirror inverse");
    }
    else{
        System.out.println("Given array is not mirror inverse"); 
    }
    }
}
