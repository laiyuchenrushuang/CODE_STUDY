import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Text {

	public static void main(String[] args) {
		Size s1 = new Size(320, 240);
		Size s2 = new Size(176, 144);
		Size s3 = new Size(1440, 1080);
		Size s4 = new Size(2560, 1440);
		Size s5 = new Size(480, 320);
		Size s6 = new Size(960, 540);
		Size s7 = new Size(960, 540);

		List<Size> ls = new ArrayList();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		ls.add(s6);
		ls.add(s7);

//		ls.sort(new Comparator<Size>() {
//
//			@Override
//			public int compare(Size o1, Size o2) {
//				return o1.width - o2.width;
//			}
//		});
		
		Comparator SizeComparator =new SizeComparator();
		Collections.sort(ls,SizeComparator);
		int wi = 1000;int hei = 1000;
		int preW = 0,preH = 0;
		int diffW,diffH;
		for (Size s : ls) {
			System.out.println(s.width + ":" + s.height);
			diffW = s.width-wi;
			diffH = s.height-hei;
			if (diffW >=0 && diffH >=0) {
				preW = s.width;
				preH = s.height;
				break;
			}
		}
		
		System.out.println("preW = "+preW + " preH ="+preH);

	}

}
