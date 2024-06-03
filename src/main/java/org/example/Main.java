package org.example;


import java.util.Scanner;

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

//        // 문제 : 할인 대상인지 아닌지 출력해주세요.
//
//        // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
//        // 조건 : 출력예시 처럼 출력되어야 합니다.
//        // 조건 : `구현시작` 부분만 수정 할 수 있습니다.
//        // 조건 : 4가지 이상의 방법으로 풀어야 합니다.
//        // 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.
//
//        int age = 60; // 이 값을 바꿔가면서 실행해보세요.
//
//        System.out.println("당신의 나이는 " + age + "살 입니다.");
//
//        // 구현시작
//        // age <= 19 || age >= 60

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
//
//        // 4
//        if (1 <= age && age < 20){
//            System.out.println("할인대상 입니다.");
//        }
//        if (20 <= age && age < 60){
//            System.out.println("할인 대상이 아닙니다.");
//        }
//        if (60 <= age) {
//            System.out.println("할인대상 입니다.");
//        }


        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.


//        int i = 1;
//        System.out.println(i);
//
//        i = i + 1; // i의 값을 1 증가시킨다
//        System.out.println(i);
//
//        i += 1; // i의 값을 1 증가시킨다
//        System.out.println(i);
//
//        i += 2; // i의 값을 2 증가시킨다
//        System.out.println(i);
//
//        i++; // i의 값을 1 증가시킨다
//        System.out.println(i);
//
//        i--; // i의 값을 1 감소시킨다.
//        System.out.println(i);
//
//        i = i - 2; // i의 값을 2 감소시킨다.
//        System.out.println(i);
//
//        i -= 2; // i의 값을 2 감소시킨다.
//        System.out.println(i);


//        //문제 1
//        System.out.println("8 * 1 = 8");
//        System.out.println("8 * 2 = 16");
//        System.out.println("8 * 3 = 24");
//
//        System.out.println("=======================================");
//
//        System.out.println("8 * 1 = 8\n8 * 2 = 16\n8 * 3 = 24");
//
//        System.out.println("=======================================");
//
//        String s = "8 * 1 = 8\n";   // 8 * 1 = 8\n
//        s = s + "8 * 2 = 16\n";     // 8 * 1 = 8\n"8 * 2 = 16\n
//        s += "8 * 3 = 24\n";        // 8 * 1 = 8\n"8 * 2 = 16\n8 * 3 = 24\n
//
//        System.out.println(s);
//        System.out.println("=======================================");

//         // 문제 2 ~ 3
//         int dan = 8;
//         System.out.println(dan + " * 1 = " + dan * 1);
//         System.out.println(dan + " * 2 = " + dan * 2);
//         System.out.println(dan + " * 3 = " + dan * 3);


//        // 문제 4
//        // 조건 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.
//        int dan = 8;
//
//        // 수정가능지역 시작
//        int i = 1;
//
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i += 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i = i + 1;
//        // 수정가능지역 끝
//
//        // 조건 반복문을 사용하지 않고. *100 까지 출력하세요


//        // 반복문 while ~ 하는 동안
//        while (i <= 100) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }

//        int i = 1;                  // 시작점 ~ 부터
//        while (i <= 100) {          // 조건식 ~ 까지
//            System.out.println(i);
//            i +=10;                 // ~만큼 , 방향
//        }
//
//        System.out.println(i);
//
//        System.out.println("증가");
//        int k = 1;                  // 1번 초기
//        while (k <= 10) {           // 2번 조건
//            System.out.println(k);  // 4번
//            k += 2;                 // 3번 스텝
//        }
//        System.out.println("감소");
//        int i = 10;
//        while (i >= 1) {
//            System.out.println(i);
//            i -= 2;
//        }


//        // 문제 1
//        int dan = 8;
//        int i = 1;
//
//        while(i <= 1000) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }

//        // 문제 2
//
//        int i = 1;
//
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }

//        // 문제 3  / -100부터 25까지 출력해주세요.
//
//        int i = -100;
//        while (i <= 25) {
//            System.out.println(i);
//            i++;
//        }

        // 문제 4 / 단을 `* 1000`부터 1`까지 출력해주세요.


        // 문제 5  / 단을 `* 1000`부터 `* -500`까지 출력해주세요.

