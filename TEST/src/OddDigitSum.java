public class OddDigitSum {
    public static void main(String[] args) {
        int arr[]={12,45,22};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int x=arr[i];      //taking each elements one by one
            while(x != 0){     //extracting each digit of that element and find the sum of its digit
                int a=x%10;
                sum=sum+a;
                x=x/10;
            }
            if(sum%2 != 0){   //check the condition that the sum is even or odd
                System.out.println(arr[i]);  //if sum is odd we can print it
            }
        }
    }
}
