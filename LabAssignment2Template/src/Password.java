public class Password {

    int length ;
    int symbol ;
    int digit ;

    //randomly chooses and randomizes the chosen string and point it to password string
    public static String rCharacter(String word){
        int l = word.length();
        int ranz = (int) (l * Math.random());
        return word.substring(ranz, ranz + 1);
    }

    //randomly inserts string of different types at random to the password string
    public static String changeChar(String leter, String improve){
        int len = leter.length();
        int ran  = (int) ((len + 1) * Math.random());
        return leter.substring(0, ran) + improve + leter.substring(ran);
    }

    //password generator
    public static String generator(int length, int symbol, int digit){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "123456789";
        String special = "!@£$%^&*(){}|:?><~";
        String password = "";

        for(int i = 0; i < length - symbol - digit; i++){
            password = password + rCharacter(letters);
        }
        for(int i = 0; i < symbol; i++){
            password = changeChar(password, rCharacter(special));
        }
        for(int i = 0; i < digit; i++){
            password = changeChar(password, rCharacter(numbers));
        }
        return password;
    }
    //checks if the password is good or not and returns nother
    public static String validate(int length, int symbol, int digit) {
        if (length >= 16 && symbol > 4 && digit > 4) {
            System.out.println("Excellent");
        }
        else if (length > 12 && symbol > 3 && digit > 3) {
            System.out.println("Good");
        }
        else if (length > 8 && symbol > 1 && digit > 2) {
            System.out.println("Ok");
        }
        else if (length <= 8 && symbol <= 1 && digit <= 2) {
            System.out.println("Poor");
        }
        else {
            System.out.println("Password doesn't meet any of the required requirements for a " +
                    "strong password");
        }
        return null;
    }
}
