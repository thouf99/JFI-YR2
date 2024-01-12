public class Q1Main {
    public static void main(String[] args) {
        //invoice class for new invoice items

        Invoice sales = new Invoice(12,"kettle",3,20,false);
        Invoice quote = new Invoice(90, "toaster",10,60,false);

        //set the paid from false to true
        sales.setPaid(true);
        System.out.println(sales);
        sales.setPaid(true);
        System.out.println(quote);
    }
}