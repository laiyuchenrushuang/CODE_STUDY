package �۲���ģʽ;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

    public void update(Observable o, Object arg) {

        System.out.println("�۲����Ϊ��" + o + ";���ݲ���Ϊ��" + arg);

    }
}
