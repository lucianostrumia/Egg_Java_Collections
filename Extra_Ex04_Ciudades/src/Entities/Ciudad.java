package Entities;

import java.util.HashMap;

public class Ciudad {

    private HashMap<Integer, String> ciudades = new HashMap();

    public Ciudad() {
    }

    public Ciudad(HashMap<Integer, String> ciudades) {
        this.ciudades = ciudades;
    }

    public HashMap<Integer, String> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<Integer, String> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "ciudades=" + ciudades +
                '}';
    }
}
