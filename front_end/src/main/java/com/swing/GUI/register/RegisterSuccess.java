/*
 * Created by JFormDesigner on Thu May 16 19:14:57 CST 2019
 */

package com.swing.GUI.register;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

/**
 * @author Brainrain
 */
public class RegisterSuccess extends JFrame {
    public RegisterSuccess() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("注册成功！");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .add(label1)
                    .add(68, 68, 68))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(50, 50, 50)
                    .add(label1)
                    .addContainerGap(51, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
