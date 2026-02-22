public class maxSecondLargest {

    public static int SecondLargest(int arr[],int n){
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        if(n==0 || n==1){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>largest) {
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i]!=largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args){
        int arr1[]={7,4,5};
        int n=arr1.length;
        int res1=maxSecondLargest.SecondLargest(arr1,n);
        System.out.println(res1);
    }

}
