package T6;

import java.awt.*;

public class FrameDemo3 extends Frame {

    //定义控件
    Label lblUsername,lblPassword;
    TextField txtUsername,txtPassword;
    Button btnOK,btnClose;

    Panel panel;

    public FrameDemo3(){
        super("布局管理器演示");
        /**
         * 布局管理
         *
         * 1.FlowLayout流布局
         *      1.从左到右，从上到下的布局方式来显示空间
         *      2.随着窗口大小发生变化，控件的位置也会跟着发生变化，但是，控件的大小不变
         *      3.默认的对齐方式是居中对齐；
         *          FlowLayout.LEFT
         *          FlowLayout.RIGHT
         *          FlowLayout.CENTER(默认值)
         * 2.BorderLayout布局(默认布局)
         *      1.窗口的大小发生变化以后，控件的大小也跟着发生变:
         *      2.整个窗口分成5个部分:
         *          BorderLayout.NORTH
         *          BorderLayout.SOUTH
         *          BorderLayout.WEST
         *          BorderLayout.EAST
         *          BorderLayout.CENTER
         *
         *
         */
        //创建容器,并且设置为流布局，并设置对齐方式
        //panel = new Panel(new FlowLayout(FlowLayout.LEFT));
        //创建容器，并且设置为边框布局
        panel = new Panel(new BorderLayout());

        //创建控件
        lblUsername = new Label("用户名称：");
        lblPassword = new Label("登录密码：");
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

        setSize(400,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FrameDemo3();
    }
}
