package javaTest.bookMangeProject1.tools;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DengLuDb_MySql {
    private String dbUrl = "jdbc:mysql://localhost:3306/bookdb";//数据库链接地址
    private String dbUserName = "root";
    private String dbPassWord = "WJH5201314";
    private String jdbcName = "com.mysql.jdbc.Driver";
    //获取数据库链接如下
    public Connection getCon()throws Exception{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
        return connection;
    }//获取链接如上
    //关闭链接
    public void closeCon(Connection con) throws Exception{
        if (con != null){
            con.close();
        }//if
    }//关闭链接

    public static void main(String[] args) throws Exception {
        DengLuDb_MySql dengLuDbMySql = new DengLuDb_MySql();
        dengLuDbMySql.getCon();
        System.out.println("数据库链接成功");
    }//main()
}
