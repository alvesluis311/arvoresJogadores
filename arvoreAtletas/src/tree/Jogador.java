package tree;


public class Jogador {
	private String name;
	private Integer age;
	private Integer number;
	private Float height;
	private Position position;

	public Jogador(String name, Integer age, Integer number, Float height, Position position) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.height = height;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Nome: " + name + ", Idade: " + age + ", Numero: " + number + ", Altura: " + height + " m, "+ "Posição: " + position.getLabel();
	}

}
