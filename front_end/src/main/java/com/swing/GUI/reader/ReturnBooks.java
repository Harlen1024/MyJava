/*
 * Created by JFormDesigner on Sun May 19 15:30:48 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

import com.swing.entity.Record;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

import static com.swing.GUI.login.LibraryLogin.the_user_name;
import static com.swing.json.AnalysisJson.deleteJson;
import static com.swing.json.AnalysisJson.queryReaderRecordJson;
import static com.swing.json.AnalysisJson.readerLimitsUpJson;

/**
 * @author Brainrain
 */
public class ReturnBooks extends JFrame {
    public ReturnBooks() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        int count=table1.getSelectedRow();//获取你选中的行号（记录）
        String getISBN= table1.getValueAt(count, 0).toString();//读取你获取行号的某一列的值（也就是字段）

        if(deleteJson(getISBN)){
            //还书时增加借书限制+1
            readerLimitsUpJson(the_user_name);
            ReturnSuccess returnSuccess = new ReturnSuccess();
            returnSuccess.setVisible(true);
            returnSuccess.setResizable(false);

        }
    }

    private void initComponents() {

        //获取最大行数
        int max_size =  queryReaderRecordJson(the_user_name).size();
        /*
         * 设置JTable的列名
         */
        String[] columnNames = { "ISBN", "用户id", "用户名", "借书时间", "还书时间"};

        /*
         * 初始化JTable
         */
        Object[][] obj = new Object[max_size+20][5];

        //存放record的list
        List<Record> recordList = queryReaderRecordJson(the_user_name);

        for (int i = 0 ; i < max_size; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                switch (j)
                {
                    case 0:
                        obj[i][j] = recordList.get(i).getISBN();
                        break;
                    case 1:
                        obj[i][j] = recordList.get(i).getReader_id();
                        break;
                    case 2:
                        obj[i][j] = the_user_name;
                        break;
                    case 3:
                        obj[i][j] = recordList.get(i).getBorrowing_date();
                        break;
                    case 4:
                        obj[i][j] = recordList.get(i).getReturn_date();
                        break;
                }
            }
        }


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable(obj,columnNames);
        button1 = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- button1 ----
        button1.setText("还书");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //---- label1 ----
        label1.setText("ps：选中某一行，点击还书按钮！");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(button1)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.RELATED, 612, Short.MAX_VALUE)
                            .add(label1)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(contentPaneLayout.createSequentialGroup()
                    .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(label1)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
