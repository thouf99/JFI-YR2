public class Q1 {
    public static void main(String[] args) {
        //write your code here to output the employee details
        String e = "Employee Reference";
        System.out.println(e);
        //string for Employee Reference

        String l = "---------------";
        System.out.println(l);
        //string for line break

        short id = 12345;
        System.out.println("ID Number: " + id);
        //string for the id number

        String n = "\"Jack Smith\"";
        System.out.println("Name: " + n);
        //string for the name and in speech marks

        int a = 52;
        System.out.println("Age: " + a);
        //string for the age

        double s = 27736.80;
        System.out.printf("Salary: %.2f" , s);
        System.out.println("");
        //string for salary

        int r = 66 - a;

        System.out.println("Years to Retirement: " + r);
        //String for years to retirement

        double hr = s/(35*52);
        System.out.println("Hourly Rate: " + hr);


    }
}
