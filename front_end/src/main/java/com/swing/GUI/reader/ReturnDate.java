package com.swing.GUI.reader;

import com.eltima.components.ui.DatePicker;
import com.swing.entity.PostRecord;
import com.swing.tool.datetool.DateResult;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.swing.GUI.login.LibraryLogin.the_user_name;
import static com.swing.GUI.reader.BorrowBooks.the_isbn;
import static com.swing.json.AnalysisJson.readerIdJson;
import static com.swing.json.AnalysisJson.recordJson;
import static com.swing.tool.datetool.DateResult.getDatePicker;

public class ReturnDate {

    public void returnDate(){

        //获取当前系统时间
        final DateResult dateResult = new DateResult();

        final PostRecord postRecord = new PostRecord();

        final JFrame f = new JFrame("还书日期");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        final DatePicker datepick;
        datepick = getDatePicker();
        f.add(datepick);

        JButton b = new JButton("选择你的还书日期");
        b.setBounds(100, 183, 200, 30);
        f.add(b);

        b.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "您的还书日期为：" + datepick.getValue());
                System.out.println(datepick.getValue());//这是一个java.util.Date对象

                postRecord.setIsbn(the_isbn);
                postRecord.setReader_id(readerIdJson(the_user_name));
                postRecord.setBorrowing_date(dateResult.getCurrentTime());
                postRecord.setReturn_date(datepick.getValue().toString());

                //借书成功弹窗
                if(recordJson(postRecord)){

                    BorrowSuccess borrowSuccess = new BorrowSuccess();
                    borrowSuccess.setVisible(true);
                    borrowSuccess.setResizable(false);

                }
            }

        });

        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);


    }

}
