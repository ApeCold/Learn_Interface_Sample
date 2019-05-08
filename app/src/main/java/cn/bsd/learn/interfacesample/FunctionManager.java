package cn.bsd.learn.interfacesample;

import android.text.TextUtils;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bishiduo on 2019/4/21.
 */

public class FunctionManager {
    private static FunctionManager instance;
    private Map<String,FunctionNoParamNoResult> mNoParamNoResultMap;
    private Map<String,FunctionNoParamHasResult> mNoParamHasResultMap;
    private Map<String,FunctionHasParamNoResult> mHasParamNoResultMap;
    private Map<String,FunctionHasParamHasResult> mHasParamHasResultMap;
    private FunctionManager(){
        mNoParamNoResultMap = new HashMap<>();
        mNoParamHasResultMap = new HashMap<>();
        mHasParamNoResultMap = new HashMap<>();
        mHasParamHasResultMap = new HashMap<>();

    }
    public static FunctionManager getInstance(){
        if(instance ==null)
            instance= new FunctionManager();
        return instance;
    }

    //将需要储存的方法进行添加
    //添加没有吧返回值 也没有参数的方法
    public void addFunction(FunctionNoParamNoResult function){
        mNoParamNoResultMap.put(function.functionName,function);
    }

    //执行没有返回值也没有参数的方法
    public void invokeFunction(String functionName){
        if(TextUtils.isEmpty(functionName)){
            return;
        }
        if(mNoParamNoResultMap != null){
            FunctionNoParamNoResult f = mNoParamNoResultMap.get(functionName);
            if(f!=null){
                f.function();
            }else{
                Log.e("FunctionManager","没有找到该方法");
            }
        }
    }

    //替搬家没有返回值，有参数的方法
    public void addFunction(FunctionNoParamHasResult function){
        mNoParamHasResultMap.put(function.functionName,function);
    }

    //执行没有返回值，有参数的方法
    public <T> T invokeFunction(String functionName, Class<T> t){
        if(TextUtils.isEmpty(functionName)){
            return null;
        }
        if(mNoParamHasResultMap != null){
            FunctionNoParamHasResult f = mNoParamHasResultMap.get(functionName);
            if(f!=null){
                if(t!=null){
                    return t.cast(f.function());
                }
            }else{
                Log.e("FunctionManager","没有找到该方法");
            }
        }
        return null;
    }

    //添加有返回值 有参数的方法
    public void addFunction(FunctionHasParamHasResult function){
        mHasParamHasResultMap.put(function.functionName,function);
    }

    //执行有返回值有参数的方法
    public <T,P> T invokeFunction(String functionName, P p, Class<T> t){
        if(TextUtils.isEmpty(functionName)){
            return null;
        }
        if(mHasParamHasResultMap!=null){
            FunctionHasParamHasResult f = mHasParamHasResultMap.get(functionName);
            if(f!=null){
                if(t!=null){
                    return t.cast(f.function(p));
                }
            }
        }
        return null;
    }
}
