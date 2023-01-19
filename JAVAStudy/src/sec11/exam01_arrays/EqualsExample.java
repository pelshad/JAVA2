package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[][] origin = {{1,2},{3,4}};

        //얕은 복사 후 비교
        int[][] clone1 = Arrays.copyOf(origin, origin.length);
        //origin 배열과 clone1의 번지수 비교(== 비교와 동일)
        System.out.println("배열 번지 비교 : " + origin.equals(clone1));
        //origin 배열과 clone1의 각 값의 번지수 비교
        System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(origin,clone1));
        //origin 배열과 clone1의 각 중첩 배열의 값 비교
        System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(origin,clone1) + "\n");

        //깊은 복사 후 비교
        int[][] clone2 = Arrays.copyOf(origin, origin.length);
        clone2[0] = Arrays.copyOf(origin[0], origin[0].length);
        clone2[1] = Arrays.copyOf(origin[1], origin[1].length);
        //origin 배열과 clone1의 번지수 비교(== 비교와 동일)
        System.out.println("배열 번지 비교 : " + origin.equals(clone2));
        //origin 배열과 clone1의 각 값의 번지수 비교
        System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(origin,clone2));
        //origin 배열과 clone1의 각 중첩 배열의 값 비교
        System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(origin,clone2));
    }
}
