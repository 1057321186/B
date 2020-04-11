package com.project.������;

import java.util.ArrayList;
import java.util.List;

public class Node {
	/*
	 * �������ɸ��ֽڵ���� �������ص㣺 ÿ���ڵ㶼���������ӽڵ㣬 ���ӽڵ� ÿһ���ڵ㶼��һ��ֵ
	 */

	// ���ӽڵ�
	public Node leftNode;
	// ���ӽڵ�
	public Node rightNode;
	// ֵ
	public Object value;

	public static void main(String[] args) {
		//Ҫ�����ֵ
		int arr[] = { 10, 5, 18, 30, 21, 36, 0, 48 };
		Node node = new Node();
		// ��������ֵ
		for (int a : arr) {
			node.add(a);
		}
		System.out.println(node.bianLi());
	}

	// ��������(��������߼��ǣ�С����ͬ�ķ���ߣ���ķ��ұ�)
	// ��������(�������ݵĹ������Ѿ��ź���)
	public void add(Object v) {
		// �����ǰ�ڵ�û��ֵ����Ͱ����ݷŵ���ǰ�ڵ�
		if (null == value) {
			value = v;
		}
		// �����ǰ�ڵ���ֵ�������жϣ�������ֵ�뵱ǰֵ�Ĵ�С
		else {
			if ((Integer) v - ((Integer) value) <= 0) {
				// ������ӽڵ�Ϊ��,�Ͱ�ֵ�ŵ���ǰ���ӽڵ�
				if (null == leftNode) {
					leftNode = new Node();
				}
				// �ݹ�
				leftNode.add(v);

			}
			// ������ֵ���ȵ�ǰֵС
			else {
				if (null == rightNode) {
					rightNode = new Node();
				}
				// �ݹ�
				rightNode.add(v);

			}
		}

	}

	// ����������
	/*
	 * �������������� ����С�����ѡ���������
	 */
	public List<Object> bianLi() {
		//����һ��list����
		List<Object> valuesList = new ArrayList<>();
		// ��ڵ�������
		if (null != leftNode) {
			// �ݹ��ȡ���е���ڵ�ֵ
			valuesList.addAll(leftNode.bianLi());
		}
		// ��ǰ���ڵ�
		valuesList.add(value);

		// �ҽڵ�������
		if (null != rightNode) {
			// �ݹ��ȡ���е��ҽڵ�ֵ
			valuesList.addAll(rightNode.bianLi());
		}
		return valuesList;
	}
}
