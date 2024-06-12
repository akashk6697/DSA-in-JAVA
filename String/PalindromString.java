package String;

public class PalindromString {
    // 1st Approach
    // static boolean isPalindrom( StringBuffer str){
    //     StringBuffer rev = new StringBuffer(str);
    //     rev.reverse();
      
    //     return str.toString().equals(rev.toString());
    // }

    //2nd Approach
    static boolean isPalindrom(StringBuffer str){
        int begin = 0;
        int end = str.length() - 1;
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end))
                return false;
                begin++;
                end--;
            }
        
        return true;
    }
    public static void main(String[] args) {
         
        StringBuffer str = new StringBuffer("ABBA");
        System.out.println(isPalindrom(str));  

    }
}
