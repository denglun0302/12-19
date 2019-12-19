
mport java.util.Arrays;

public class Stack {
	private int[] array;
	private int top;
	
	public Stack(int defaultCapacity) {
		array = new int[defaultCapacity];
		top = 0;
	}
	
	public Stack() {
		this(20);
	}
	
	public void push(int val) {
		if (top == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[top++] = val;
	}
	
	public void pop() {
		if (top <= 0) {
			System.out.println("ջΪ�գ��޷�ɾ��");
			return;
		}
		
		top--;
		array[top] = 0;	// �ɼӿɲ��ӣ������пյ�λ�ñ���Ϊ 0
	}
	
	public int top() {
		if (top <= 0) {
			System.out.println("ջΪ�գ��޷�����ջ��Ԫ��");
			return -1;
		}
		
		return array[top - 1];
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
}