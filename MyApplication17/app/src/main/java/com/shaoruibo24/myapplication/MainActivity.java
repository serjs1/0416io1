package com.shaoruibo24.myapplication;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText count;
    private EditText password;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = this.getWindow().getDecorView();
        ColorMatrix cm = new ColorMatrix();
        cm.setSaturation(0);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(cm));
        decorView.setLayerType(View.LAYER_TYPE_SOFTWARE,paint);
        button=findViewById(R.id.submit);
         count=findViewById(R.id.count);
         password=findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account_str=count.getText().toString();
                String password_str=password.getText().toString();
                if(account_str.equals("admin")&&password_str.equals("123456")){
                    Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("1",account_str);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"账号密码错误",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
