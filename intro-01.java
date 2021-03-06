import java.io.*;
import java.util.*;

public class Main {

    public static Main T = new Main(); // 생성자

    public int solution(String str, char t) {
        int answer = 0 ;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        //System.out.println(str);

         //기본적인 for 문
//        for (int i = 0 ; i < str.length() ; i++) {
//            if (str.charAt(i) == t ) answer ++;
//        }

        //응용 for 문
        for( char x : str.toCharArray() ) {
            if (x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in); // 입력을 위한 인스턴스 생성


        String str = kb.next(); //문자열 입력
        char c = kb.next().charAt(0); //문자 하나 입력력


        System.out.println(T.solution(str, c)); // 결과 뽑기

   }

}
