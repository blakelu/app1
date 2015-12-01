package com.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import org.apache.struts2.ServletActionContext;

public class FileUploadUtil {
	
	private static final long serialVersionUID = 572146812454l ;
    private static final int BUFFER_SIZE = 16 * 1024 ;

    private static void copy(File src, File dst) {
        try {
        	System.out.println(">>>>>>>>>>>图片开始上传");
           InputStream in = null ;
           OutputStream out = null ;
            try {                
               in = new BufferedInputStream( new FileInputStream(src), BUFFER_SIZE);
               out= new BufferedOutputStream(new FileOutputStream(dst), BUFFER_SIZE);
                byte [] buffer = new byte [BUFFER_SIZE];
                while (in.read(buffer) > 0 ) {
                   out.write(buffer);
               } 
           } finally {
                if ( null != in) {
                   in.close();
               } 
                if ( null != out) {
                   out.close();
               } 
           } 
           System.out.println("<<<<<<<<<<<图片上传成功");
       } catch (Exception e) {
           e.printStackTrace();
       } 
   } 
   
    public static String getExtention(String fileName) {
        int pos = fileName.lastIndexOf(".");
        return fileName.substring(pos);
   }  
   
   public static String findImageFileName(String fileName){
	   return new Date().getTime() + getExtention(fileName);
   }
   
   public static  void imageupload(File myFile,String fileName){ 	   
       File imageFile =
 					new File(ServletActionContext.getServletContext().getRealPath
( "/uploadImages/" + fileName));
       System.out.println(imageFile);
       copy(myFile, imageFile);	         
   }
}
