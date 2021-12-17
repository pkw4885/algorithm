import java.util.Scanner;
import java.util.*;

public class Main2 {

    public static Main2 T = new Main2();

    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()) {
            // Character 메소드를 이용하는 방법
//            if ( Character.isLowerCase(x) )
//                answer +=Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);

            // 아스키 넘버로 하는 방법
            if (x>=97 && x<=122) //이렇게 하면 소문자
                {
                answer += (char)(x-32);  //char로 캐스트 !
            } else {
                answer += (char)(x+32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }

}
