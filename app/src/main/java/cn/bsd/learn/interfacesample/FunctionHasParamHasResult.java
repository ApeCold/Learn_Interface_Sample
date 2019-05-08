package cn.bsd.learn.interfacesample;

/**
 * Created by bishiduo on 2019/4/21.
 */

public abstract class FunctionHasParamHasResult<T,P> extends Function {
    public FunctionHasParamHasResult(String functionName) {
        super(functionName);
    }
    public abstract T function(P p);
}
