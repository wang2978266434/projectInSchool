package javaTest.bookMangeProject1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPage {
    String[] columnNames = {"编号","图书名称","作者","分类","上架时间","出版社","价格" };// 定义表格列名数组
    String[][] rowData = {
            {"1","人类星环向"	,"沃兹基"	,"A"	,"1715754756"	,"鸿运"	,"90.00"},
            {"2","人类星环向", "沃兹基", "A", "1715754756", "鸿运", "90.00"},
            {"3","huaisd", "sda", "B", "1715754756", "鸿运2", "900.00"},
            {"4","人环向", "ASD", "D", "1715754756", "ads", "230.00"},
            {"5","星环", "沃SAC", "C", "1715754756", "adfb", "440.00"},
            {"6","星向","沃兹基WQ","A","1715754756","asdkb","130.00"},
            {"7","人星向","沃兹基AHS","A","1715754756","afh","560.00"},
            {"8","人类","沃ASD","B","1715754756","quge","780.00"},
            {"9","人星向","沃ASD基","C","1715754756","ad","980.00"},
            {"10","人类WQR向","沃KH","D","1715754756","adh","880.00"},
            {"11","人类星环向","JGH","B","1715754756","mhb","980.00"},
            {"12","人类星环向2","ASD","B","1715754756","asdk","340.00"},
            {   "13","人DG","ASD","C","1715754756","asdhk","2310.00"},
            {   "14","ZDB向","ASD","D","1715754756","akdj","890.00"},
            {   "15","人FFFFFFFF","DGB","A","1715754756","sda","34.00"},
            {   "16","人2","GFB","D","1715754756","as","78.00"},
            {   "17","人类星4","DGSF","B","1715754756","jl","45.00"},
            {   "18","人55环向","沃DSF","B","1715754756","sad","23.00"},
            {   "19","人66向","ASDS兹基","A","1715754756","ahds","21.00'"},
            { "20","人22向","沃QQWE基","A","1715754756","qis","98.00" }
    };// 定义表格数据数组
    JButton SouSuo = new JButton("搜索");
    JButton add = new JButton("增加");
    JButton delate = new JButton("删除");
    JButton edit = new JButton("编辑");
    JButton query = new JButton("查询");
    JTextField ssField = new JTextField(50);
    public void init(){
        Box topText = Box.createHorizontalBox();
        topText.setBounds(0,0,20,20);
        topText.add(ssField);
        topText.add(SouSuo);
        Box right = Box.createVerticalBox();
        right.add(add);
        right.add(delate);
        right.add(edit);
        right.add(query);
        JFrame jf = new JFrame();
        JPanel panel = new JPanel();

        jf.setTitle("表格组件");
        JTable table = new JTable(rowData, columnNames);// 创建指定列名和数据的表格
        table.setRowHeight(30);
        panel.add(new JScrollPane(table));
        //......................增加按钮点击事件...............................
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addButton().init();
            }
        });
        jf.add(topText, BorderLayout.NORTH);
        jf.add(panel);
        jf.add(right,BorderLayout.EAST);
        jf.setSize(700,400);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
    }
    public static void main(String[] args)throws Exception {
        new mainPage().init();

    }
}
