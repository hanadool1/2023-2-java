package com.green.day16.ch7;

public class Time {
    // private한 멤버필드에 값을 넣는 방법  1.생성자 이용, 2.메소드를 통해서 값을 넣는다.
    // private한 멤버필드에 값을 빼는 방법 : 메소드를 통해서 뺀다.
    private final static int MAX_HOUR = 23;
    private final static int MIN_HOUR = 0;

    private int hour, minute, second;

    // private한 멤버필드에 값을 넣는 방법 1. 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 생성자만 있고 setter가 없는 경우 ? 객체를 생성할 때만 값을 넣고
    // 생성자는 없고 setter만 있는 경우 ? 객체 생성할 때는 값을 못넣고, setter메소드로만 값을 넣을 수 있다.


    // private한 멤버필드에 값을 넣는 방법 2. setter 메소드(void) > private으로 선언된 멤버필드의 값을 수정할 때 씀
    // 오른쪽 마우스 > Generate > Setter
    public void setHour(final int hour) {
        if (hour > MAX_HOUR) {
            this.hour = MAX_HOUR;
        } else if (hour < MIN_HOUR ) {
            this.hour = MIN_HOUR;
        } else {
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    // private한 멤버필드에 값을 빼는 방법 : getter 메소드를 통해서 뺀다.
    public int getHour() { // getter는 파라미터가 무조건 없다.
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d\n",hour,minute,second);
    }
}

class TimeTest {

    public static void main(String[] args) {
        Time time = new Time(11,20,30);

        time.setHour(25);
        time.setMinute(5);
        time.setSecond(1);

        System.out.println(time);
//         time.hour = 10;
    }
}