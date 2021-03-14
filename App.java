
public class App {
	public static void calculate(int[] arr, int idx1, int idx2, int idx3) {
		int[] pt1 = arr.slice(0,idx1);
		int[] pt2 = arr.slice(idx1,idx2);
		int[] pt3 = arr.slice(idx2,idx3);
		int[] pt4 = arr.slice(idx3);
		int avg1 = Arrays.stream(pt1).average();
		int avg2 = Arrays.stream(pt2).average();
		int avg3 = Arrays.stream(pt3).average();
		int avg4 = Arrays.stream(pt4).average();
		System.out.printf("Slice 1 [%d:%d] has an average of %d ", 0, idx1, avg1);
		System.out.printf("Slice 2 [%d:%d] has an average of %d ", idx1, idx2, avg2);
		System.out.printf("Slice 3 [%d:%d] has an average of %d ", idx2, idx3, avg3);
		System.out.printf("Slice 4 [%d:%d] has an average of %d ", idx3, arr.length, avg4);
	}
}
