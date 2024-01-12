import java.util.*;
public class Q3Main {
    public static void main(String[] args) {

        //java api used to create a scanner object that allows a user input in the console.
        int l,s,d;
        System.out.println("Enter a length for your password");
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        System.out.println("Enter the number of symbols");
        s = in.nextInt();
        System.out.println("Enter the number of digits");
        d = in.nextInt();
        //each input is stored and inputted into the method call with a given length, symbols and digits.
        String password = Password.generator(l,s,d);

        System.out.println(password);
        //checks the strength of the password
        Password.validate(l,s,d);

    }
}
