package util;

import java.io.*;

public class ReadConfigTxt {

    public String  getTxtContent(String path){
        String result="";

        File file=new File(path);
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            result=bufferedReader.readLine();
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        return result;
    }

}
