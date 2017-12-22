package T6;

import java.awt.*;

public class FixDemo extends Frame {
    //定义控件
    Label lblUsername,lblPassword;
    TextField txtUsername,txtPassword;
    Button btnOK,btnClose;
    Panel panel;
    public FixDemo(){

        //坐标定位布局
        panel = new Panel(null);
        //创建控件
        lblUsername = new Label("用户名称：",Label.RIGHT);
        //设置控件大小
        lblUsername.setSize(80,20);
        //设置在窗口上显示的左上角的坐标
        lblUsername.setLocation(50,50);

        txtUsername = new TextField(10);
        txtUsername.setSize(80,20);
        txtUsername.setLocation(130,50);

        lblPassword = new Label("登录密码：",Label.RIGHT);
        lblPassword.setSize(80,20);
        lblPassword.setLocation(50,90);

        txtPassword = new TextField(10);
        txtPassword.setSize(80,20);
        txtPassword.setLocation(130,90);

        btnOK = new Button("确定");
        btnOK.setSize(80,20);
        btnOK.setLocation(100,130);

        btnClose = new Button("关闭");
        btnClose.setSize(80,20);
        btnClose.setLocation(200,130);

        //添加到容器
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnOK);
        panel.add(btnClose);
        add(panel);

        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FixDemo();
    }
}
