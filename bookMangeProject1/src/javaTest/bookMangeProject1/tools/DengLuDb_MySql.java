package javaTest.bookMangeProject1.tools;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DengLuDb_MySql {
    private String dbUrl = "jdbc:mysql://localhost:3306/bookdb";//���ݿ����ӵ�ַ
    private String dbUserName = "root";
    private String dbPassWord = "WJH5201314";
    private String jdbcName = "com.mysql.jdbc.Driver";
    //��ȡ���ݿ���������
    public Connection getCon()throws Exception{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
        return connection;
    }//��ȡ��������
    //�ر�����
    public void closeCon(Connection con) throws Exception{
        if (con != null){
            con.close();
        }//if
    }//�ر�����

    public static void main(String[] args) throws Exception {
        DengLuDb_MySql dengLuDbMySql = new DengLuDb_MySql();
        dengLuDbMySql.getCon();
        System.out.println("���ݿ����ӳɹ�");
    }//main()
}
