public class Parameterized {
    public static boolean isPalindrome(String str){
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}
