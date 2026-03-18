import java.util.Scanner;

class Product{
    private int id;
    private  String name;
    private  Long price;
    private int quentity;

    public Product(int id, String name, Long price, int quentity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quentity = quentity;
    }

    public void updateQuerry(){
        if((price*quentity)>50000){
            price=price-price/4;
        }
        Scanner in=new Scanner(System.in);
        Product arr[]=new Product[5];
        for(int i=0;i<5;i++){

        }
    }
}
public class Stocks {
    public static void main(String[] args) {

    }
}
