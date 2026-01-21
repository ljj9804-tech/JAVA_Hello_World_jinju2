package JAVA_260121;

import java.util.HashSet;

public class A02_HashSet_Test {
    public static void main(String[] args) {

        HashSet<Integer> lottoSet = new HashSet<>();

        lottoSet.add(5);
        lottoSet.add(12);
        lottoSet.add(5);
        lottoSet.add(20);
        lottoSet.add(12);
        lottoSet.add(7);


        System.out.println("현재 lottoSet 사이즈: "+lottoSet.size());

        lottoSet.remove(20);

        System.out.println("숫자 5 포함 여부: "+lottoSet.contains(5));

        System.out.println("=====전체 숫자 출력=====");
        for (int num : lottoSet) {
            System.out.println(num);
        }

        System.out.println("\n수정 후 lottoSet 사이즈: "+lottoSet.size());

    }
}
