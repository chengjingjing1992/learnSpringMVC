package controller;

/**
 * @author chengjinging
 * @date 2020/8/26 下午5:36
 */
public class ExceptionClass extends Exception{

    private String msg;

    public ExceptionClass(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }






}
