package T5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException2 {

    /**
     * throws 语句抛出一个异常给调用该函数的人处理
     * */
    public void readFile(String filename) throws FileNotFoundException {

        //打开文件
        FileInputStream fis = new FileInputStream(filename);
    }
    public void readTxtFile(){
        String name="/Users/qihang/text";
        try{
            readFile(name);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件名不存在！");
        }
    }
    public void readFile2(String filename)  {

        //打开文件
        try {
            FileInputStream fis = new FileInputStream(filename);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void readTxtFile2(){
        String name="/Users/qihang/text2";

            readFile2(name);
        }
    }

