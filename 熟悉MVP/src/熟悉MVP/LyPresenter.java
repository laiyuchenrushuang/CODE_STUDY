package ÊìÏ¤MVP;

public class LyPresenter implements BasePresenter{
private LyView mLyview;
private LyModle mLyModule;
	public LyPresenter(LyView view) {
		super();
		mLyview = view;
		mLyModule = new LyModle(this);
	}
	@Override
	public void B() {
		Utils.log("MVPÄ£Ê½");
		Utils.log("---------------");
		mLyview.c();
		mLyview.d();
	}
	@Override
	public void B1() {
		Utils.log("---------------");
		mLyModule.e();
		mLyModule.f();
	}

}
