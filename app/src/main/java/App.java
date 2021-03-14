import java.util.Arrays;
public class App {
	public static void calculate(int[] arr, int idx1, int idx2, int idx3) {
		int[] pt1 = Arrays.copyOfRange(arr,0,idx1);
		int[] pt2 = Arrays.copyOfRange(arr,idx1,idx2);
		int[] pt3 = Arrays.copyOfRange(arr,idx2,idx3);
		int[] pt4 = Arrays.copyOfRange(arr,idx3,arr.length);
		double avg1 = Arrays.stream(pt1).average().orElse(-1);
		double avg2 = Arrays.stream(pt2).average().orElse(-1);
		double avg3 = Arrays.stream(pt3).average().orElse(-1);
		double avg4 = Arrays.stream(pt4).average().orElse(-1);
		System.out.printf("Slice 1 [%d:%d] has an average of %f ", 0, idx1, avg1);
		System.out.printf("Slice 2 [%d:%d] has an average of %f ", idx1, idx2, avg2);
		System.out.printf("Slice 3 [%d:%d] has an average of %f ", idx2, idx3, avg3);
		System.out.printf("Slice 4 [%d:%d] has an average of %f ", idx3, arr.length, avg4);
	}
	public static void main(String[] args) {
		calculate(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12}, 4, 8, 10);
	}
}
