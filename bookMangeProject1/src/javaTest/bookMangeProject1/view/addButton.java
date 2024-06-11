package javaTest.bookMangeProject1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class addButton {
    JFrame jFrame = new JFrame();
    //................设置按钮............................
    JButton tiJiao = new JButton("提交");
    JButton quXiao = new JButton("取消");
    //.................设置标签.................................
    JLabel bianHao = new JLabel("编号");
    JLabel bookName = new JLabel("图书名称");
    JLabel FenLei = new JLabel("分类");
    JLabel ShangJia = new JLabel("上架时间");
    JLabel athor = new JLabel("作者");
    JLabel ChuBanShe =  new JLabel("出版社");
    JLabel money  = new JLabel("价格");
    //..........................设置文本及..............................
    JTextField tfBianHao = new JTextField(15);
    JTextField tfBookName = new JTextField(15);
    JTextField tfAthor = new JTextField(15);
    JTextField tfChuBan = new JTextField(15);
    JTextField tfMoney = new JTextField(15);
    //.........................设置下拉框..............................
    JComboBox jcFenLei = new JComboBox();
    JComboBox jcYear = new JComboBox();
    JComboBox jcMonth = new JComboBox();
    JComboBox jcDay = new JComboBox();
    //.......................设置装下拉框的盒子.........................
    public void init(){
        //.................设置编号不可编辑.........................
        tfBianHao.setEditable(false);
        jcFenLei.addItem("其他");
        jcFenLei.addItem("生物类");
        jcFenLei.addItem("科技类");
        jcFenLei.addItem("娱乐类");
        jcFenLei.addItem("文艺");
        //....................设置年月日下拉框...............................
        jcYear.addItem("年");
        jcYear.addItem("2022");
        jcMonth.addItem("月");
        jcMonth.addItem("2");
        jcDay.addItem("日");
        jcDay.addItem("13");
        //设置装下拉选择框的盒子和panel
        JPanel jpFenLei = new JPanel();
        JPanel jpBox = new JPanel();
        Box hBox = Box.createHorizontalBox();
        hBox.add(jcYear);
        hBox.add(jcMonth);
        hBox.add(jcDay);
        //..............................设置装其他文本框的盒子................................
        Box BbianHao = Box.createHorizontalBox();
        Box BbookName = Box.createHorizontalBox();
        Box Bauthor = Box.createHorizontalBox();
        Box BFenLei = Box.createHorizontalBox();
        Box BShangJia = Box.createHorizontalBox();
        Box BChuBan = Box.createHorizontalBox();
        Box BMoney = Box.createHorizontalBox();
        //...........................装按钮的盒子。。。。。。。。。。。。。。。。。。。。。。。。
        Box BtiAndQu = Box.createHorizontalBox();
        //.............................为每一个水平添加box..........................
        BbianHao.add(bianHao);
        BbianHao.add(tfBianHao);
        BbookName.add(bookName);
        BbookName.add(tfBookName);
        Bauthor.add(athor);
        Bauthor.add(tfAthor);
        BFenLei.add(FenLei);
        BFenLei.add(jcFenLei);
        BShangJia.add(ShangJia);
        BShangJia.add(hBox);
        BChuBan.add(ChuBanShe);
        BChuBan.add(tfChuBan);
        BMoney.add(money);
        BMoney.add(tfMoney);
        BtiAndQu.add(tiJiao);
        BtiAndQu.add(quXiao);
        //...........................设置jpanel容器装box.........................................
        JPanel jbianHao = new JPanel();
        JPanel JBookName = new JPanel();
        JPanel JAthor = new JPanel();
        JPanel JFenLei = new JPanel();
        JPanel JShangJia = new JPanel();
        JPanel JChuBan = new JPanel();
        JPanel JMoney = new JPanel();
        JPanel jbtn = new JPanel();
        //..................添加...........................
        jbianHao.add(BbianHao);
        JBookName.add(BbookName);
        JAthor.add(Bauthor);
        JFenLei.add(BFenLei);
        JShangJia.add(BShangJia);
        JChuBan.add(BChuBan);
        JMoney.add(BMoney);
        jbtn.add(BtiAndQu);
        //为取消和叉号设置事件监听机制
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                jFrame.setVisible(false);
            }
        });
        quXiao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
            }
        });
        //..............................设置jframe............................\
        jFrame.setBounds(800,400,250,350);
        jFrame.setResizable(false);
        jFrame.setLayout(new FlowLayout(2));
        jFrame.add(jbianHao);
        jFrame.add(JBookName);
        jFrame.add(JAthor);
        jFrame.add(JFenLei);
        jFrame.add(JShangJia);
        jFrame.add(JChuBan);
        jFrame.add(JMoney);
        jFrame.add(jbtn);
        jFrame.setVisible(true);

    }//init()

}
