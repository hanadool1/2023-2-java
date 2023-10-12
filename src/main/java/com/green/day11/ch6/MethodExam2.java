package com.green.day11.ch6;

public class MethodExam2 {
    String scoreResultOpt(int score) {
        if (score < 0 || score > 100) {
            return "점수를 확인해 주세요";
        }
        if (score == 100) {
            return "A+";
        } else if (score < 70) {
            return "D";
        }
        String grade = "C";
        if(score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        // 70~99점
        String opt = "0";
        int modVal = score % 10;
        if (modVal >= 8) {
            opt = "+";
        } else if (modVal <= 3) {
            opt = "-";
        }
        String result = String.format("%s%s학점", grade, opt);
        return result;
    }
    String getSeason(int month) {
        switch (month) {
            case 3,4,5:
                return "봄";
            case 6,7,8:
                return "여름";
            case 9,10,11:
                return "가을";
            case 12,1,2:
                return "겨울";
        }
        return "없음";
    }

}
