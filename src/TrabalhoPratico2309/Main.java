package TrabalhoPratico2309;

public class Main {
	public static void main(String[] args) {
		int n = 9;
				
		int[] vetor = new int[n];
		for(int i = 0; i < n; i++) {
			vetor[i] = i+1;
		}
				
		Arvbin<Integer> arvore = new Arvbin<Integer>(vetor[n/2]);
		arvore = arvore.createBST(vetor, 0, n-1);
				
		arvore.mostra();
	}
}
