package T7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login2 extends JFrame {
    /**
     * 事件：
     *  1.事件类
     *  2.事件源
     *  3.处理
     * 实现控件的事件步骤
     *  1.创建控件：（btnLogin）
     *  2.创建事件类（ActionHandle）
     *  3.创建事件类的对象;
     *  4.控件与事件类的实例对象进行绑定
     *      btnLogin.addActionListener(actionHandle);
     *
     *
     * */
    JButton btnLogin,btnCacel;
    JLabel lblUser,lblPass;
    JTextField txtUser;
    JPasswordField txtPass;

    public Login2(){
        lblUser = new JLabel("用户名称：",JLabel.RIGHT);
        lblPass = new JLabel("登录密码：",JLabel.RIGHT);
        txtUser = new JTextField();
        txtPass = new JPasswordField();
        btnLogin = new JButton("登录");
        btnCacel = new JButton("关闭");
        //设置窗口的GridLayout布局
        Container con  = getContentPane();
        con.setLayout(new GridLayout(3,2,10,20));

        add(lblUser);
        add(txtUser);
        add(lblPass);
        add(txtPass);
        add(btnLogin);
        add(btnCacel);

        //创建Action事件的对象
        ActionHandle actionHandle = new ActionHandle();
        //绑定Action事件
        btnLogin.addActionListener(actionHandle);
        btnCacel.addActionListener(actionHandle);
        //设置窗口大小
        setSize(300,300);
        setVisible(true);
        //设置窗口居中
        setLocationRelativeTo(null);
        //点击关闭按钮是退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login2();
    }
    //定义一个Action内部类实现ActionListener接口
    class ActionHandle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //弹出对话框：showMessageDialog
            /**
             * 参数1：是指父类（可视化的窗口类），如果没有穿Null值，如果有一般传this
             * 参数2：对话框中显示的内容
             * */
            //getSource函数获取当前发生事件的控件名称
            if(e.getSource() == btnLogin){
                //获取文本框的内容
                //trim函数删除字符串两端的空格
                String txtusername = txtUser.getText().trim();
                String txtpassword = txtPass.getText().trim();

                if(txtusername .equals("admin") && txtpassword.equals("1234")){
                    JOptionPane.showMessageDialog(null,"您点击了登录按钮，登录成功");
                }else {
                    JOptionPane.showMessageDialog(null,"用户名或密码错误，登录失败");
                }

                //JOptionPane.showMessageDialog(null,"您点击了登录按钮，登录成功");
            }else if(e.getSource() == btnCacel ){
                JOptionPane.showMessageDialog(null,"您点击了关闭按钮，窗口马上要关闭了");
                //exit函数：关闭窗口，退出程序
                System.exit(0);
            }

        }
    }
}
