package co.junga.exam1001;

/**
 * Hello world!
 *
 */

// 자바 스택 영역과 힙 영역 알기

public class App {
	private static int[] a = { 7, 9, 3, 6, 1, 4, 2, 5, 8, 10 };

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		selectionSort(); // 오름차순 Asc sort
//		toPrint();
//		System.out.println("=====================");
//		newSelectionSort();
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//
//		}
		RankAgorithm rankAgorithm = new RankAgorithm(); //메인에 인스턴스 하나 만들어서 그게 동작 되도록
		rankAgorithm.toString();
	}

	private static String toPrint() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return null;
	}

	private static void selectionSort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { // Desc sort (부호에 따라서)
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	private static void newSelectionSort() {
		int min; // 인덱스의 위치 값을 기억할 변수
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) // 부호 따라
					min = j;
			}

			if (i != min) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
}
