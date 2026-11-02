class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
           if(sum==target){
            
            return new int[]{i, j};
           }
        }
        }
       
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        int n=scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        int[] result=twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}