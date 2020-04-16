    package com.shaoruibo.io0416;

    import android.content.Context;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;

    public class MainActivity extends AppCompatActivity {
        private EditText editText;
        private TextView textView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            editText=findViewById(R.id.text);
            Button button1=findViewById(R.id.bt1);
            Button button2=findViewById(R.id.bt2);
           textView=findViewById(R.id.text2);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=editText.getText().toString();
                    save(str);
                }
            }
            );button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String dedaoString=load();
                    textView.setText(dedaoString);
                }
            });
        }

        private String load() {
            FileInputStream in = null;
            BufferedReader reader =null ;
            StringBuilder content = new StringBuilder() ;
            try {
                in = openFileInput("shao") ;
                reader = new BufferedReader (new InputStreamReader(in));
                String line = "";
                while ((line = reader.readLine())!= null) {
                    content. append(line);
                } }catch (IOException e){
                e.printStackTrace() ;
            } finally{
                if (reader != null) {
                    try {
                        reader .close() ;
                    } catch (IOException e) {
                        e.printStackTrace() ;
                    }
                }
                return content.toString() ;

            }
        }

        private void save(String str) {
            FileOutputStream out=null;
            BufferedWriter huancun=null;
            try {
                out=openFileOutput("shao", MainActivity.MODE_PRIVATE);
                huancun=new BufferedWriter(new OutputStreamWriter(out));
                huancun.write(str);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                    try {
                        if(huancun !=null ){
                        huancun.close();}
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

