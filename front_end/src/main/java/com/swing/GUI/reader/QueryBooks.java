/*
 * Created by JFormDesigner on Fri May 17 21:34:28 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.swing.*;

import com.swing.entity.Books;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

import static com.swing.json.AnalysisJson.getBooksJson;
import static com.swing.json.AnalysisJson.getPartBooksJson;

/**
 * @author Brainrain
 */
public class QueryBooks extends JFrame {

    //获取最大行数
    private int max_size =  getBooksJson().size();
    /*
     * 设置JTable的列名
     */
    private String[] columnNames = { "ISBN", "书名", "作者", "出版社", "版号", "出版日期" , "类别"};

    /*
     * 初始化JTable
     */
    private Object[][] obj = new Object[max_size+20][7];

    public QueryBooks() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        //存放books的list
        List<Books> booksList = getBooksJson();

        for (int i = 0 ; i < max_size; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                switch (j)
                {
                    case 0:
                        obj[i][j] = booksList.get(i).getIsbn();
                        break;
                    case 1:
                        obj[i][j] = booksList.get(i).getTitle();
                        break;
                    case 2:
                        obj[i][j] = booksList.get(i).getAuthors();
                        break;
                    case 3:
                        obj[i][j] = booksList.get(i).getPublisher();
                        break;
                    case 4:
                        obj[i][j] = booksList.get(i).getEdition_number();
                        break;
                    case 5:
                        obj[i][j] = booksList.get(i).getPublication_date();
                        break;
                    case 6:
                        obj[i][j] = booksList.get(i).getType();
                        break;
                }
            }
        }
        //插入后刷新
        table1.validate();
        table1.updateUI();
    }

    private void button2ActionPerformed(ActionEvent e) throws UnsupportedEncodingException {
        // TODO add your code here

        //文本框输入
        String fuzzy = textField1.getText();

        //存放books的list
        List<Books> booksList = getPartBooksJson(fuzzy);

        for (int i = 0 ; i < max_size; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                switch (j)
                {
                    case 0:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getIsbn();
                        }
                        break;
                    case 1:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getTitle();
                        }
                        break;
                    case 2:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getAuthors();
                        }
                        break;
                    case 3:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getPublisher();
                        }
                        break;
                    case 4:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getEdition_number();
                        }
                        break;
                    case 5:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getPublication_date();
                        }
                        break;
                    case 6:
                        if(booksList.size() - 1 < i){
                            obj[i][j] = null;
                        }
                        else {
                            obj[i][j] = booksList.get(i).getType();
                        }
                        break;
                }
            }
        }
        //插入后刷新
        table1.validate();
        table1.updateUI();

    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable(obj,columnNames);
        button1 = new JButton();
        button2 = new JButton();
        textField1 = new JTextField(10);

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- button1 ----
        button1.setText("全部查询");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //---- button2 ----
        button2.setText("条件查询");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    button2ActionPerformed(e);
                } catch (UnsupportedEncodingException e1) {
                    e1.printStackTrace();
                }
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .add(contentPaneLayout.createSequentialGroup()
                    .add(163, 163, 163)
                    .add(button1)
                    .addPreferredGap(LayoutStyle.RELATED, 277, Short.MAX_VALUE)
                    .add(button2)
                    .add(18, 18, 18)
                    .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .add(120, 120, 120))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(0, 46, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(button2)
                        .add(button1)
                        .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.UNRELATED)
                    .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
