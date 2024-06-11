package javaTest.bookMangeProject1.view;
import javaTest.bookMangeProject1.DengLu.user;
import javaTest.bookMangeProject1.DengLu.userDao;
import javaTest.bookMangeProject1.tools.DengLuDb_MySql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

class DengLu {
    public void init_dengLu(){
        javaTest.bookMangeProject1.tools.DengLuDb_MySql dengLuDbMySql = new DengLuDb_MySql();
        javaTest.bookMangeProject1.DengLu.userDao userDao = new userDao();
        JFrame jf = new JFrame("��ʾ���鲼��");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        GroupLayout layout = new GroupLayout(jp); //���鲼�ֵ����
        jp.setLayout(layout);

        layout.setAutoCreateGaps(true);//���֮��ļ�϶�Զ���Ӧ
        layout.setAutoCreateContainerGaps(true); //�����봥�������߿�����֮��ļ�϶�Զ���Ӧ

        JLabel lbl01 = new JLabel("�˺�");
        JLabel lbl02 = new JLabel("����");
        JTextField textField01 = new JTextField("������~");
        JTextField textField02 = new JTextField("������~");
        JButton btn01 = new JButton("��¼");
        JButton btn02 = new JButton("�ÿ�");

        /*
         *ˮƽ�飨��ȷ�� X �᷽�������/���з�ʽ��
         */

        //ˮƽ����: ��ֱ���У��������У�lbl01 �� lbl02
        GroupLayout.ParallelGroup hParalGp01 = layout.createParallelGroup();
        hParalGp01.addComponent(lbl01);
        hParalGp01.addComponent(lbl02);

        //ˮƽ���У����£�textField01 �� textField02
        GroupLayout.ParallelGroup hParalGp02 = layout.createParallelGroup();
        hParalGp02.addComponent(textField01).addComponent(textField02);

        //ˮƽ���У����ң�hParalGp01 �� hParalGp02
        GroupLayout.SequentialGroup hSeqGp01 = layout.createSequentialGroup();
        hSeqGp01.addGroup(hParalGp01).addGroup(hParalGp02);

        //ˮƽ���У����ң�btn01 �� btn02
        GroupLayout.SequentialGroup hSeqGp02 = layout.createSequentialGroup();
        hSeqGp02.addComponent(btn01).addGap(20).addComponent(btn02); //��� ��϶

        //ˮƽ���У����£�hSeqGp01 �� hSeqGp02
        GroupLayout.ParallelGroup hParalGroup = layout.createParallelGroup();
        hParalGroup.addGroup(hSeqGp01).addGroup(hSeqGp02);

        layout.setHorizontalGroup(hParalGroup); // ָ�����ֵ� ˮƽ�飨ˮƽ���꣩
        /*
         *��ֱ�飨��ȷ�� Y �᷽�������/���з�ʽ��
         */

        // ��ֱ���У����ң�lbl01 �� textField01
        GroupLayout.ParallelGroup vParalGroup01 = layout.createParallelGroup().addComponent(lbl01).addComponent(textField01);

        // ��ֱ���У����ң�lbl02 �� textField02
        GroupLayout.ParallelGroup vParalGroup02 = layout.createParallelGroup().addComponent(lbl02).addComponent(textField02);

        // ��ֱ���У����ң�btn01 �� btn02
        GroupLayout.ParallelGroup vParalGroup03 = layout.createParallelGroup().addComponent(btn01).addComponent(btn02);

        // ��ֱ���У����£�vParalGroup01, vParalGroup02 �� vParalGroup03
        GroupLayout.SequentialGroup vSeqGroup = layout.createSequentialGroup().addGroup(vParalGroup01).addGroup(vParalGroup02).addGroup(vParalGroup03);

        layout.setVerticalGroup(vSeqGroup);    // ָ�����ֵ� ��ֱ�飨��ֱ���꣩
        //....................................................................................
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField01.setText("");
                textField02.setText("");
            }
        });
        //��½�¼�����
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField01.getText();
                String passWord = textField02.getText();
                if(javaTest.bookMangeProject1.tools.tool_If.isEmpt(name)){
                    JOptionPane.showMessageDialog(null,"�û�������Ϊ��");
                }
                if(javaTest.bookMangeProject1.tools.tool_If.isEmpt(passWord)){
                    JOptionPane.showMessageDialog(null,"���벻��Ϊ��");
                }
                javaTest.bookMangeProject1.DengLu.user user = new user(name,passWord);
                Connection con = null;
                try {
                    con = dengLuDbMySql.getCon();
                    javaTest.bookMangeProject1.DengLu.user currentUser = userDao.DengLu(con, user);
                    if (currentUser != null ){
                        JOptionPane.showMessageDialog(null,"��½�ɹ�");
                    }
                    dengLuDbMySql.closeCon(con);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //.......................................................................
        jf.setContentPane(jp);
        //jf.pack();
        jf.setSize(300, 150);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);  // ��ʾ����
    }
    public static void main(String[] args) {
    new javaTest.bookMangeProject1.view.DengLu().init_dengLu();

    }

}
