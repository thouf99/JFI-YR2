public class Q3 {
    public static void main(String[] args) {

        double salary = 60000;
        System.out.println("Total tax on " + salary);
        //write your code here to calculate the tax of the variable salary, make sure you try multiple values
        // to test your work
        double tax = 0;
        double wages;

        if (salary > 50000){
            wages = salary - 50000;
            tax = tax + wages *0.4;
            salary -= wages;
        }
        if (salary >= 30000 && salary <= 50000) {
            wages = salary - 30000;
            tax = tax + wages * 0.2;
            salary -= wages;
        }
        if (salary >= 15000 && salary <=30000) {
            wages = salary - 15000;
            tax = tax + wages * 0.05;
        }

        System.out.printf("is %.2f: ", tax);
    }
}
