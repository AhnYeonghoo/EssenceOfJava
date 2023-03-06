package ch18;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {

        String originFilePath1 =
                BufferExample.class.getResource("originFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";

        FileInputStream fis = new FileInputStream(originFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originFilePath2 =
                BufferExample.class.getResource("originFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + "ms");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + "ms");
        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end-start);
    }
}
