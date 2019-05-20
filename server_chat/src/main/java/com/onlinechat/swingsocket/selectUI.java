/*
 * Created by JFormDesigner on Sun May 19 22:50:56 CST 2019
 */

package com.onlinechat.swingsocket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.onlinechat.tool.CreatecdIcon;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Brainrain
 */
public class selectUI extends JFrame {
    public selectUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new Client();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new Server();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("用户");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //---- button2 ----
        button2.setText("服务");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        //---- label1 ----
        label1.setIcon(CreatecdIcon.add("background.png"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(button1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .add(118, 118, 118)
                    .add(label1)
                    .addPreferredGap(LayoutStyle.RELATED, 131, Short.MAX_VALUE)
                    .add(button2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(85, 85, 85)
                    .add(label1)
                    .add(0, 0, Short.MAX_VALUE))
                .add(button1, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .add(button2, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
