package T7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDemo extends JFrame implements MouseListener,MouseMotionListener{
    /**
     * 鼠标事件：MouseListener；
     * 鼠标移动：MouseMotionListener
     * */
    JLabel lblStatus;
    public MouseDemo(){
        super("鼠标事件");
        lblStatus = new JLabel("当前鼠标位置：",JLabel.CENTER);
        add(lblStatus, BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);
        setLocationRelativeTo(null);
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseDemo();
    }

    @Override
    //鼠标点击（单击，双击，右键，左键）
    public void mouseClicked(MouseEvent e) {
        //JOptionPane.showMessageDialog(this,"点击鼠标");
        lblStatus.setText("点击鼠标");
        //单击
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
        };
    }

    @Override
    //按住鼠标
    public void mousePressed(MouseEvent e) {
        //JOptionPane.showMessageDialog(this,"按下鼠标");
        lblStatus.setText("按下鼠标");
    }

    @Override
    //放开鼠标
    public void mouseReleased(MouseEvent e) {
        //JOptionPane.showMessageDialog(this,"放开鼠标");
        lblStatus.setText("放开鼠标");
    }

    @Override
    //鼠标进入某个控件区域
    public void mouseEntered(MouseEvent e) {
        //JOptionPane.showMessageDialog(this,"点击进入");
        lblStatus.setText("点击进入");
    }

    @Override
    //鼠标退出某个控件区域
    public void mouseExited(MouseEvent e) {
        //JOptionPane.showMessageDialog(this,"鼠标移出");
        lblStatus.setText("鼠标移出");
    }

    @Override
    //鼠标拖动
    public void mouseDragged(MouseEvent e) {
        lblStatus.setText("鼠标拖动");
    }

    @Override
    //鼠标移动
    public void mouseMoved(MouseEvent e) {
        lblStatus.setText("鼠标移动，X坐标" + e.getX()+ ",Y坐标：" +e.getY());
    }
}
