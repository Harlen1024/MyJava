/*
 * Created by JFormDesigner on Sat May 18 20:22:12 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

import com.swing.entity.Books;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

import static com.swing.GUI.login.LibraryLogin.the_user_name;
import static com.swing.json.AnalysisJson.*;

/**
 * @author Brainrain
 */
public class BorrowBooks extends JFrame {

    public static String the_isbn;//传递图书归还时间的全局变量

    public static String return_date;

    public BorrowBooks() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        int count=table1.getSelectedRow();//获取你选中的行号（记录）
        String getISBN= table1.getValueAt(count, 0).toString();//读取你获取行号的某一列的值（也就是字段）
        the_isbn = getISBN;

        //判断书籍是否已经借出
        if(recordDateJson(getISBN)!=null){

            return_date = recordDateJson(getISBN);
            BorrowError borrowError = new BorrowError ();
            borrowError.setVisible(true);
            borrowError.setResizable(false);

        }
        else{

            //判断读者的借书限制
            if(!readerLimitsJson(the_user_name)){

                ReaderLimitsError readerLimitsError = new ReaderLimitsError();
                readerLimitsError.setVisible(true);
                readerLimitsError.setResizable(false);

            }
            else{

                //还书时间
                ReturnDate Date = new ReturnDate();
                Date.returnDate();

            }

        }

    }

    private void initComponents() {

        //获取最大行数
        int max_size =  getBooksJson().size();
        /*
         * 设置JTable的列名
         */
        String[] columnNames = { "ISBN", "书名", "作者", "出版社", "版号", "出版日期" , "类别"};

        /*
         * 初始化JTable
         */
        Object[][] obj = new Object[max_size+20][7];

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

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable(obj,columnNames);
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("借书");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label1 ----
        label1.setText("ps:选中某一行，点击借书按钮！");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(button1)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.RELATED, 633, Short.MAX_VALUE)
                            .add(label1)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(button1, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .add(contentPaneLayout.createSequentialGroup()
                    .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.RELATED)
                    .add(label1)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
