package com.example.shaoruibo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public String str="你妈死了";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过 getFragmentMannager得到碎片 让起于LEFTFRAGMENT联系起来
        //(lEFTFragment)将指针指向子集的基类
        LeftFragment lf_1=(LeftFragment)getSupportFragmentManager().findFragmentById(R.id.f1);
        //在main 里打印fragment里面的 函数

//        Toast.makeText(this,lf_1.str,Toast.LENGTH_SHORT).show();
        //在活动中执行碎片中的 a方法
        TextView textView=findViewById(R.id.textView);
        textView.setText(lf_1.str);
        //打印 碎片中的 list
        //先在main建立 list接收器
        List<String>list=new ArrayList<>();
        //再调用lf_1中的list
        list=lf_1.list;
        for(String s:list){
//            System.out.println(s);
            //用查询log 导包查询
            Log.d("MainActivity",s);
        }
        lf_1.a();
    }
    public void bbb(){
        //                   过滤        da
            Log.d("LeftFragment","18鸡移动应用开发");
    }
}
