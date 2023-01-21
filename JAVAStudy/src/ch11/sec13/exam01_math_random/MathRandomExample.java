package ch11.sec13.exam01_math_random;

public class MathRandomExample {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6 + 1);
        System.out.println(num);

//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 0; i<10; i++){
//            arr.add(i,(int)(Math.random()*10+11));
//            for(int j = 0; j<i; j++){
//                if(arr.get(i) == arr.get(j)){
//                    arr.remove(j);
//                    i--;
//                }
//            }
//        }
//        System.out.println(arr);



    }
}
