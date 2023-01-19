package ch11.sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args){
        int[] scores = {99, 97, 98};
        //배열 정리 {97, 98, 99}
        Arrays.sort(scores);
        //99의 값을 찾기(binarySearch 사용시 sort로 정렬하지 않으면 이상한 값으로 출력됨)
        int index = Arrays.binarySearch(scores, 99);
        System.out.println(index);

        String[] names = {"홍길동", "장보고", "신사임당"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names,"홍길동");
        System.out.println(index);

        Member m1 = new Member("홍길동");
        Member m2 = new Member("장보고");
        Member m3 = new Member("신사임당");
        Member[] members = {m1,m2,m3};
        //Comparable 인터페이스를 구현하지 않을 경우 예외 발생
        //Member.java 파일 참고
        Arrays.sort(members);
        index = Arrays.binarySearch(members,m1);
        System.out.println(index);
    }
}
