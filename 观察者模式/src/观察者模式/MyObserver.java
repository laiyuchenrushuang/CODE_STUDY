package 观察者模式;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

    public void update(Observable o, Object arg) {

        System.out.println("观察对象为：" + o + ";传递参数为：" + arg);

    }
}
