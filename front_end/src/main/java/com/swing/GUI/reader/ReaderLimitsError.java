/*
 * Created by JFormDesigner on Sat May 18 22:17:00 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

/**
 * @author Brainrain
 */
public class ReaderLimitsError extends JFrame {
    public ReaderLimitsError() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("已超过您的最大借阅数目！");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(132, 132, 132)
                    .add(label1)
                    .addContainerGap(134, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(124, 124, 124)
                    .add(label1)
                    .addContainerGap(127, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
