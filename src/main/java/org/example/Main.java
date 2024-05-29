package org.example;


public class Main {
    public static void main(String[] args) {

// 출력

//        // 문제 : `안녕하세요.`를 10번 출력해주세요.
//        // 조건 : System.out.println은 딱 한번만 사용 가능
//        System.out.println("안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.");
//
//        // 문제 : `안녕하세요.`를 10번 출력해주세요.
//        // 조건 : System.out.println은 딱 한번만 사용 가능
//        // 조건 : \를 활용해서 줄바꿈 해주세요.
//        // 힌트 : \n 은 줄바꿈을 의미합니다.
//
//        System.out.println("안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n");
//
//// 변수
//
//        // 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.
//
//        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
//        // `int` => a라는 공간에는 정수만 담을 수 있다.
//        // `;` => 문장이 끝남을 알린다.
//        int a;
//        a = 5;
//
//        System.out.println(a);
//        System.out.println(a + 10);
//
//        int b = 10;
//
//        // `+` => 문장과 문자을 합친다.
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//
//        // 여기서 부터
//        // value swap
//        int c;
//        c = a;  //5
//
//        a = b;  //10
//
//        b = c;  //5
//
//        // 여기까지 수정 가능
//
//        System.out.println("a : " + a);
//        // 출력 : a : 10
//        System.out.println("b : " + b);
//        // 출력 :  b : 5
//
//
//        int x;
//        x = 10;
//        x = 20;
//        x = x + x;
//        int y = 0;
//        System.out.println("x: " + y);


// 조건문 if
//        int age = 25;
//        System.out.println("당신의 나이: " + age);
//
//        if (age >= 20) {
//            System.out.println("성인");
//        }
//        if (age < 20) {
//            System.out.println("미성년자");
//        }
//
//        if (10 > 20 || 1 == 1 || 3 > 2) {
//            System.out.println("실행됨");
//
//            //10 > 20 || 1 == 1 || 3 > 2
//            // f || 1 == 1 || 3 > 2
//            // f || t || 3 > 2
//            // f || t || t
//            // (f || t) || t
//            // (t) || t
//            // t
//
//        }
//
//
//        if ( true ) {
//            System.out.println("참1");
//        }
//
//        if ( false ) {
//            System.out.println("거짓1");
//        }
//
//        int a = 10;
//
//        // `==` => 같다.
//        if ( a == 10 ) {
//            System.out.println("참2");
//        }
//
//        // `!=` => 같지 않다.
//        if ( a != 10 ) {
//            System.out.println("거짓2");
//        }
//
//        if ( a > 10 ) {
//            System.out.println("거짓3");
//        }
//
//        if ( a >= 10 ) {
//            System.out.println("참3");
//        }
//
//        int b = 10;
//
//        if ( a == b ) {
//            System.out.println("참4");
//        }
//
//        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
//        boolean c = a != b; //f
//
//        if ( c ) {
//            System.out.println("거짓4");
//        }
//
//        if ( c == false ) {
//            System.out.println("참5");
//        }
//
//        // `!` => 반전
//        if ( !c ) {
//            System.out.println("참6");
//        }
//
//        // `!` => 반전
//        if ( !(!c) ) {
//            System.out.println("거짓5");
//        }
//
//        boolean d = true;
//
//        if ( c != d ) {
//            System.out.println("참7");
//        }
//
//        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
//            //    t && t && t
//            System.out.println("거짓6");
//        }
//
//        if ( 10 != 10 || 10 < 2 ) {
//            //    f || f
//            System.out.println("거짓7");
//        }
//
//        int age = 36;
//        if (age >= 1 && age < 10) {
//            System.out.println("유아/아동");
//        }
//        else if (age >= 10 && age < 20){
//            System.out.println("10대");
//        }
//        else if (age >= 20 && age < 30) {
//            System.out.println("20대");
//        }
//        else if (age >= 30 && age < 40) {
//            System.out.println("30대");
//        }
//        else {
//            System.out.println("40대 이상");
//        }

        // 문제 : 할인 대상인지 아닌지 출력해주세요.

        // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
        // 조건 : 출력예시 처럼 출력되어야 합니다.
        // 조건 : `구현시작` 부분만 수정 할 수 있습니다.
        // 조건 : 4가지 이상의 방법으로 풀어야 합니다.
        // 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        // age <= 19 || age >= 60

//        // 1
//        if (age <= 19) {
//            System.out.println("할인대상 입니다.");
//        } else if (age >= 60) {
//            System.out.println("할인대상 입니다.");
//        } else {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//
//        // 2
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.");
//        } else {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//        // 2-1
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.");
//        } else if (age > 19 && age < 60) {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//        // 2-2
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.");
//        }
//        if (age > 19 && age < 60) {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//
//        // 3
//        if (age <= 19) {
//            System.out.println("할인대상 입니다.");
//        }
//        if (age > 19 && age < 60) {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//        if (age >= 60 ) {
//            System.out.println("할인대상 입니다.");
//        }

        // 4
        if (1 <= age && age < 20){
            System.out.println("할인대상 입니다.");
        }
        if (20 <= age && age < 60){
            System.out.println("할인 대상이 아닙니다.");
        }
        if (60 <= age) {
            System.out.println("할인대상 입니다.");
        }


        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.


    }
}
