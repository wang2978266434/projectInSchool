package javaTest.bookMangeProject1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class addButton {
    JFrame jFrame = new JFrame();
    //................���ð�ť............................
    JButton tiJiao = new JButton("�ύ");
    JButton quXiao = new JButton("ȡ��");
    //.................���ñ�ǩ.................................
    JLabel bianHao = new JLabel("���");
    JLabel bookName = new JLabel("ͼ������");
    JLabel FenLei = new JLabel("����");
    JLabel ShangJia = new JLabel("�ϼ�ʱ��");
    JLabel athor = new JLabel("����");
    JLabel ChuBanShe =  new JLabel("������");
    JLabel money  = new JLabel("�۸�");
    //..........................�����ı���..............................
    JTextField tfBianHao = new JTextField(15);
    JTextField tfBookName = new JTextField(15);
    JTextField tfAthor = new JTextField(15);
    JTextField tfChuBan = new JTextField(15);
    JTextField tfMoney = new JTextField(15);
    //.........................����������..............................
    JComboBox jcFenLei = new JComboBox();
    JComboBox jcYear = new JComboBox();
    JComboBox jcMonth = new JComboBox();
    JComboBox jcDay = new JComboBox();
    //.......................����װ������ĺ���.........................
    public void init(){
        //.................���ñ�Ų��ɱ༭.........................
        tfBianHao.setEditable(false);
        jcFenLei.addItem("����");
        jcFenLei.addItem("������");
        jcFenLei.addItem("�Ƽ���");
        jcFenLei.addItem("������");
        jcFenLei.addItem("����");
        //....................����������������...............................
        jcYear.addItem("��");
        jcYear.addItem("2022");
        jcMonth.addItem("��");
        jcMonth.addItem("2");
        jcDay.addItem("��");
        jcDay.addItem("13");
        //����װ����ѡ���ĺ��Ӻ�panel
        JPanel jpFenLei = new JPanel();
        JPanel jpBox = new JPanel();
        Box hBox = Box.createHorizontalBox();
        hBox.add(jcYear);
        hBox.add(jcMonth);
        hBox.add(jcDay);
        //..............................����װ�����ı���ĺ���................................
        Box BbianHao = Box.createHorizontalBox();
        Box BbookName = Box.createHorizontalBox();
        Box Bauthor = Box.createHorizontalBox();
        Box BFenLei = Box.createHorizontalBox();
        Box BShangJia = Box.createHorizontalBox();
        Box BChuBan = Box.createHorizontalBox();
        Box BMoney = Box.createHorizontalBox();
        //...........................װ��ť�ĺ��ӡ�����������������������������������������������
        Box BtiAndQu = Box.createHorizontalBox();
        //.............................Ϊÿһ��ˮƽ���box..........................
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
        //...........................����jpanel����װbox.........................................
        JPanel jbianHao = new JPanel();
        JPanel JBookName = new JPanel();
        JPanel JAthor = new JPanel();
        JPanel JFenLei = new JPanel();
        JPanel JShangJia = new JPanel();
        JPanel JChuBan = new JPanel();
        JPanel JMoney = new JPanel();
        JPanel jbtn = new JPanel();
        //..................���...........................
        jbianHao.add(BbianHao);
        JBookName.add(BbookName);
        JAthor.add(Bauthor);
        JFenLei.add(BFenLei);
        JShangJia.add(BShangJia);
        JChuBan.add(BChuBan);
        JMoney.add(BMoney);
        jbtn.add(BtiAndQu);
        //Ϊȡ���Ͳ�������¼���������
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
        //..............................����jframe............................\
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
