public class Q4 {
        public static void main(String[] args) throws java.io.IOException{
        //write your answer here
        char lm;

        do{
            System.out.println("Please enter the number below to call the menu followed by enter, press h to quit");
            System.out.println("1 . Current account");
            System.out.println("2 . Credit Cards");
            System.out.println("3 . Loans");
            System.out.println("4 . Savings account");
            lm = (char) System.in.read();
            System.in.read();
            switch (lm){
                case'1':
                    System.out.println("Current account");
                break;
                case '2':
                    System.out.println("Credit cards");
                break;
                case '3':
                    System.out.println("Loans");
                break;
                case '4':
                    System.out.println("Savings account");
                break;
                case 'h':
                    System.out.println("bye");
                break;
                default:
                    System.out.println("I don't know what this does " + lm + " ,press h to hang up ");
            }
        }while (lm != 'h');
    }
}
