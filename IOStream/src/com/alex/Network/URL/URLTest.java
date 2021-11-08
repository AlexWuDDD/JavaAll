package com.alex.Network.URL;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
    
    public static void main(String[] args){
        try {
            URL url = new URL("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg10.360buyimg.com%2Fn0%2Fjfs%2Ft475%2F205%2F872540024%2F139773%2Fc3d8a304%2F54924e2eNfcc12a5f.jpg&refer=http%3A%2F%2Fimg10.360buyimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639000152&t=06bcea9061675bf5263cb39f6d8b6d29");

            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getQuery());
            System.out.println(url.getFile());

            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.connect();
            InputStream is = urlConnection.getInputStream();
            FileOutputStream fos = new FileOutputStream("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Network/URL/pic.jpeg");

            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }
            fos.close();
            is.close();
            urlConnection.disconnect();

            System.out.println("下载完成");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
