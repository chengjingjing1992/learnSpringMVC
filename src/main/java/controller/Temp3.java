package controller;

import java.util.Arrays;

/**
 * @author chengjinging
 * @date 2020/8/24 上午11:46
 */
public class Temp3 {

    String str="good";
    char [] chars={   'a','b','c'};

    public static void main(String[] args) {
        Temp3 temp3=new Temp3();
        temp3.change(temp3.str,temp3.chars);
        System.out.println(temp3.str +"and " );
        System.out.println(Arrays.toString(temp3.chars));
    }

    public void change(String str,char [] chars){
        str="test ok";
        chars[0]='g';
    }








}
