package javaTest.bookMangeProject1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPage {
    String[] columnNames = {"���","ͼ������","����","����","�ϼ�ʱ��","������","�۸�" };// ��������������
    String[][] rowData = {
            {"1","�����ǻ���"	,"���Ȼ�"	,"A"	,"1715754756"	,"����"	,"90.00"},
            {"2","�����ǻ���", "���Ȼ�", "A", "1715754756", "����", "90.00"},
            {"3","huaisd", "sda", "B", "1715754756", "����2", "900.00"},
            {"4","�˻���", "ASD", "D", "1715754756", "ads", "230.00"},
            {"5","�ǻ�", "��SAC", "C", "1715754756", "adfb", "440.00"},
            {"6","����","���Ȼ�WQ","A","1715754756","asdkb","130.00"},
            {"7","������","���Ȼ�AHS","A","1715754756","afh","560.00"},
            {"8","����","��ASD","B","1715754756","quge","780.00"},
            {"9","������","��ASD��","C","1715754756","ad","980.00"},
            {"10","����WQR��","��KH","D","1715754756","adh","880.00"},
            {"11","�����ǻ���","JGH","B","1715754756","mhb","980.00"},
            {"12","�����ǻ���2","ASD","B","1715754756","asdk","340.00"},
            {   "13","��DG","ASD","C","1715754756","asdhk","2310.00"},
            {   "14","ZDB��","ASD","D","1715754756","akdj","890.00"},
            {   "15","��FFFFFFFF","DGB","A","1715754756","sda","34.00"},
            {   "16","��2","GFB","D","1715754756","as","78.00"},
            {   "17","������4","DGSF","B","1715754756","jl","45.00"},
            {   "18","��55����","��DSF","B","1715754756","sad","23.00"},
            {   "19","��66��","ASDS�Ȼ�","A","1715754756","ahds","21.00'"},
            { "20","��22��","��QQWE��","A","1715754756","qis","98.00" }
    };// ��������������
    JButton SouSuo = new JButton("����");
    JButton add = new JButton("����");
    JButton delate = new JButton("ɾ��");
    JButton edit = new JButton("�༭");
    JButton query = new JButton("��ѯ");
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

        jf.setTitle("������");
        JTable table = new JTable(rowData, columnNames);// ����ָ�����������ݵı��
        table.setRowHeight(30);
        panel.add(new JScrollPane(table));
        //......................���Ӱ�ť����¼�...............................
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
