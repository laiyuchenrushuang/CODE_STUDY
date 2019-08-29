package  Ïœ§MVP;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LyTest implements LyView {
	LyPresenter lp = new LyPresenter(this);
    public void OnCreate() {
    	lp.B();
}
	
    public void OnResume() {
    	lp.B1();
}


	
	
	@Override
	public void A() {
		Utils.log("LyTest_A");
	}

	@Override
	public void c() {
		Utils.log("LyTest_c");
	}

	@Override
	public void d() {
		Utils.log("LyTest_d");
	}
}
