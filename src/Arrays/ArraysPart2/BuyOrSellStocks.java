package Arrays.ArraysPart2;
import static java.lang.Math.*;
public class BuyOrSellStocks {

    public static int Profit(int arr[]){
        int Buy=Integer.MAX_VALUE,maxprofit=0;
        for(int i=0;i<=arr.length-1;i++){
            if(Buy<arr[i]){
                int profit=arr[i]-Buy;
                maxprofit=max(profit,maxprofit);
            }
            else{
                Buy=arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={6, 89, 4, 3, 1};
        System.out.println(Profit(arr));
    }
}
