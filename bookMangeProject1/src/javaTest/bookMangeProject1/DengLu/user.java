package javaTest.bookMangeProject1.DengLu;

public class user {
    private int id;//�û����
    private String userName;//�û���
    private String userPassWord;//�û�����
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
