public class LargestElement {

    public static int maxElement(int arr[],int n){
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int arr1[]={3,2,7,5,1,4};
        int n=arr1.length;
        int result1=LargestElement.maxElement(arr1,n);
        System.out.println("MaX Element: "+result1);

        int arr2[]={31,21,72,51,11,41};
        n=arr2.length;
        int result2=LargestElement.maxElement(arr2,n);
        System.out.println("MaX Element: "+result2);

    }
}
