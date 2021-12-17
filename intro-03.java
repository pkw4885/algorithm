import java.util.Scanner;

public class Main3 {

    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE;
        int pos;

        // split 을 이용해서 푸는 방법
//        String[] s = str.split(" ");
////        System.out.println(s); // 이렇게 하면 ["it" , "is" , "time"] 이렇게 보일 줄 알았는데 왜 안 보일까?
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }

        // indexOf로 푸는 법


        while ( (pos = str.indexOf(' '))!= -1 ) {
            // index 0 부터 찾음. 띄어쓰기 발견되면 -1 이 아님. while 문 진행
            // index 0 부터 찾음. 띄어쓰기가 발견 안 되면 -1 변환되며, while문 종료
            String tmp = str.substring(0, pos); //
            // pos는 띄어쓰기 있는 부분의 index번호
            // tmp 는 0번 부터 pos 전까지 글자
            int len = tmp.length();
            // 띄어쓰기 앞에서 잘린 tmp 의 길이
            if (len > m) {
                // tmp의 길이가 m 보다 크면
                m = len;
                // m 에 길이 업데이트
                answer = tmp;
                // 정답은 tmp 그 자체 !
            }
            str = str.substring(pos + 1) ; //pos 뒤 지점 부터 쭉 str배열을 str에 입력
        }
        if (str.length() > m) answer = str; // 맨 마지막 단어가 제일 길 경우는 while문이 이미 종료 되므로!
        return answer;

    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // next는 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다. 쉽게 말해 공백 이후의 글자는 날라간다?! nextLine은 문장 전체가 공백 포함해서 통으로 입력됨
        System.out.println(T.solution(str));
    }

}
