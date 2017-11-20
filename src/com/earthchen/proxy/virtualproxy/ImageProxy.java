package com.earthchen.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;


    public ImageProxy(URL url) {
        this.imageUrl = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) { // 如果已经有icon，就告诉它画出自己
            imageIcon.paintIcon(c, g, x, y);
        } else { // 否在显示加载中的消息
            g.drawString("loading cd cover,please", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    try {
                        imageIcon=new ImageIcon(imageUrl,"cd cover");
                        c.repaint();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }
}
