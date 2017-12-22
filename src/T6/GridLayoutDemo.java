package T6;

import java.awt.*;

public class GridLayoutDemo extends Frame{

    //定义控件
    Label lblUsername,lblPassword;
    TextField txtUsername,txtPassword;
    Button btnOK,btnClose;
    Panel panel;

    public GridLayoutDemo(){
        super("网格布局");
        /*
        *  GridLayout网格布局
        *   构造函数的参数；
        *       参数1：行数
        *       参数2：列数
        *       参数3：水平间隔
        *       参数4：垂直间隔
        *   窗口的大小发生变化，空间的大小也会发生变化
        * */

        panel = new Panel(new GridLayout(3,2,10,10));
        //创建控件
        lblUsername = new Label("用户名称：",Label.RIGHT);
        lblPassword = new Label("登录密码：",Label.RIGHT);
        txtUsername = new TextField(10);
        txtPassword = new TextField(10);
        btnOK = new Button("确定");
        btnClose = new Button("关闭");
        //添加到容器
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnOK);
        panel.add(btnClose);
        add(panel);

        setSize(400,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
