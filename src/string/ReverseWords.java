package string;

public class ReverseWords {
    public String reversewords(String s){
        StringBuffer t = removeSpace(s);
        reverse(t,0,s.length()-1);
        reverseEachword(t);
        return t.toString();
    }

    public StringBuffer removeSpace(String s){
        StringBuffer t = new StringBuffer();
        int left = 0 , right = s.length()-1;
        while(s.charAt(left)==' ') left++;
        while(s.charAt(right)==' ') right--;
        while(left<=right){
            if (s.charAt(left)!=0){
                t.append(s.charAt(left));
            }else{
                if(t.charAt(t.length()-1)!=0) t.append(s.charAt(left));
            }
            left++;
        }
        return t;
    }

    public void reverse(StringBuffer s , int start , int end){
        while(start<end){
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end)) ;
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }

    public void reverseEachword(StringBuffer s){
        int left = 0,right=0;
        while(right<s.length()){
            right=left+1;
            while (right<s.length()&&s.charAt(right)!=' ') right++;
            reverse(s,left,right-1);
            left=right+1;
        }
    }
}
