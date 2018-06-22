public class CheckPalindrome {

    static Boolean isPalindrome(String str) {
        if(str == null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }

    static Boolean isPalindromeStr(String str) {
        if(str == null) {
            return false;
        }
        for(int i = 0 ; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length() -1 -i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rakib") + "");
        System.out.println(isPalindromeStr("rakib") + "");
        System.out.println(isPalindrome("amma") + "");
        System.out.println(isPalindromeStr("amma") + "");
    }
}
