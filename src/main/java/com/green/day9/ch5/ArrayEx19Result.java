package com.green.day9.ch5;

public class ArrayEx19Result {
    public static void main(String[] args) {
        int[][] score = {
                 {101, 102, 103}    // 1번사람의 국영수 점수
                ,{21, 22, 23}       // 2번사람의 국영수 점수
                ,{31, 32, 33}
                ,{41, 42, 43}
                ,{51, 52, 53}
        };
        /*
        번호 국어 영어 수학 총점 평균
        -------------------------
        1   101  102 103 306 102.0
        ...
        5   51   52  53  156 52.0
        -------------------------
        총점 ??  ??  ??
         */
        int[] sumArr = new int[score[0].length];    // int형 배열 sumArr을 선언하고, 배열 score[0]의 길이인 3인 배열 생성
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("---------------------------------");
        for (int i=0; i< score.length; i++) {   // 0부터 score의 길이인 5까지 반복
            System.out.printf("%d", i+1);   // 몇번사람인지 출력
            int sum = 0;    // int형 변수 sum을 선언하고 0으로 초기화, i++되고 총점 생성 후, sum 다시 0으로 초기화
            for (int z=0; z<score[i].length; z++) { // 0부터 score[i]의 길이인 3까지 반복
                int val = score[i][z];  // int형 변수 val을 선언하고 score[i][z] 저장
                sumArr[z] += val; // sumArr[z] = sumArr[z] + val;
                // sumArr[z] = sumArr[z] + score[i][z];
                sum += val; // sum = sum + val
                // sum = sum + score[i][z]
                System.out.printf("\t%d", val); // val == score[i][z]의 값인 국영수 값 출력
            }
            float avg = (float)sum / score[i].length; // sum을 score[i].length인 3으로 나눈 후 실수형으로 형변환
            System.out.printf("\t%d\t%.1f\n", sum, avg); // sum값, avg의 소수점 1번째자리 까지 출력
        }
        System.out.println("----------------------------------");
        System.out.print("총점");
        for(int val : sumArr) {
            System.out.printf("\t%d", val);
        }
        System.out.println();

    }
}
