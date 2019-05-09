package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
public static void main(String[] args) {
//숫자의 자리가 모두 다른 숫자가 나올때까지 계속 돌린다.
int compNo = getHiddenNumber();
while(true) {
if(checkNumber(compNo)) {
break;
}else {
compNo = getHiddenNumber();
}
}

System.out.println(compNo);

int count = 0;//맞춘횟수를 넣는다. X번만에 맞춘횟수
int myNo = 0;
while(true) {
while(true) {
System.out.print("숫자를 입력하세요.");
myNo = getUserInput();
if(checkNumber(myNo)) {
break;
}
}
count++;
if (myNo == compNo) {
System.out.println("축하합니다.~~~"+ count+"번만에 맞추셨군요.");
break;
}else {
System.out.println(compareNum(compNo, myNo));
}
}


}
public static String compareNum(int compNo, int myNo) {
String result = "";
int strike = 0 ;
int ball = 0;

int firstComp = compNo / 100;
int secondComp = (compNo % 100) /10;
int thirdComp = compNo % 10;

int firstMy = myNo / 100;
int secondMy = (myNo % 100) /10;
int thirdMy = myNo % 10;

if(firstComp == firstMy) {
strike++;
}else if(firstComp == secondMy || firstComp == thirdMy) {
ball++;
}
if(secondComp == secondMy) {
strike++;
}else if(secondComp == thirdMy ||secondComp == firstMy) {
ball++;
}
if(thirdComp == thirdMy) {
strike++;
}else if(thirdComp == firstMy || thirdComp == secondMy) {
ball++;
}
result = strike +"S " + ball+"B";
return result;
}
public static boolean checkNumber(int number) {
boolean check = false;
int first = number / 100;
int second = (number % 100) /10;
int third = number % 10;
if(first != 0 && first != second && first != third && second != third) {
return !check;
}
//세자리 모두 다른숫자인가 체크하는 로직
return check;
}

public static int getHiddenNumber() {
Random random = new Random();
int num = random.nextInt(988);
return num;
}
public static int getUserInput() {

Scanner scanner = new Scanner(System.in);
int value = scanner.nextInt();
return value;
}

}
