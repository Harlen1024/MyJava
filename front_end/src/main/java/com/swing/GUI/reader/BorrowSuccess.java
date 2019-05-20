/*
 * Created by JFormDesigner on Sun May 19 14:19:34 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

/**
 * @author Brainrain
 */
public class BorrowSuccess extends JFrame {
    public BorrowSuccess() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("借书成功！");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(170, Short.MAX_VALUE)
                    .add(label1)
                    .add(168, 168, 168))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(119, 119, 119)
                    .add(label1)
                    .addContainerGap(132, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
