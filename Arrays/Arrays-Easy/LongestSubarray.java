public class LongestSubarray {

    public int longestSubArray(int arr[], int k) {
        int n=arr.length;
        int maxLength=0;
        for(int startIndex = 0; startIndex<n; startIndex++) {
           for(int endIndex =startIndex;endIndex <n;endIndex ++){
               int currentSum=0;
               for(int i=startIndex;i<=endIndex;i++){
                   currentSum+=arr[i];
               }
               if(currentSum==k){
                   maxLength=Math.max(maxLength,endIndex-startIndex+1);
               }
            }
        }
return maxLength;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int k=6;

        LongestSubarray longestSubarray=new LongestSubarray();
        int length=longestSubarray.longestSubArray(arr,k);

        System.out.println("length of longest subarray is: "+length);
    }
}
