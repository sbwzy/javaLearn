import java.io.*;

class ReadAFile {
    public static void main (String[] args) {
        try {
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile); // FileReader是字符的连接到文本文件的串流
            BufferedReader reader = new BufferedReader(fileReader); // 将FileReader链接到BufferedReader以获取更高的效率

            String line = null;
            while ((line=reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}