//        int dan = 8;
//        int i = 1000;
//
//        while (1000 >= i && i >= -500) {
//            System.out.println(dan + "*" + i + "=" + dan * i);
//            i--;
//        }

//        // 문제 6  / 1부터 5까지의 합을 더한 결과를 출력해주세요.
//
//        int i = 1;
//        int sum = 0;
//
//        while (i <= 5) {
//            //sum = sum + i;
//            sum += i;
//            i++;
//            // i = i + 1;
//            // i += 1;
//        }
//        System.out.println(sum);

//        // 문제 7  / -100부터 25까지의 합을 더한 결과를 출력해주세요.
//
//        int i = -100;
//        int sum = 0;
//        while (i <= 25) {
//
//            sum = sum + i;
//
//            System.out.println(sum);
//            i++;
//        }

//        // 문제 8  / 1부터 3까지 출력하는 작업을 10번 해주세요. (2중 while문 사용)
//
//        int i = 1;
//        while ( i <= 10) {
//            System.out.println("i: " + i);
//
//            int k = 1;
//            while (k <= 3) {
//                System.out.println(k);
//                k++;
//            }
//            i++;
//        }


//        // 반복문 for
//
//        System.out.println("==== while ====");
//        int i = 1;              // 초기식;
//        while (i <= 3) {        // 조건식
//            System.out.println(i);
//            i++;                // 증감식;
//        }
//
//
//        System.out.println("==== for ====");
//
//        for (int j = 1; j <= 3; j++) {
//            // 초기식; 조건식; 증감식
//            System.out.println(j);
//        }


//        // 문제 1  / 단을 * 1000까지 출력해주세요.
//        int dan = 8;
//
//        for (int i = 1; i <= 1000; i++) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//
//        }

//        // 문제 2  / 1부터 5까지 출력해주세요.
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//
//        }

//        // 문제 3  / -100부터 25까지 출력해주세요.
//
//        for (int i = -100; i <= 25; i++) {
//            System.out.println(i);
//
//        }

//        // 문제 4 / 단을 `* 1000`부터 1`까지 출력해주세요.
//
//        int dan = 8;
//
//        for (int i = 1000; i >= 1; i--) {
//            System.out.println(dan + "*" + i + "=" + dan * i);
//        }

//        // 문제 5  / 단을 `* 1000`부터 `* -500`까지 출력해주세요.
//
//        int dan = 8;
//
//        for (int i = 1000; 1000 >= i && i >= -500; i--) {
//            System.out.println(dan + "*" + i + "=" + dan * i);
//
//        }

//        // 문제 6  / 1부터 5까지의 합을 더한 결과를 출력해주세요.
//
//       int sum = 0;
//
//       for (int i = 1; i <= 5; i++) {
//           sum += i;
////           System.out.println(sum);
//       }
//        System.out.println(sum);

        // 문제 7  / -100부터 25까지의 합을 더한 결과를 출력해주세요.

//        int sum = 0;
//
//        for (int i = -100; -100 <= i && i <= 25; i++) {
//            sum += i;
////            System.out.println(sum);
//        }
//        System.out.println(sum);

//        // 문제 8  / 1부터 3까지 출력하는 작업을 10번 해주세요. (2중 while문 사용)
//
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println(j);
//            }
//        }

//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // 순차적으로.
        // 1. i가 1로 시작. 5가 될때까지 반복하며, i는 1씩 증가한다.
        // 2. i는 1, 조건식은 5이하로 True. 조건을 만족하고 다음줄을 실행
        // 3. 다시 for문 k는 1로 시작하고, k와 i가 같을때까지 반복하며, k는 1씩 증가한다.
        // 4. k는 1, i도 1이며, 조건식은 1 <= 1로 참. 다음줄을 실행한다.
        // 5. 콘솔창에 "* " 별과공백 하나의 문자열 찍는다.
        // 6. 다시 가장 가까운 for문으로 되돌아가 k는 1 증가하여 2가 되었으나 i는 아직 1.
        // 7. 2 <= 1 조건식이 거짓이므로 false. 반복문을 빠져나간다.
        // 8. 다음줄을 실행하며 println으로 한 줄 개행한다.


