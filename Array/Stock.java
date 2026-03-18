package Array;

public class Stock {
    int max=Integer.MAX_VALUE;
    public void loop(int n,int arr[]){
        int result=0;
        for(int i=0;i<n;i++){
            result=process(i,arr);
        }
        System.out.println(result);
    }
    public int process(int i,int arr[]){
        for(int j=i+1;j<arr.length;j++){
            int min=arr[i]-arr[j];
            if(min<max){
                max=min;
            }
        }
        return Math.abs(max);
    }
    public static void approach2(int arr[]){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];
            }
            profit=arr[i]-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        System.out.println(maxProfit);
    }
    public static void approach3(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]<arr[i+1]){
                int profit=arr[i+1]-arr[i];
                sum+=profit;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
         int arr[]={7,1,4,3,8};
         //Stock ob=new Stock();
        //ob.loop(arr.length,arr);
        //approach2(arr);
        approach3(arr);
    }

}
