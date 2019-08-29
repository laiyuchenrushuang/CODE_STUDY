import java.util.Comparator;

public class SizeComparator implements Comparator<Size>{

	@Override
	public int compare(Size o1, Size o2) {
//		if (o1.width == o2.width) {
//			return 0;
//		}else if (o1.width > o2.width) {
//			return 1;
//		}else {
//			return -1;
//		}
		return o1.width-o2.width;
	}

}
