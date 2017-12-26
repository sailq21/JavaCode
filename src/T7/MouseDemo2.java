package T7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDemo2 extends JFrame {
    /**
     * 鼠标事件：MouseListener；
     * 鼠标移动：MouseMotionListener
     * 通过适配器类实现鼠标事件：MouseAdapter
     * */
    JLabel lblStatus;
    public MouseDemo2(){
        super("鼠标事件");
        lblStatus = new JLabel("当前鼠标位置：",JLabel.CENTER);
        add(lblStatus, BorderLayout.SOUTH);
        addMouseListener(new MouseAdapterHandle());
        //addMouseMotionListener(this);
        setLocationRelativeTo(null);
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseDemo2();
    }

   class MouseAdapterHandle extends MouseAdapter{
        //重写适配器类的MouseClicked函数

       @Override
       public void mouseClicked(MouseEvent e) {
           if(e.getClickCount()==1){
               lblStatus.setText("单击事件");
           }else if(e.getClickCount() ==2){
               if(e.getButton() ==1){
                   //左键
                   lblStatus.setText("单击左键");
               } else if(e.getButton() == 3){
                   //右键
                   lblStatus.setText("单击右键");
               }
               //双击
               lblStatus.setText("双击事件");
           }
       }
   }
}
