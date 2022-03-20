package string;
/*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1： 输入：s = "We are happy."
输出："We%20are%20happy."*/
public class SwapBlank {
    public static String replaceSpace(StringBuffer s){
        StringBuffer t = new StringBuffer();
        if(s==null) return null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                t.append("%20");
            }else t.append(s.charAt(i));
        }
        return t.toString();

    }

    public static String replaceSpace(String s){
        if(s==null&&s.length()==0) return s;
        StringBuffer t = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                t.append("  ");
            }
        }
        if (t.length()==0) return s;
        int left = s.length()-1;
        s+=t.toString();
        int right = s.length()-1;
        char[] a = s.toCharArray();
        while(left<right){
            if(a[left]==' '){
                a[right--]='0';
                a[right--]='2';
                a[right]='%';
            }else a[right] = a[left];
            left--;
            right--;
        }
        return new String(a);
    }
}
