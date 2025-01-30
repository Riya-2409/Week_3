package stackandqueue.stockspanproblem;

//Create the class name StockSpanMain
public class StockSpanMain {

    //Create the main method
    public static void main(String args[]){
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        StockSpan.stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i] +" ");
        }
    }
}
