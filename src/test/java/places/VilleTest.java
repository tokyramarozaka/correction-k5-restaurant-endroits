package places;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class VilleTest {
    private Ville ville;
    private List<Endroit> endroits;
    private Endroit hei;
    private Endroit maison;
    private Restaurant parisDelhi;
    private Restaurant extraPizza;

    @BeforeEach
    void setUp() {
        // Initialisation des endroits individuellement
        hei = new Endroit(1, "HEI", new Position(-10, 10), "Ivandry");
        maison = new Endroit(2, "Maison", new Position(-50, 30), "Chez vous");
        parisDelhi = new Restaurant(3, "Paris Delhi", new Position(-10, 10), "Analakely",
                List.of("Butter chicken", "Poulet mango curry"), Specialite.INDIENNE);
        extraPizza = new Restaurant(4, "Extra pizza", new Position(-10, 10), "Ankorondrano",
                List.of("French Tacos", "Pizza"), Specialite.EUROPEENNE);

        // Initialisation de la liste d'endroits
        endroits = List.of(hei, maison, parisDelhi, extraPizza);

        // Initialisation de la ville avec la liste d'endroits
        ville = new Ville("Antananarivo", endroits);
    }

    @Test
    void restaurantAvecSpecialite_ok() {
        // À compléter selon la logique du test
        Assertions.assertEquals(
                extraPizza,
                ville.restaurantsAvecSpecialite(Specialite.EUROPEENNE).getFirst());
        Assertions.assertEquals(
                parisDelhi,
                ville.restaurantsAvecSpecialite(Specialite.INDIENNE).getFirst());
    }
}
