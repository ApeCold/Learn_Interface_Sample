package cn.bsd.learn.interfacesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.sa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FunctionManager.getInstance().invokeFunction("noparamnoresult");
//                User user = FunctionManager.getInstance().invokeFunction("noparamhasresult",User.class);
                User user = FunctionManager.getInstance().invokeFunction("hasparamhasresult",new User("中国","666"),User.class);
                Log.e("SecondActivity","user object from MainActivity"+user.getUsername()+user.getPwd());

            }
        });

    }
}
