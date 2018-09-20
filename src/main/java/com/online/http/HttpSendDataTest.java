package com.online.http;

import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpSendDataTest {
    public static void main (String[]args){
        String count ="zqr";
        String pwd ="123";
        JSONObject jsondata=new JSONObject();


       Map<String,String> data =new HashMap<String,String>();
       data.put("username",count);
       data.put("passwd",pwd);
//        try {
//            jsondata.put("username",count);
//            jsondata.put("passwd",pwd);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        String URL="http://localhost:8081/ServletTest";
        String returndata=HttpClientUtil.doPost(URL, data);
        System.out.println("发送成功!");
        System.out.println("获取返回值");

        System.out.println("result:"+returndata);
//            System.out.println("result"+jsondata.getBoolean("flag"));
//            if(jsondata.getBoolean("flag")){
//                System.out.println("登录成功！");
//            }else{
//                System.out.println("登录失败！");
//            }
        //https://blog.csdn.net/ling1234ling1234/article/details/80678329
    }

}
