package ch11.sec12.exam02_wrapper;

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        //자동 Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        //대입시 자동 Unboxing
        int value = obj; // 원래는 잘못된 문법, 위에 선언된 obj의 Integer가 int로 되어 저장
        System.out.println("value : " + value);

        //연산시 자동 unBoxing
        int result = obj + 100; // 원래는 잘못된 문법,
        System.out.println("result : " + result);
    }
}
