public class Invoice {
    int id;
    String description;
    int quantity;
    double unitPrice;
    boolean paid;

    //constructor for invoicce
    Invoice(int i, String d, int q, double up, boolean p){
        id = i;
        description = d;
        quantity = q;
        unitPrice = up;
        paid = false;
    }

    //toString method that turns all the values that were inputted as a string
    public String toString(){
        return "\"InvoiceItem["+ "Id= "+id + ", Description= "+ description
                    + ", Quantity= " + quantity + ", unitPrice= " + unitPrice +
                        ", Paid= " + paid + "]\"";
    }

    //getter function that gets paid
    public boolean getPaid() {
        return paid;
    }

    //setter function that sets paid to either true or false.
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
