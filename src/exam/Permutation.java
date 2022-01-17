package exam;



public class Permutation {
	
	
	// �����ϰ��� �ϴ� ��� ����.
	static int[] target = new int[] { 1, 2, 3 };
	
	// ��� ���ڸ� �����ߴ����� �˷��ִ� ����.
	static boolean[] visited = new boolean[3];

	
	public static void main(String[] args) {
		permutation(0, "");
	}

	
	// ���� �޼���(cnt�� ���� Ƚ��, result�� ���)
	
	private static void permutation(int cnt, String result) {
		
		// 2���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
		if (cnt == 2) {
			System.out.println(result);
			return;
		}
		
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i = 0; i < 3; i++) {
			
			// �̹� �ش� ���ڸ� ������ ��쿡�� ��ŵ.
			if (visited[i]) {
				continue;
			}
			
			// �������� �������, �����ߴٴ� ǥ�ø� ���ش�.
			visited[i] = true;
			
			// �ڽ��� ��� ȣ���Ѵ�.
			permutation(cnt + 1, result + target[i]);
			
			// ������ �����Ѵ�.
			visited[i] = false;
		}
		
	}
	
	
	
	
}