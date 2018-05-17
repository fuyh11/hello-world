package utils;

public class GetNum {
    public static String getNum(int num){
        if(num>=0&&num<10){
            return "00"+num;
        }else if(num>=10&&num<100){
            return "0"+num;
        }else if(num>=100&&num<1000){
            return ""+num;
        }else{
            return "";
        }
    }
}