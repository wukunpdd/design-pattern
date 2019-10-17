package cn.wk.common;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by wukun on 2019/10/17.
 */
public class TimeUtils {
    public static final String yyyyMMdd = "yyyy-MM-dd";
    public static final String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";

    public static String getToday(String formatString){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formatString);
            return sdf.format(new Date());
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
