package tree;

public enum Position {
	GOLEIRO(1, "Goleiro"),
	ZAGUEIRO_DIR(2, "Zagueiro Direito"),
	ZAGUEIRO_ESQ(3, "Zagueiro Esquerdo"),
	LATERAL_DIR(4, "Lateral Direito"), 
	LATERAL_ESQ(5, "Lateral Esquerdo"), 
	MEIA_CENTRAL(6, "Meia Central"), 
	MEIA_VOLANTE(7, "Meia Volante"), 
	MEIA_ATACANTE(8, "Meia Atacante"), 
	PONTA_DIR(9, "Ponta Direita"),
	PONTA_ESQ(10, "Ponta Esquerxa"),
	CENTROAVANTE(11, "Centroavante");

	int id;
	private String label;

	public static Position valueOf(int id) {

		for (Position position : Position.values()) {
			if (position.id == id) {
				return position;
			}
		}
		return null;

	}

	private Position(int id, String label) {
			this.id = id;
			this.label = label;
		}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

}
