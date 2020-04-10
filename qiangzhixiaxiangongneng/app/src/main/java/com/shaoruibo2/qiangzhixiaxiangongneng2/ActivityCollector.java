package com.shaoruibo2.qiangzhixiaxiangongneng2;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*diliubi1工具类*/
public class ActivityCollector {
public static List<Activity> activities=new ArrayList<Activity>();
//添加
    public static void addActivity(Activity a){
        activities.add(a);
    }
    //删除
    public static void removeActivity(Activity a){
        activities.remove(a);
    }
    //全部关闭
    public static void finishAll(){
       for(Activity a:activities){
           if(!a.isFinishing()){
            a.finish();
           }
       }
    }

}
