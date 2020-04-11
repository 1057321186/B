package JavaEE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class 编程题 {
	private static final Object Integer = null;
	private static final boolean String = false;

	public static void main(String[] args) {

		int[] arry = { 20, 3, 5, 1, 33, 30, 11 };
		arr(arry);
		search(arry, 20);
		count(1, 4);
		Hash();
	}

	// 1.使用冒泡排序升序一个数组，
	static void arr(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					A[j] = A[j] + A[j + 1];
					A[j + 1] = A[j] - A[j + 1];
					A[j] = A[j] - A[j + 1];

				}
			}
		}
		for (int i : A) {
			System.out.print(i + "\t");
		}
	}

	// 折半查找11的下标
	static void search(int[] a, int findNum) {
		int start = 0;// 左边界
		int mid = a.length / 2;// 中间下标
		int max = a.length - 1;// 右边界
		int find = findNum;// 被查找数
		while (start <= max) {
			if (find > a[mid]) {
				// 被查数大于中间值,则起始下标为中间值+1
				start = mid + 1;
			} else if (find < a[mid]) {
				// 被查数小于中间值,则起始下标为中间值-1
				max = mid - 1;
			} else {
				System.out.println("\n找到了" + findNum + ",下标是：" + mid);
				break;
			}
			mid = (start + max) / 2;

		}

	}

	// 3使用java编程输出1-10的阶乘的和
	static void count(int min, int max) {
		int sum = 0;
		while (min <= max) {
			sum += jieCheng(min);
			min++;
		}
		System.out.println(sum);

	}

	// 单个数的阶乘
	static int jieCheng(int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			sum = sum * i;
		}
		return sum;
	}

	// 4.HashMap 的键是 Integer,值是 String，存储三对元素，并按 integer 的大小遍历输出
	// 键值对。(根据键找值的方式遍历)

	static void Hash() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(4, "b");
		map.put(3, "c");

		for (Object object : map.keySet()) {
			System.out.print(map.get(object));
		}
		// Entry
		for (Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.print(entry.getValue());
		}
		for(Iterator<Entry<Integer, String>> iterator=map.entrySet().iterator();iterator.hasNext();) {
			System.out.print(iterator.next().getValue());
		}
	
	}
}
