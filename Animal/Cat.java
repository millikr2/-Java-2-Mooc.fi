
public class Cat extends Animal implements NoiseCapable {

    String name;

    public Cat() {
        this("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }

}
