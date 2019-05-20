/*
 * Created by JFormDesigner on Thu May 16 18:24:12 CST 2019
 */

package com.swing.GUI.login;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

/**
 * @author Brainrain
 */
public class LoginDefeat extends JFrame {
    public LoginDefeat() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("登录失败！");

        //---- label2 ----
        label2.setText("请输入正确的用户名或密码！");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(GroupLayout.TRAILING, label2)
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .add(label1)
                            .add(54, 54, 54)))
                    .add(47, 47, 47))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(37, 37, 37)
                    .add(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .add(18, 18, 18)
                    .add(label2)
                    .addContainerGap(39, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
