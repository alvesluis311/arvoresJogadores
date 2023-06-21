package tree;

public class Node {
	private Jogador jogador;
	private Node leftNode;
	private Node rightNode;

	public Node(Jogador jogador) {
		this.jogador = jogador;
		this.leftNode = null;
		this.rightNode = null;
	}

	public Node() {
		this.leftNode = null;
		this.rightNode = null;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
}
