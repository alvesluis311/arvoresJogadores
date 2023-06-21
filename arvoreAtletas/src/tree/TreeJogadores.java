package tree;

public class TreeJogadores {
	private Node rootNode = null;

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public boolean isEmpty() {
		return rootNode == null;
	}

	public void add(Jogador jogador) {
	    if (isEmpty()) {
	        rootNode = new Node(jogador);
	    } else {
	        addNode(jogador, rootNode);
	    }
	}
	

	private void addNode(Jogador jogador, Node subRoot) {
	    if (jogador.getPosition().ordinal() < subRoot.getJogador().getPosition().ordinal()) {
	        if (subRoot.getLeftNode() == null) {
	            subRoot.setLeftNode(new Node(jogador));
	        } else {
	            addNode(jogador, subRoot.getLeftNode());
	        }
	    } else if (jogador.getPosition().ordinal() > subRoot.getJogador().getPosition().ordinal()) {
	        if (subRoot.getRightNode() == null) {
	            subRoot.setRightNode(new Node(jogador));
	        } else {
	            addNode(jogador, subRoot.getRightNode());
	        }
	    }
	}

	public Jogador find(Position position) {
		if (isEmpty()) {
			return null;
		} else {
			return findJogador(position, rootNode);
		}
	}

	private Jogador findJogador(Position position, Node subRoot) {
		if (subRoot == null) {
			return null;
		} else if (position.ordinal() == subRoot.getJogador().getPosition().ordinal()) {
			return subRoot.getJogador();
		} else if (position.ordinal() < subRoot.getJogador().getPosition().ordinal()) {
			return findJogador(position, subRoot.getLeftNode());
		} else {
			return findJogador(position, subRoot.getRightNode());
		}
	}

	public void inOrder() {
		System.out.println("IN ORDER:");
		inOrder(rootNode);
	}

	private void inOrder(Node subRoot) {
		if (subRoot != null) {
			inOrder(subRoot.getLeftNode());
			System.out.println(subRoot.getJogador().getPosition().getLabel() + ": " + subRoot.getJogador().getName());
			inOrder(subRoot.getRightNode());
		}
	}

	public void preOrder() {
		System.out.println("\nPRE ORDER:");
		preOrder(rootNode);
	}

	private void preOrder(Node subRoot) {
		if (subRoot != null) {
			System.out.println(subRoot.getJogador().getPosition().getLabel() + ": " + subRoot.getJogador().getName());
			preOrder(subRoot.getLeftNode());
			preOrder(subRoot.getRightNode());
		}
	}

	public void postOrder() {
		System.out.println("\nPOST ORDER:");
		postOrder(rootNode);
	}

	private void postOrder(Node subRoot) {
		if (subRoot != null) {
			postOrder(subRoot.getLeftNode());
			postOrder(subRoot.getRightNode());
			System.out.println(subRoot.getJogador().getPosition().getLabel() + ": " + subRoot.getJogador().getName());
		}
	}

}
