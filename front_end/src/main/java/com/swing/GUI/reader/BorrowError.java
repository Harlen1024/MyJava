/*
 * Created by JFormDesigner on Sat May 18 21:25:13 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

import static com.swing.GUI.reader.BorrowBooks.return_date;

/**
 * @author Brainrain
 */
public class BorrowError extends JFrame {
    public BorrowError() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("该书已被借出，归还时间");

        //---- label2 ----
        label2.setText(return_date);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(182, 182, 182)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(label1)
                        .add(label2))
                    .addContainerGap(195, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(106, 106, 106)
                    .add(label1)
                    .add(18, 18, 18)
                    .add(label2)
                    .addContainerGap(110, Short.MAX_VALUE))
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
