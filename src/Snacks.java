package src;

public class Snacks extends Product{

    private float weight;
    private String taste;

    public Snacks(String name, double cost, float weight, String taste){
        super(name, cost);
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format(" со вкусом %s, вес упаковки %4.1f грамм.", taste, weight));
        return sb.toString();
    }
}
