public class test0402 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(solution(a, b));
        int[] c = {-1,0,1};
        int[] d = {1,0,-1};
        System.out.println(solution(c, d));
    }
    static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++)
            answer += (a[i] * b[i]);
        return answer;
    }
}
