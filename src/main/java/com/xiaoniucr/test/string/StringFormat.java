package com.xiaoniucr.test.string;

import java.io.*;

/**
 * @author yanghl
 * @date 2019/9/21 16:04
 */
public class StringFormat {

    public static void main(String[] args) {

        //��䵽�̶���λ


        // ��������·������ȡ�����ļ����ݣ���ʾ��ҳ����
        String thingPath = "D:\\11.txt";//��ȡ����·��

        // ��ȡ�ļ����ݣ�д��String��
        int len = 0;
        StringBuffer str = new StringBuffer("");
        File file = new File(thingPath);
        try {
            FileInputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is,"GBK");
            BufferedReader in = new BufferedReader(isr);
            String line = null;
            while ((line = in.readLine()) != null)
            {
                if (len != 0) // �����з�������
                {
                    str.append(line);
                }
                else
                {
                    str.append(line);
                }
                len++;
            }
            in.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String content=str.toString();//����
        System.out.println("content:"+content);
    }
}
