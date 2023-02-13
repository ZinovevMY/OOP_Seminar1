package src;

import java.util.Date;

public class Perishable extends Product{
    private Date expireDate = new Date();

    public Perishable(String name, double cost, Date expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format(" годен до %s", expireDate.toString()));
        return sb.toString();
    }
}
