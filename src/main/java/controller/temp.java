package controller;

/**
 * @author chengjinging
 * @date 2020/8/24 上午11:46
 */
public class temp {


    public static void main(String[] args) {
        double lessonSum=18*5+6*20+50;
        double rightChoiceCount=1;
        double essaySubmitCount=1;

        double actualChoice=5* rightChoiceCount;
        double actualEssay=20* essaySubmitCount;
        System.out.println("actualChoice+actualEssay"+(actualChoice+actualEssay));

        System.out.println((actualChoice+actualEssay  )/lessonSum*150);
    }
}
