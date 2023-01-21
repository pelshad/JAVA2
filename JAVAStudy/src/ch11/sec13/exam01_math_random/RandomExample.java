package ch11.sec13.exam01_math_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //선택번호
        int[] selNum = new int[6];
        Random random = new Random();
        System.out.print("선택번호 : ");
        for(int i=0; i<6; i++){
            selNum[i] = random.nextInt(45) + 1;
            System.out.print(selNum[i] + " ");
        }
        System.out.println();

        //당첨번호
        int[] resultNum = new int[6];
        random = new Random();
        System.out.print("당첨번호 : ");
        for(int i=0; i<6; i++){
            resultNum[i] = random.nextInt(45) + 1;
            System.out.print(resultNum[i] + " ");
        }
        System.out.println();

        //선택번호 당첨번호 비교
        Arrays.sort(selNum);
        Arrays.sort(resultNum);
        boolean result = Arrays.equals(selNum,resultNum);
        System.out.println("당첨여부 : ");
        //각 배열의 랜덤 함수에 종자값이 같으면 동일한 랜덤값이 나온다.
        //Random random = new Random( 종자값 );
        if(result){
            System.out.println("당첨 되었습니다");
        } else {
            System.out.println("당첨되지 않았습니다");
        }
    }
}