//        //24_05_31 4일차
//
//        // 자바의 타입(자료형)
//        // 1. 기본 타입(있음)
//        // 2. 참조 타입(없음)
//
//            // 논리 (ture, false) -> boolean
//            boolean b = true; // 1 > 2 // 2 > 1
//
//            // 문자
//            char c = 'd';
//            System.out.println(c);
//
//            // 정수
//            byte bb = 40;               // -128 ~ 127
//            System.out.println(bb);
//            short s = 40;               // 약 -32000 ~ 32000
//            System.out.println(s);
//            int i = 40;                 // 약 -21억 ~ 21억
//            System.out.println(i);
//            long l = 40L;                // 그 이상
//            System.out.println(l);
//
//            // 실수
//            float f = 3.14f;            // 4바이트
//            double d = 3.14;            // 8바이트
//
//            // 참조 타입
//            String ss = "Hi";

//            int base = 3, exponent = 4;
//            long result = 1;
//
//            for (; exponent != 0; --exponent) {         // 전위연산 ++n  / 후위연산  n++
//                    result += base;
//            }
//            System.out.println("Answer : " + result);


//            // 피보나치의 수열
//            int n = 10, firstTerm = 0, secondTerm = 1;
//
//            for (int i = 1; i <= n; ++i) {
//                    System.out.print(firstTerm + ", ");
//
//                    int nextTerm = firstTerm + secondTerm;
//                    firstTerm = secondTerm;
//                    secondTerm = nextTerm;
//            }


//            // 부동소수점 floating point  - 근사값(근사치)
//            // => 정확도의 문제 발생.
//            double a = 2.1;
//            double a2 = a * 10;
//
//            if ((a2 * 3) == 63) {
//                    System.out.println("같아");
//            } else {
//                    System.out.println("달라");
//            }
//
//            System.out.println(a);
//            System.out.println(a2);

        // 참조변수
//            String s = "안녕";            // 참조변수는 보통 4byte를 먹지만, JVM의 메모리 할당에 따라서 달라진다.


//            int a = 10;
//            // int[] arr = new 설계도;
//            int[] arr = new int[3];             // int[] 는 int 와 달라서 기본변수가 아닌 참조변수 이다.
//
//            arr[0] = 10;
//            arr[1] = 20;
//            arr[2] = 30;
//
//            System.out.println(arr[0]);
//            System.out.println(arr[1]);
//            System.out.println(arr[2]);

        // 배열 안의 값의 총 합, 평균 출력

//            int a = 10;
//
//            int[] arr = new int[5];
//            arr[0] = 10;
//            arr[1] = 20;
//            arr[2] = 30;
//            arr[3] = 40;
//            arr[4] = 50;
//
//
//            int sum = 0;
//            int avg = 0;
////            sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
//            for (int i = 0; i < arr.length; i++) {
//                    sum += arr[i];
//            }
//            avg = sum / arr.length;
//            System.out.println(arr.length);
//
//            System.out.println("총합: " + sum);
//            System.out.printf("총합: %d\n", sum);
//
//            System.out.println("평균: " + avg);
//            System.out.printf("평균: %d\n", avg);


        // 코드업 문제
//            System.out.println("\"!@#$%%^&*()\"");
//
//            System.out.println("\"C:\\Download\\hello.cpp\"");
//
//            System.out.println("Hello, \nWorld!");
//
//            System.out.println("\"C:\\test\"");
//
//            System.out.println("special characters\n[\\n, \\\", \\\\] is very important");

        // ===============================================

//            Scanner sc = new Scanner(System.in);
//
//            char x, y;
//
//            x = sc.next().charAt(0);
//            y = sc.next().charAt(0);
//
//            System.out.printf("%c %c", y, x);

        // ===============================================

//            Scanner sc = new Scanner(System.in);
//
//            int a, b, c;
//
//            a = sc.nextInt();
//
//            System.out.printf("%d %d %d", a, a, a);

        // ===============================================

//            // 1019
//            Scanner sc = new Scanner(System.in);
//
//            int year, month, day;
//
//            String[] arr = sc.nextLine().split("\\.");
//            year = Integer.parseInt(arr[0]);
//            month = Integer.parseInt(arr[1]);
//            day = Integer.parseInt(arr[2]);
//
//            System.out.printf("%04d.%02d.%02d", year,month,day);

        // ================================================

