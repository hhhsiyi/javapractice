package Java高级.day10网络编程.TCP.文件上传的优化.文件上传;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while (true){
            Socket socket = server.accept();
            //启用多线程技术
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("d:\\upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        //自定义文件名的规则
                        String fileName = "hewen"+System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";
//        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
                        int len = 0;
                        byte[]bytes = new byte[1024];
                        //让服务器一直处于监听状态

                        while ((len=is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        socket.getOutputStream().write(("上传成功".getBytes()));
                        fos.close();
                        is.close();
                        socket.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }).start();
//            InputStream is = socket.getInputStream();
//            File file = new File("d:\\upload");
//            if(!file.exists()){
//                file.mkdirs();
//            }
//            //自定义文件名的规则
//            String fileName = "hewen"+System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";
////        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
//            FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
//            int len = 0;
//            byte[]bytes = new byte[1024];
//            //让服务器一直处于监听状态
//
//            while ((len=is.read(bytes))!=-1){
//                fos.write(bytes,0,len);
//            }
//            socket.getOutputStream().write(("上传成功".getBytes()));
//            fos.close();
//            is.close();
//            socket.close();
//        }
//服务器也不用关闭了
        //server.close();
    }
}}
