public class SecondSmallestElement {

    public static int secondSmallElement(int arr[],int n){

        int min=Integer.MAX_VALUE;
        int sMin=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                sMin=min;
                min=arr[i];
            } else if (arr[i]<sMin && arr[i] != min) {
                sMin = arr[i];
            }
        }
        return sMin;
    }
public static void main(String[] args){
        int arr[]={1,2,4,7,7,5};
        int n=arr.length;
        int res=SecondSmallestElement.secondSmallElement(arr,n);
    System.out.println(res);
}

}
