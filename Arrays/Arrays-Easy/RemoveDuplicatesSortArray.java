public class RemoveDuplicatesSortArray {

    public boolean IsArraySorted(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public void RemoveDuplicates(int arr[]){
        int n=arr.length;
        int result[]=new int[n];
        int index=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                result[index]=arr[i];
                index++;
            }
        }
        result[index] = arr[n-1];
        index++;

        for(int i=0;i<index;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,2,5,6};

        RemoveDuplicatesSortArray removeDuplicatesSortArray=new RemoveDuplicatesSortArray();
        System.out.println("Array is sorted or not : "+removeDuplicatesSortArray.IsArraySorted(arr));
        if(removeDuplicatesSortArray.IsArraySorted(arr)==true){
            removeDuplicatesSortArray.RemoveDuplicates(arr);
        }else {
            System.out.println("Array is not sorted not perform remove duplicates.");
        }

    }
}

