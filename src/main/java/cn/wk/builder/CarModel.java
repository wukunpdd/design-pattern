package cn.wk.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wukun on 2019/10/16.
 */
public abstract class CarModel {
    //执行顺序
    private List<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        for(String type:sequence){
            if(type.equals("start")){
                start();
            }else if(type.equals("stop")){
                stop();
            }else if(type.equals("alarm")){
                alarm();
            }else if(type.equals("engineBoom")){
                engineBoom();
            }
        }
    }

    final public void setSequence(List<String> sequence){
        this.sequence = sequence;
    }
}
