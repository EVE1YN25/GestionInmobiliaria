// Código de la clase Terreno
public class Terreno extends Inmueble {
    private String tipoSuelo;
    private boolean tieneServiciosBasicos;

    public Terreno(String direccion, String ciudad, double precio, int area, boolean disponible, String tipoSuelo, boolean tieneServiciosBasicos) {
        super(direccion, ciudad, precio, area, disponible);
        this.tipoSuelo = tipoSuelo;
        this.tieneServiciosBasicos = tieneServiciosBasicos;
    }

    public String getTipoSuelo() { return tipoSuelo; }
    public boolean isTieneServiciosBasicos() { return tieneServiciosBasicos; }
    public void setTipoSuelo(String tipoSuelo) { this.tipoSuelo = tipoSuelo; }
    public void setTieneServiciosBasicos(boolean tieneServiciosBasicos) { this.tieneServiciosBasicos = tieneServiciosBasicos; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Terreno");
        System.out.println("Tipo de suelo: " + tipoSuelo);
        System.out.println("Tiene servicios básicos: " + (tieneServiciosBasicos ? "Sí" : "No"));
        System.out.println("---------------------------------");
    }
}
