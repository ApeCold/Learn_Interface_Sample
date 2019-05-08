package cn.bsd.learn.interfacesample;

/**
 * Created by bishiduo on 2019/4/21.
 */

public abstract class FunctionHasParamNoResult<P> extends Function {
    public FunctionHasParamNoResult(String functionName) {
        super(functionName);
    }
    public abstract void function(P p);
}
