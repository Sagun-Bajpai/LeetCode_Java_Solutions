class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>result=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            int left=i+1;
            int right=n-1;
            int sum=-1*arr[i];
            while(left<right){
                if(arr[left]+arr[right]==sum){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                     //duplicate skip
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1])  left++;
                    while(left<right&& arr[right]==arr[right+1]) right--;
                  
                }
               
                else if(arr[left]+arr[right]<sum){
                    left++;
                }
                else{
                    right--;
                }

            }
        }
        return result;   
    }   
}