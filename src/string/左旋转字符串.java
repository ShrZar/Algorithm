package string;
/*字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

示例 1：
输入: s = "abcdefg", k = 2
输出: "cdefgab"

示例 2：
输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"

限制：
1 <= k < s.length <= 10000*/
public class 左旋转字符串 {
    public static String myMethod(String s,int k){
        StringBuffer t = new StringBuffer(s);

        for (int i = 0; i < k; i++) {
            t.append(s.charAt(i));
        }

        return t.substring(k,s.length()+k).toString();
    }

    public static void main(String[] args) {
        System.out.println(myMethod(new String("abcdefg"),2));
    }

    public static String reverseLeft(String s,int k){
        StringBuffer t = new StringBuffer(s);
        reverse(t,0,s.length()-1);
        reverse(t,0,k-1);
        reverse(t,k,s.length()-1);
        return t.toString();
    }

    public static void reverse(StringBuffer s , int start , int end){
        while(start<end){
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end)) ;
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }

}
