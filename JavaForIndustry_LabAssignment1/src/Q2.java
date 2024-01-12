public class Q2 {
    public static void main(String[] args) {
        //part 1: display even numbers between 0 and 1000
        System.out.println("Even numbers: ");
        int a = 0;
        while (a <= 1000){
            if (a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }

        //part 2: display odd numbers between 0 and 1000
        System.out.println("Odd Numbers: ");
        int b = 0;
        while (b <= 1000) {
            if (b % 2 != 0) {
                System.out.println(b);
            }
            b++;
        }

        //part 3: display all the multiples of 4 between 0 and 1000
        System.out.println("Multiples of 4: ");
        int c = 0;
        while (c <=1000) {
            if (c % 4 == 0){
                System.out.println(c);
            }
            c++;
        }

        //part 4: display all the numbers between 1 and 1000 replacing multiples of 3 with Java
        //multiples of 5 with Script and multiples of 3 and 5 with JavaScript
        System.out.println("Multiples of 5,3, and both are replaced: ");
        int d = 1;
        while (d <= 1000) {
            if (d % 15 == 0) {
                System.out.println("javascript");
            } else {
                if (d % 3 == 0) {
                    System.out.println("java");
                } else if (d % 5 == 0) {
                    System.out.println("Script");
                } else {
                    System.out.println(d);
                }
            }
            d++;
        }
    }
}