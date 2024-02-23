package goott;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO_07 {

    public static void main(String[] args) throws Exception {
        try {
            // 1. 바이트 스트림 방식으로 이미지 파일을 읽어오기
            FileInputStream is = new FileInputStream("C:/test/koala.jpg");
            long start, end;
            start = System.nanoTime();
            while (is.read() != -1) {
            }
            end = System.nanoTime();
            System.out.println("바이트 스트림을 이용한 경우: " + (end - start) / 1000000.0 + " ms");
            is.close();

            // 2. 바이트 스트림에 보조 스트림을 연결해 이미지 파일을 읽어오자.
            FileInputStream is1 = new FileInputStream("C:/test/koala.jpg");
            BufferedInputStream bis = new BufferedInputStream(is1);
            start = System.nanoTime();
            while (bis.read() != -1) {
            }
            end = System.nanoTime();
            System.out.println("보조 스트림을 이용한 경우: " + (end - start) / 1000000.0 + " ms");

            bis.close();
            is1.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

