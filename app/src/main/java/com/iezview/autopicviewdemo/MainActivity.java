package com.iezview.autopicviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    AutoPicView picView;
    TextView show_tishi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        picView = (AutoPicView) findViewById(R.id.autopicview);
        show_tishi = (TextView) findViewById(R.id.show_tishi);
        show_tishi.setText("请调整");
        picView.start(new AutoPicView.TakePicListener() {
            @Override
            public void canTakePic() {
                Toast.makeText(MainActivity.this, "  咔嚓！", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void yourPhonePerfect() {
                show_tishi.setVisibility(View.GONE);
            }

            @Override
            public void placeAdjustYourPhone() {
                show_tishi.setVisibility(View.VISIBLE);
            }
        });
    }
}
