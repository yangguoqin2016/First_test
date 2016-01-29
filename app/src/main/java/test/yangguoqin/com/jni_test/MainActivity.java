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
        initData();
    }

    private void initData() {
        System.out.print("这是在测试中");
    }

    public void init() {
        initView();
        TestClass ts = new TestClass();
        ts.initNumber = 100;
    }


    public void initView() {
        TextView tv_test = (TextView) findViewById(R.id.tv_test);
        tv_test.setText(JNIUtils.getStringFromC());
    }

}