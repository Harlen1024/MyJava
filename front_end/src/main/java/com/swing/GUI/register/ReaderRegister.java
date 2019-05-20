/*
 * Created by JFormDesigner on Thu May 16 19:08:29 CST 2019
 */

package com.swing.GUI.register;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.swing.entity.PostReader;
import com.swing.json.AnalysisJson;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Brainrain
 */
public class ReaderRegister extends JFrame {
    public ReaderRegister() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        AnalysisJson analysisJson = new AnalysisJson();

        //获取文本框输入
        PostReader postReader = new PostReader();
        postReader.setFirst_name(textField3.getText());
        postReader.setLast_name(textField4.getText());
        postReader.setAddress(textField5.getText());
        postReader.setPhone_number(textField6.getText());
        //注册时借书限制即为5
        postReader.setLimits(5);
        postReader.setUser_name(textField8.getText());
        postReader.setPassword(textField9.getText());

        //注册成功弹窗
        if(analysisJson.registerJson(postReader)){

            RegisterSuccess registerSuccess = new RegisterSuccess();
            registerSuccess.setVisible(true);
            registerSuccess.setResizable(false);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        textField3 = new JTextField(6);
        textField4 = new JTextField(6);
        textField5 = new JTextField(6);
        textField6 = new JTextField(6);
        textField7 = new JTextField(6);
        textField8 = new JTextField(6);
        textField9 = new JTextField(6);
        label9 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label2 ----
        label2.setText("姓：");

        //---- label3 ----
        label3.setText("名字：");

        //---- label4 ----
        label4.setText("地址：");

        //---- label5 ----
        label5.setText("电话号码：");

        //---- label6 ----
        label6.setText("借书数：");

        //---- label7 ----
        label7.setText("用户名：");

        //---- label8 ----
        label8.setText("密码：");

        //---- label9 ----
        label9.setText("用户注册");

        //---- button1 ----
        button1.setText("注册");

        //---- textField7 ----
        //锁定借书数
        textField7.setText("注册默认为5");
        textField7.setEditable(false);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(122, 122, 122)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(label2)
                                .add(label3)
                                .add(label4)
                                .add(label5)
                                .add(label6)
                                .add(label7)
                                .add(label8))
                            .add(72, 72, 72)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(172, 172, 172)
                            .add(label9))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(145, 145, 145)
                            .add(button1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(119, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(18, 18, 18)
                    .add(label9)
                    .add(14, 14, 14)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label2)
                        .add(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(41, 41, 41)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label3)
                        .add(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(41, 41, 41)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label4)
                        .add(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(41, 41, 41)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label5)
                        .add(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(41, 41, 41)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label6)
                        .add(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(41, 41, 41)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label7)
                        .add(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(41, 41, 41)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label8)
                        .add(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                    .add(button1)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JLabel label9;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
