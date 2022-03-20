package string;
/*给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。

如果剩余字符少于 k 个，则将剩余字符全部反转。

如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。

示例:

输入: s = "abcdefg", k = 2
输出: "bacdfeg"*/
public class ReverseString2 {
    public static String reverse2(String s,int k){
        char[] t = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            int start = i;
            int end =start+k-1;
            while(end>s.length()-1) end--;
            while(start<end){
               t[start]^=t[end];
               t[end]^=t[start];
                t[start]^=t[end];
                start++;
                end--;
            }
        }
        return new String(t);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverse2(s,2));

    }
}
