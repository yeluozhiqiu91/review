package com.wang.se.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;

import java.io.*;

/**
 * @Author: wangliujie
 * @Date: 2019/1/2 10:52
 * base64相关一些操作
 */
public class Base64Tools {
    private static final Logger logger=LoggerFactory.getLogger(Base64Tools.class);
    /**
     * base64转图片文件
     * @param base64
     * @param fileName
     * @return
     */
    public static File base64ToFile(String base64, String fileName) {
        File file = null;
        String filePath = "E:\\image";
        File dir = new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        java.io.FileOutputStream fos = null;
        try {
            byte[] bytes =new BASE64Decoder().decodeBuffer(base64);
            file = new File(filePath + "\\" + fileName);
            fos = new java.io.FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            logger.info("base64转图片异常：{}",e);
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    logger.info("关闭字符输出流异常：{}",e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    logger.info("关闭文件输出流异常：{}",e);
                }
            }
        }
        return file;
    }

    /**
     * base64转inputStream流，注意：使用完in后要关闭
     * @param base64
     * @return
     */
    public static InputStream base64ToInputStream(String base64) {
        ByteArrayInputStream in = null;
        try {
            byte[] bytes = new BASE64Decoder().decodeBuffer(base64);
            for (int i = 0; i < bytes.length; ++i)
            {
                // 调整异常数据
                if (bytes[i] < 0)
                {
                    bytes[i] += 256;
                }
            }
            in = new ByteArrayInputStream(bytes);
        } catch (Exception e) {
            logger.info("base64转inputStream流异常：{}",e);
        }
        return in;
    }
}
