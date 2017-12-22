package T6;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    Panel panel;
    Button btnNorth,btnSouth,btnWest,btnEast,btnCenter;

    public BorderLayoutDemo(){
        setTitle("BorderLayout边框布局" );
        //panel容器
        panel = new Panel(new BorderLayout());
        //创建按钮
        btnNorth = new Button("North");
        btnSouth = new Button("South");
        btnWest = new Button("West");
        btnEast = new Button("East");
        btnCenter = new Button("Center");
        //添加到Panel容器里面
        //默认显示在中间，可以指定位置;
        panel.add(btnNorth,BorderLayout.NORTH);
        panel.add(btnSouth,BorderLayout.SOUTH);
        panel.add(btnWest,BorderLayout.WEST);
        panel.add(btnEast,BorderLayout.EAST);
        panel.add(btnCenter,BorderLayout.CENTER);
        //把Panel添加到Frame
        add(panel);
        //设置窗口大小；
        setSize(500,500);
        //显示窗口
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
