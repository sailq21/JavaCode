package T7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
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

    public Login(){
        btnLogin = new JButton("登录");
        //默认布局:BorderLayout
        add(btnLogin);
        //创建Action事件的对象
        ActionHandle actionHandle = new ActionHandle();
        //绑定Action时间
        btnLogin.addActionListener(actionHandle);
        //设置窗口大小
        setSize(300,300);
        setVisible(true);
        //设置窗口居中
        setLocationRelativeTo(null);
        //点击关闭按钮是退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
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
            JOptionPane.showMessageDialog(null,"Action事件发生了");

        }
    }
}
