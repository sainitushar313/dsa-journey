public class ArrayIsSortedOrNot {

    public boolean IsArraySorted(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr[]={1,2,2,9,5,6};

        ArrayIsSortedOrNot arrayIsSortedOrNot=new ArrayIsSortedOrNot();
        System.out.println(arrayIsSortedOrNot.IsArraySorted(arr));
    }
}
