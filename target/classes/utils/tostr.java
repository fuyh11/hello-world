package utils;

public class tostr {
    public static String getIsVipStr(int num) {
        if(num==0){
            return "是";
        }else {
            return "否";
        }
    }
    public static String getAuthenStr(int num) {
        if(num==0){
            return "认证";
        }else {
            return "未认证";
        }
    }
    public static String getLockStr(int num) {
        if(num==0){
            return "预约";
        }else {
            return "未预约";
        }
    }

    public static String getCarStateStr(int num) {
        if(num==0){
            return "正常";
        }else {
            return "等待挪车";
        }
    }

    public static String getPileStateStr(int num) {
        if (num == 0) {
            return "无";
        } else if (num == 1) {
            return "使用中";
        } else if (num == 2) {
            return "建设中";
        } else  {
            return "拆除";
        }
    }
    public static String getPileUseStateStr(int num) {
        if (num == 0) {
            return "无";
        } else if (num == 1) {
            return "未使用";
        } else if (num == 2) {
            return "使用中";
        } else {
            return "被预约";
        }
    }
}
