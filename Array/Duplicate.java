package Array;
//remove duplicate from sorted array
public class Duplicate {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,3,3,3,4,5,5,};
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        int n=i+1;
        for(int k=0;k<n;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
