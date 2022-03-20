package string;

public class ReverseString {
    public String reverse(String s){
        char[] t = s.toCharArray();
        for (int i = 0,j=s.length()-1; i<j; i++,j--) {
            t[i]^=t[j];
            t[j]^=t[i];
            t[i]^=t[j];
        }
        s = t.toString();
        return s;
    }
}
