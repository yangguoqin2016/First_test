package test.yangguoqin.com.jni_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        initView();

    }


    public void initView() {
        TextView tv_test = (TextView) findViewById(R.id.tv_test);
        tv_test.setText(JNIUtils.getStringFromC());
    }

}