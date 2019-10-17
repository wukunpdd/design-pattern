package cn.wk.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wukun on 2019/10/17.
 */
public class ProtoTypeManager {
    private Map<String, Shape> map = new HashMap<String, Shape>();

    public ProtoTypeManager(){
        map.put("Circle", new Circle());
        map.put("Square", new Square());
    }

    public void addShape(String key, Shape shape){
        map.put(key, shape);
    }

    public Shape getShape(String key){
        Shape temp = map.get(key);
        return (Shape)temp.clone();
    }
}
