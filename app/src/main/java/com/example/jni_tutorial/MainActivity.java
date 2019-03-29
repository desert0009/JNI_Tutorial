package com.example.jni_tutorial;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mylibrary.JniUtils;
import com.example.mylibrary.LibraryClass;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        StringBuffer sb = new StringBuffer();
        sb.append(JniUtils.stringFromJNI("HI")).append(JniUtils.stringFromJNI2());
        tv.setText(sb);

        LibraryClass libClass = new LibraryClass();
        Toast.makeText(mContext, libClass.printLog("From app"), Toast.LENGTH_SHORT).show();
    }

}
