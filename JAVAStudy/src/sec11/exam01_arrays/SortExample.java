package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args){
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        //System.out.println(Arrays.toString(scores));
        for(int i = 0; i<scores.length; i++){
            System.out.println(scores[i]);
        }

        String[] names = {"홍길동", "장보고", "신사임당"};
        for(String name : names){
            System.out.println(name);
        }

        Member m1 = new Member("홍길동");
        Member m2 = new Member("장보고");
        Member m3 = new Member("신사임당");
        Member[] members = {m1,m2,m3};
        //Comparable 인터페이스를 구현하지 않을 경우 예외 발생
        //Member.java 파일 참고
        Arrays.sort(members);
        for(Member member : members){
            System.out.println(member.name);
        }
    }
}
