package javaTest.bookMangeProject1.tools;
//������
public class tool_If {
    public static boolean isEmpt(String str){
        if (str == ""||"".equals(str.trim())){
            return true;
        }else {
            return false;
        }
    }//�ж��Ƿ�Ϊ��
    public static boolean isNotEmpty(String str){
        if (str != "" && !"".equals(str.trim())){
            return true;
        }else {return false;}
    }
}
