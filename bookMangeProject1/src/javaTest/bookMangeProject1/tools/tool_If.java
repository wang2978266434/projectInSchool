package javaTest.bookMangeProject1.tools;
//工具类
public class tool_If {
    public static boolean isEmpt(String str){
        if (str == ""||"".equals(str.trim())){
            return true;
        }else {
            return false;
        }
    }//判断是否为空
    public static boolean isNotEmpty(String str){
        if (str != "" && !"".equals(str.trim())){
            return true;
        }else {return false;}
    }
}
