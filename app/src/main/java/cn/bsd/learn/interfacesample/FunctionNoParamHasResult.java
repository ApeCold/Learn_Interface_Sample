package cn.bsd.learn.interfacesample;

/**
 * Created by bishiduo on 2019/4/21.
 */

public abstract class FunctionNoParamHasResult<T> extends Function {
    public FunctionNoParamHasResult(String functionName) {
        super(functionName);
    }
    public abstract T function();
}
