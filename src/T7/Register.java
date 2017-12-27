package T7;

import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {

    JPanel panelCenter,panelSouth;
    JLabel lblTitle;
    JButton btnReg,btnClose;

    JLabel lblusername,lblpassword,lblcfgpwd,lblage,lblsex,lblcardno;
    JLabel lblnation,lblhobit,lblRemark;

    //文本框
    JTextField txtUserName,txtAge,txtCardno;
    //密码框
    JPasswordField txtpwd,txtcfgpwd;
    //单选框
    JRadioButton rbmale,rbremale;
    //下拉列表框
    JComboBox cbNation;
    //多选框
    JCheckBox cbBasketball,cbFootball,cbsing,cnNet,cbDance,cbBook,cbGame;
    //文本区域框
    JTextArea txtRmark;

    public Register(){
        super("用户注册");
        //setTitle("用户注册");
        lblTitle = new JLabel("用户注册",JLabel.CENTER);
        lblTitle.setBackground(Color.red);
        //设置字体，黑体，粗体，32号字
        lblTitle.setFont(new Font("黑体",Font.BOLD,32));
        //设置字体颜色
        lblTitle.setForeground(Color.RED);
        //绝对布局（坐标）
        panelCenter = new JPanel(null);
        //流布局，居中对齐
        panelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelSouth.setBackground(Color.pink);
        panelCenter.setBackground(Color.cyan);
        add(lblTitle,BorderLayout.NORTH);
        add(panelCenter);
        add(panelSouth,BorderLayout.SOUTH);
        btnReg = new JButton("注册");
        btnClose = new JButton("关闭");
        panelSouth.add(btnReg);
        panelSouth.add(btnClose);

        lblusername = new JLabel("用户名称：",JLabel.RIGHT);
        lblusername.setBounds(100,80,100,20);
        txtUserName = new JTextField("");
        txtUserName.setBounds(200,80,200,20);

        panelCenter.add(lblusername);
        panelCenter.add(txtUserName);



        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Register();
    }

}
