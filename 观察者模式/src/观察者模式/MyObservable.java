package 观察者模式;

import java.util.Observable;

public class MyObservable extends Observable{

	public static void main(String[] args) {
		MyObservable myObservable = new MyObservable();
        myObservable.addObserver(new MyObserver());

        myObservable.setChanged();
        myObservable.notifyObservers("aaa");
	}

}
