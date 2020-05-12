package com.yufuchang.developer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import com.yufuchang.developer.keyboard.EmmSecurityKeyboard;

public class MainActivity extends AppCompatActivity {

    private EmmSecurityKeyboard securityKeyboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        securityKeyboard = new EmmSecurityKeyboard(this);
        final EditText editText = findViewById(R.id.et_keyboard);
        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                securityKeyboard.showSecurityKeyBoard(editText);
                return false;
            }
        });
    }
}
