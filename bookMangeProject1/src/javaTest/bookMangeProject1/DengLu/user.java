package javaTest.bookMangeProject1.DengLu;

public class user {
    private int id;//用户编号
    private String userName;//用户名
    private String userPassWord;//用户密码
    public user(){
        super();
    }
    public user(String userName, String userPassWord){
        this.userName =userName;
        this.userPassWord = userPassWord;
    }
    public int getId() {
        return id;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

}
