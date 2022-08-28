package calcapp.main;

import calcapp.logics.CalcLogic;

import java.util.Arrays;

public class Calc  {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        //FQCNを利用している
        int total = calcapp.logics.CalcLogic.tasu(a, b);
        //importを使用している
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "引くと" + delta);
    }

//    int[] heights = {172, 149, 152, 191, 155};
//    java.util.Arrays.sort(height);
//        for (int h : heights) {
//            System.out.println(h);
//        }

    //練習問題

}
