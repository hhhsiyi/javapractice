package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.io.*;
import java.util.HashMap;

public class test01对文本内容进行排序 {
    public static void main(String[] args) throws IOException {
        HashMap<String ,String >hashMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("chushibiao.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("paixuchushibiao.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String[]arr = line.split("\\.");
            hashMap.put(arr[0],arr[1]);
        }

        for(String key:hashMap.keySet()){
            String value = hashMap.get(key);
            line = key+"."+value+"\n";
            bw.write(line);
        }
        bw.close();
        br.close();
    }
}
