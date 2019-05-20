/*
 * Created by JFormDesigner on Thu May 16 14:52:53 CST 2019
 */

package com.swing.GUI.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.swing.GUI.reader.ReaderUI;
import com.swing.GUI.register.ReaderRegister;
import com.swing.tool.icontool.CreatecdIcon;
import com.swing.json.AnalysisJson;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Brainrain
 */
public class LibraryLogin extends JFrame {

    public static String the_user_name;//全局的用户名

    public LibraryLogin() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        AnalysisJson analysisJson = new AnalysisJson();
        //判断登录是否成功
        the_user_name = textField1.getText();
        String user=textField1.getText();
        String pwd=new String(passwordField1.getPassword());
        if(analysisJson.loginJson(user,pwd)){
            ReaderUI functionUI = new ReaderUI();
            functionUI.setVisible(true);
            functionUI.setResizable(false);
        }
        else{
            LoginDefeat loginDefeat = new LoginDefeat();
            loginDefeat.setVisible(true);
            loginDefeat.setResizable(false);
        }

    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here

        ReaderRegister readerRegister = new ReaderRegister();
        readerRegister.setVisible(true);
        readerRegister.setResizable(false);

    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField(10);
        passwordField1 = new JPasswordField(10);
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setIcon(CreatecdIcon.add("background.png"));

        //---- label2 ----
        label2.setText("用户名:");

        //---- label3 ----
        label3.setText("密码:");

        //---- button1 ----
        button1.setText("登陆");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //---- button2 ----
        button2.setText("注册");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        //---- button3 ----
        button3.setText("管理员登陆");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(label1)
                    .addPreferredGap(LayoutStyle.RELATED, 170, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup()
                                .add(label3)
                                .add(label2))
                            .add(41, 41, 41)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(button1)
                            .add(29, 29, 29)
                            .add(button2))
                        .add(button3, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
                    .add(72, 72, 72))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label2)
                        .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(35, 35, 35)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label3)
                        .add(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(label1))
                    .add(31, 31, 31)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(button1)
                        .add(button2))
                    .add(32, 32, 32)
                    .add(button3)
                    .add(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
