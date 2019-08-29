
public abstract class BaseActivity extends Activity {
	@Override
	public void OnCreate() {
		log();
	}

	private void log() {
		System.out.println("BaseActivity OnCreate");
		
	}
}
