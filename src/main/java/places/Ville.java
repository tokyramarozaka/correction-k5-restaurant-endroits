package places;

import java.util.List;

public class Ville {
    private final String nom;
    private final List<Endroit> endroits;

    public Ville(String nom, List<Endroit> endroits) {
        this.nom = nom;
        this.endroits = endroits;
    }

    public String getNom() {
        return nom;
    }

    public List<Endroit> getEndroits() {
        return endroits;
    }

    public List<Restaurant> restaurantsAvecSpecialite(Specialite specialite) {
        return endroits.stream()
                .filter(endroit -> endroit instanceof Restaurant)
                .map(endroit -> (Restaurant) endroit)
                .filter(restaurant -> specialite.equals(restaurant.getSpecialite()))
                .toList();
    }
}

