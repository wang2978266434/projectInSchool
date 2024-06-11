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
        JFrame jf = new JFrame("演示分组布局");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        GroupLayout layout = new GroupLayout(jp); //分组布局的面板
        jp.setLayout(layout);

        layout.setAutoCreateGaps(true);//组件之间的间隙自动适应
        layout.setAutoCreateContainerGaps(true); //容器与触到容器边框的组件之间的间隙自动适应

        JLabel lbl01 = new JLabel("账号");
        JLabel lbl02 = new JLabel("密码");
        JTextField textField01 = new JTextField("请输入~");
        JTextField textField02 = new JTextField("请输入~");
        JButton btn01 = new JButton("登录");
        JButton btn02 = new JButton("置空");

        /*
         *水平组（仅确定 X 轴方向的坐标/排列方式）
         */

        //水平并行: 垂直排列（上下排列）lbl01 和 lbl02
        GroupLayout.ParallelGroup hParalGp01 = layout.createParallelGroup();
        hParalGp01.addComponent(lbl01);
        hParalGp01.addComponent(lbl02);

        //水平并行（上下）textField01 和 textField02
        GroupLayout.ParallelGroup hParalGp02 = layout.createParallelGroup();
        hParalGp02.addComponent(textField01).addComponent(textField02);

        //水平串行（左右）hParalGp01 和 hParalGp02
        GroupLayout.SequentialGroup hSeqGp01 = layout.createSequentialGroup();
        hSeqGp01.addGroup(hParalGp01).addGroup(hParalGp02);

        //水平串行（左右）btn01 和 btn02
        GroupLayout.SequentialGroup hSeqGp02 = layout.createSequentialGroup();
        hSeqGp02.addComponent(btn01).addGap(20).addComponent(btn02); //添加 间隙

        //水平并行（上下）hSeqGp01 和 hSeqGp02
        GroupLayout.ParallelGroup hParalGroup = layout.createParallelGroup();
        hParalGroup.addGroup(hSeqGp01).addGroup(hSeqGp02);

        layout.setHorizontalGroup(hParalGroup); // 指定布局的 水平组（水平坐标）
        /*
         *垂直组（仅确定 Y 轴方向的坐标/排列方式）
         */

        // 垂直并行（左右）lbl01 和 textField01
        GroupLayout.ParallelGroup vParalGroup01 = layout.createParallelGroup().addComponent(lbl01).addComponent(textField01);

        // 垂直并行（左右）lbl02 和 textField02
        GroupLayout.ParallelGroup vParalGroup02 = layout.createParallelGroup().addComponent(lbl02).addComponent(textField02);

        // 垂直并行（左右）btn01 和 btn02
        GroupLayout.ParallelGroup vParalGroup03 = layout.createParallelGroup().addComponent(btn01).addComponent(btn02);

        // 垂直串行（上下）vParalGroup01, vParalGroup02 和 vParalGroup03
        GroupLayout.SequentialGroup vSeqGroup = layout.createSequentialGroup().addGroup(vParalGroup01).addGroup(vParalGroup02).addGroup(vParalGroup03);

        layout.setVerticalGroup(vSeqGroup);    // 指定布局的 垂直组（垂直坐标）
        //....................................................................................
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField01.setText("");
                textField02.setText("");
            }
        });
        //登陆事件处理
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField01.getText();
                String passWord = textField02.getText();
                if(javaTest.bookMangeProject1.tools.tool_If.isEmpt(name)){
                    JOptionPane.showMessageDialog(null,"用户名不能为空");
                }
                if(javaTest.bookMangeProject1.tools.tool_If.isEmpt(passWord)){
                    JOptionPane.showMessageDialog(null,"密码不能为空");
                }
                javaTest.bookMangeProject1.DengLu.user user = new user(name,passWord);
                Connection con = null;
                try {
                    con = dengLuDbMySql.getCon();
                    javaTest.bookMangeProject1.DengLu.user currentUser = userDao.DengLu(con, user);
                    if (currentUser != null ){
                        JOptionPane.showMessageDialog(null,"登陆成功");
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
        jf.setVisible(true);  // 显示窗口
    }
    public static void main(String[] args) {
    new javaTest.bookMangeProject1.view.DengLu().init_dengLu();

    }

}
