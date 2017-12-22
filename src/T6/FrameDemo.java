package T6;

import java.awt.*;

public class FrameDemo extends Frame{
    public FrameDemo(){
        //设置标题
        super("Frame窗口程序演示");
        //setTitle("Frame窗口程序演示");
        //设置窗口大小
        this.setSize(500,400);
        //显示窗口
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameDemo();
    }
}
