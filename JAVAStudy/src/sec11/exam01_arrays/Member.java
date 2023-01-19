package sec11.exam01_arrays;

public class Member implements Comparable<Member>{
    String name;

    Member(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        //compareTo :: 문자열에서 사용되는 메소드
        //"a".compareTo("b")를 할 경우 a가 b보다 문자코드가 작기 때문에 -1을 리턴
        //"c".compareTo("b")일 경우 1을 리턴
        return name.compareTo(o.name);
    }
}
