public class test0401_1 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
    static String solution(String s) {
        String answer = "";
        int len;
        if(s.length() % 2 == 0) {
            len = s.length()/2 - 1;
            answer = s.substring(len, len+2);
        }
        else {
            len = s.length()/2;
            answer = s.substring(len, len+1);
        }
        return answer;
    }
}
