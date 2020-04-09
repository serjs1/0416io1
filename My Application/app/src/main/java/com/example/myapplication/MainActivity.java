package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
         String[] strs = new String[] {
        "first", "second", "third", "fourth", "fifth"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 设置数据
        ArrayList dataArray = new ArrayList<>();
        for (int i = 0;i<10;i++){
            dataArray.add("苹果");
            dataArray.add("雪梨");
            dataArray.add("柿子");
            dataArray.add("香蕉");
        }

        // 从布局文件中获取listview
        ListView listView = findViewById(R.id.listview);

        // 设置适配器（第一个参数：上下文；第二个参数：listview的每一个item的布局文件，这里使用系统提供的；第三个参数：数据源）
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( MainActivity.this, android.R.layout.simple_list_item_1, dataArray);

        // 给listview设置适配器
        listView.setAdapter(adapter);
    }
}
