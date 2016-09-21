package com.kodonho.android.materialdesign_viewanimation01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlpha;
    Button btnRotate;
    Button btnScale;
    Button btnTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlpha = (Button)findViewById(R.id.button);
        btnRotate = (Button)findViewById(R.id.btnRotate);
        btnScale = (Button)findViewById(R.id.btnScale);
        btnTrans = (Button)findViewById(R.id.btnTrans);

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 미리 정의된 애니메이션 xml을 로드한다
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                //2. 애니메이션을 뷰에 적용하고 실행한다
                btnAlpha.startAnimation(animation);
            }
        });
    }

    public void onClickRotate(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
        btnRotate.startAnimation(animation);
    }

    public void onClickScale(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
        btnScale.startAnimation(animation);
    }

    public void onClickTrans(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
        btnTrans.startAnimation(animation);
    }

}
