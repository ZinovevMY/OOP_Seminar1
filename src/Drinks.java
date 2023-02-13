package src;

public class Drinks extends Product{

    private float volume;

    public Drinks(String name, double cost, float volume){
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format(" объем %1.1f л.", volume));
        return sb.toString();
    }
}
