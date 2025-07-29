package places;

public class Endroit {
    private final int id;
    private final String nom;
    private final Position position;
    private final String adresse;

    public Endroit(int id, String nom, Position position, String adresse) {
        this.id = id;
        this.nom = nom;
        this.position = position;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Position getPosition() {
        return position;
    }

    public String getAdresse() {
        return adresse;
    }
}