//            // 1021
//            Scanner sc = new Scanner(System.in);
//
//            int code1;
//            int code2;
//
//            String[] arr = sc.nextLine().split("\\-");
//
//            code1 = Integer.parseInt(arr[0]);
//            code2 = Integer.parseInt(arr[1]);
//
//            System.out.printf("%d%d", code1,code2);

        // ===============================================

//            // 1022
//            Scanner sc = new Scanner(System.in);
//
//            String data = sc.next();
//            System.out.println(data);
//
        // ===============================================

        // 1023

//        Scanner sc = new Scanner(System.in);
//
//        float f;


//        // 나 정수 100개 컨트롤
//        int a0 = 1;
//        int a1 = 2;
//        int a2 = 3;
//
//        int a99 = 100;
////        int sum = a0 + a1 + a2 + ... a99;
//
//        int[] arr = new int[100];
//        for (int i = 0; i <= 99; i++) {
//            arr[i] = i + 1;
//        }
//        int sum2 = 0;
//        for (int i = 0; i <= 99; i++) {
//            sum2 += arr[i];
//        }
//
//        System.out.println("sum2: " + sum2);


//        boolean[] arr1 = new boolean[3];
//        arr1[0] = true;
//        arr1[1] = false;
//        arr1[2] = true;
//
//        System.out.println(arr1[0]);        //t
//        System.out.println(arr1[1]);        //f
//        System.out.println(arr1[2]);        //t
//        System.out.println(arr1.length);    // 3
//
//        double[] arr2 = new double[3];      //{3.14, 7.77, 11.11}
//        arr2[0] = 3.14;
//        arr2[1] = 7.77;
//        arr2[2] = 11.11;
//
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//
//        int[] arr3 = new int[10];
////        for (int i = 0; i < 10; i++) {
////            arr3[i] = i + 1;
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = i + 1;
//
//            System.out.println(arr3[i]);
//        }

//        int[] arr1 = new int[6];            // 1차원 배열 ( 선형 구조 )
//        arr1[0] = 1;
//        arr1[1] = 2;
//        arr1[2] = 3;
//        arr1[3] = 4;
//        arr1[4] = 5;
//        arr1[5] = 6;
//
//
//        int[][] arr2 = new int[2][3];       // 2차원 배열 ( 면 )
//        arr2[0][0] = 1;
//        arr2[0][1] = 2;
//        arr2[0][2] = 3;
//        arr2[1][0] = 4;
//        arr2[1][1] = 5;
//        arr2[1][2] = 6;


//        // 객체 - 변수의 묶음, 폴더
//        int[] person1 = new int[3];     // 사람1 -> (김철수, 나이 22, 키 170.2, 몸무게 60, 010-1234-5678, 결혼여부)
//        person1[0] = 1;                 //int person1_num = 1;
//        person1[1] = 22;                //int person1_age = 12;
//        person1[2] = 170;               //int person1_height = 170;
//
//        int[] person2 = new int[3];// 사람2 -> 학생
//        person1[0] = 2;                 //int person2_num = 1;
//        person1[0] = 15;                //int person2_age = 15;
//        person1[0] = 175;               //int person2_height = 175;

        //한계. 1. 각 인스턴스 변수가 무엇을 의미하는지 모름.
        //한계. 2. int[3]의 설계도로는 이름,키 등의 다른 타입을 표현 할 수 없음.

//        철수 a = new 철수();                //error 1. 철수()라는 설계도(클래스)가 없어서.
//        a.이름 = "김철수";                  //이름,나이,키 등의 인스턴스 변수가 없어서.
//        a.나이 = 22;
//        a.키 = 170.2;

        myObject object = new myObject();
        object.name = "강기범";
        object.age = 32;
        object.weight = 73.5;
        object.height = 169.8;


        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.weight);
        System.out.println(object.height);

        System.out.printf(" 이름 : %s\n 나이 : %d\n 몸무게 : %.2f\n 신장 : %.2f", object.name, object.age, object.weight, object.height);


    }
}

//class 철수 {
//    String 이름;
//    int 나이;
//    double 키;
//}


class myObject {
    String name;
    int age;
    double weight;
    double height;
}
