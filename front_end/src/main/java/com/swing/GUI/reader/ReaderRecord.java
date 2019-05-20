/*
 * Created by JFormDesigner on Sun May 19 16:24:09 CST 2019
 */

package com.swing.GUI.reader;

import java.awt.*;
import java.util.List;
import javax.swing.*;

import com.swing.entity.Record;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

import static com.swing.GUI.login.LibraryLogin.the_user_name;
import static com.swing.json.AnalysisJson.queryReaderRecordJson;

/**
 * @author Brainrain
 */
public class ReaderRecord extends JFrame {
    public ReaderRecord() {
        initComponents();
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
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label1 ----
        label1.setText("用户：" + the_user_name + " 的借书记录");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(377, Short.MAX_VALUE)
                    .add(label1)
                    .add(369, 369, 369))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(0, 27, Short.MAX_VALUE)
                    .add(label1)
                    .addPreferredGap(LayoutStyle.UNRELATED)
                    .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
