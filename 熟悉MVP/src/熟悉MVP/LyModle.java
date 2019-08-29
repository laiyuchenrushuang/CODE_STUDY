package  Ïœ§MVP;

public class LyModle extends BaseModule{
private LyPresenter mLyPresenter;
	public LyModle(LyPresenter lyPresenter) {
		this.mLyPresenter = lyPresenter;
	}

	@Override
	public void e() {
		Utils.log("LyModle_e");
	}

	@Override
	public void f() {
		Utils.log("LyModle_f");
	}

}
