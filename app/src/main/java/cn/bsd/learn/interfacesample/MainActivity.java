package cn.bsd.learn.interfacesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FunctionManager.getInstance().addFunction(new FunctionNoParamNoResult("noparamnoresult") {
            @Override
            public void function() {
                Log.e("MainActivity","Hello from second activity");
            }
        });

//        FunctionManager.getInstance().addFunction(new FunctionNoParamHasResult<User>("noparamhasresult") {
//            @Override
//            public User function() {
//                User user = new User("上海东普","111");
//                return user;
//            }
//        });

        FunctionManager.getInstance().addFunction(new FunctionHasParamHasResult<User,User>("hasparamhasresult") {
            @Override
            public User function(User o) {
                Log.e("MainActivity","打印传过来的User对象"+o.getUsername()+o.getPwd());
                User user = new User("上海","111");
                return user;
            }
        });

        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        startActivity(intent);
    }

//    public interface Listener{
//        public void aa();
//    方法名
//    方法体
//        返回值
//    参数

//    }
}
