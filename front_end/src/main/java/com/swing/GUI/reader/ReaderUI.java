/*
 * Created by JFormDesigner on Thu May 16 15:27:24 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.swing.GUI.login.LibraryLogin;
import com.swing.tool.datetool.DateResult;
import org.jdesktop.layout.GroupLayout;

/**
 * @author Brainrain
 */
public class ReaderUI extends JFrame {
    public ReaderUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        QueryBooks queryBooks = new QueryBooks();
        queryBooks.setVisible(true);
        queryBooks.setResizable(false);
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here

        BorrowBooks borrowBooks = new BorrowBooks();
        borrowBooks.setVisible(true);
        borrowBooks.setResizable(false);
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here

        ReturnBooks returnBooks = new ReturnBooks();
        returnBooks.setVisible(true);
        returnBooks.setResizable(false);

    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here

        ReaderRecord readerRecord = new ReaderRecord();
        readerRecord.setVisible(true);
        readerRecord.setResizable(false);

    }

    private void initComponents() {

        LibraryLogin libraryLogin = new LibraryLogin();

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("查询书籍");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //---- button2 ----
        button2.setText("借阅书籍");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        //---- button3 ----
        button3.setText("归还书籍");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });

        //---- button4 ----
        button4.setText("我的记录");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button4ActionPerformed(e);
            }
        });

        //---- textField1 ----
        DateResult dateResult = new DateResult();
        textField1.setText("当前用户为：" + libraryLogin.the_user_name + "    当前日期：" + dateResult.getCurrentTime());
        textField1.setEditable(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(92, 92, 92)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup()
                                .add(button1)
                                .add(button3))
                            .add(59, 59, 59)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(button4)
                                .add(button2))))
                    .addContainerGap(91, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(57, 57, 57)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                        .add(button2)
                        .add(button1))
                    .add(33, 33, 33)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                        .add(button3)
                        .add(button4))
                    .add(38, 38, 38)
                    .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
