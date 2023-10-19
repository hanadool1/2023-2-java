package com.green.day15.ch7;

class Tv {
    boolean power; // 전역변수 : 객체가 살아있는 동안 유지
    int channel;

    void power() { power = !power;} // toggle 구현(같은 문장 실행 시 결과가 바뀌는 것)
    void channelUp() { channel++; }
    void channelDown() { channel--; }

}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
    @Override // 오버라이딩 됐는지 확인. 오버라이딩할 때 적으면 실수를 줄일 수 있음.
    // 오른쪽마우스 > Generate > Override Method
    void channelUp() { // 오버라이딩 : 부모가 가지고 있는 메소드를 새롭게 정의해서 씀.
        // 이름, 매개변수(파라미터), 반환타입이 같아야함. 선언부는 같음, 구현부가 다름.
        channel += 5;
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv(); // CaptionTv를 객체화하면 부모클래스인 Tv,Object가 자동으로 객체화 됨
        System.out.printf("cTv.power : %b\n", cTv.power); // 디폴트값 : false, toggle 구현
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power); // true
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power); // false
        cTv.channel = 10;
        cTv.channelUp(); // 오버라이딩 되어있기 때문에 cTv의 channelUp 메소드 사용 > 15
        System.out.printf("cTv.channel : %d\n", cTv.channel); // 15
        cTv.displayCaption("반갑다 친구들!!!"); // 출력 X, caption에 기본값이 false가 되어 있기 때문에 실행 X
        cTv.caption = true; // caption값을 true로 변경
        cTv.displayCaption("fdsf,fdsf");
    }
}
