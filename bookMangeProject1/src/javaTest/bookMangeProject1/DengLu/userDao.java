package javaTest.bookMangeProject1.DengLu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userDao {
    public user DengLu(Connection con,user user)throws Exception{
        javaTest.bookMangeProject1.DengLu.user resutUser = null;
        String sql = "SELECT * FROM t_user WHERE name = ? AND passWord = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,user.getUserName());
        preparedStatement.setString(2,user.getUserPassWord());
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            resutUser = new user();
            resutUser.setId(resultSet.getInt("id"));
            resutUser.setUserName(resultSet.getString("name"));
            resutUser.setUserPassWord(resultSet.getString("passWord"));
        }else {
            resutUser = null;
        }
        resultSet.close();
        preparedStatement.close();
        return resutUser;

    }

}
