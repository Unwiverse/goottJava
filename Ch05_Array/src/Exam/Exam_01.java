package Exam;

import java.util.Scanner;

public class Exam_01 {

    public static void main(String[] args) {
    	//1. 키보드 입력받을 준비 
        Scanner sc = new Scanner(System.in);


        //2.  배열 크기를 키보드로 입력 받자.
        System.out.print("배열 크기: ");
        int k = sc.nextInt();
        int[] arr = new int[k]; // int[] arr = new int[sc.nextInt()];

        // 배열 요소 입력
        for (int i = 0; i < k; i++) {
            System.out.print((i + 1) + "번째 값 입력: ");
            arr[i] = sc.nextInt();
        }

        // 최대값과 최소값 초기화
        int max = arr[0];
        int min = arr[0];

        // 배열에 키보드를 써서 임의의 정수를 입력받자.
        for (int i = 1; i < k; i++) {
            if (arr[i] > max) { // 일단 max의 값을 배열의 첫 번째 값으로 설정하고 for문을 통해 순환하면서 
                max = arr[i]; // 배열의 최댓값을 비교해 찾는 과정 
            }
            if (arr[i] < min) {// 일단 min의 값을 배열의 첫 번째 값으로 설정하고 for문을 통해 순환하면서
                min = arr[i]; // 배열의 최솟값을 비교해 찾는 과정
            }
        }
        System.out.println("max: " + max + ", min: " + min);

        sc.close();
    }
}