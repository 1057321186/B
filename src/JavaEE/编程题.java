package JavaEE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ����� {
	private static final Object Integer = null;
	private static final boolean String = false;

	public static void main(String[] args) {

		int[] arry = { 20, 3, 5, 1, 33, 30, 11 };
		arr(arry);
		search(arry, 20);
		count(1, 4);
		Hash();
	}

	// 1.ʹ��ð����������һ�����飬
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

	// �۰����11���±�
	static void search(int[] a, int findNum) {
		int start = 0;// ��߽�
		int mid = a.length / 2;// �м��±�
		int max = a.length - 1;// �ұ߽�
		int find = findNum;// ��������
		while (start <= max) {
			if (find > a[mid]) {
				// �����������м�ֵ,����ʼ�±�Ϊ�м�ֵ+1
				start = mid + 1;
			} else if (find < a[mid]) {
				// ������С���м�ֵ,����ʼ�±�Ϊ�м�ֵ-1
				max = mid - 1;
			} else {
				System.out.println("\n�ҵ���" + findNum + ",�±��ǣ�" + mid);
				break;
			}
			mid = (start + max) / 2;

		}

	}

	// 3ʹ��java������1-10�Ľ׳˵ĺ�
	static void count(int min, int max) {
		int sum = 0;
		while (min <= max) {
			sum += jieCheng(min);
			min++;
		}
		System.out.println(sum);

	}

	// �������Ľ׳�
	static int jieCheng(int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			sum = sum * i;
		}
		return sum;
	}

	// 4.HashMap �ļ��� Integer,ֵ�� String���洢����Ԫ�أ����� integer �Ĵ�С�������
	// ��ֵ�ԡ�(���ݼ���ֵ�ķ�ʽ����)

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
