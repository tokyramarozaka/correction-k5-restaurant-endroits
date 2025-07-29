package places;

import java.util.List;

public class Restaurant extends Endroit{
    private final List<String> plats;
    private final Specialite specialite;

    public Restaurant(int id, String nom, Position position, String adresse, List<String> plats, Specialite specialite) {
        super(id, nom, position, adresse);
        this.plats = plats;
        this.specialite = specialite;
    }

    public List<String> getPlats() {
        return plats;
    }

    public Specialite getSpecialite() {
        return specialite;
    }
}
