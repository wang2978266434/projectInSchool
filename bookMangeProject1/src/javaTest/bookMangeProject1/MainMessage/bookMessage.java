package javaTest.bookMangeProject1.MainMessage;

/**
 *
 */
public class bookMessage {
    private int id;
    private String bookName;
    private String authorName;
    private String FenLei;
    private int year;
    private int month;
    private int day;
    private String ChuBanShe;
    private int money;
public bookMessage() {
    super();
}
public bookMessage(String bookName,String authorName, String FenLei, int year, int month, int day,  int money){
    this.bookName = bookName;
    this.authorName = authorName;
    this.day = day;
    this.month = month;
    this.year = year;
    this.money = money;
    this.FenLei = FenLei;
}
    public bookMessage(String bookName,String authorName, String fenLei, int year, int month, int day, String ChuBanShe, int money){
     this.bookName = bookName;
     this.authorName = authorName;
     FenLei = fenLei;
     this.year = year;
     this.month = month;
     this.day = day;
     this.ChuBanShe = ChuBanShe;
     this.money = money;
    }
    public int getDay() {
        return day;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getChuBanShe() {
        return ChuBanShe;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getFenLei() {
        return FenLei;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setChuBanShe(String chuBanShe) {
        ChuBanShe = chuBanShe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFenLei(String fenLei) {
        FenLei = fenLei;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
