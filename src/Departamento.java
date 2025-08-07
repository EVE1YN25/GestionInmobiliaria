// Código de la clase Departamento
public class Departamento extends Inmueble {
    private int piso;
    private boolean tieneAscensor;

    public Departamento(String direccion, String ciudad, double precio, int area, boolean disponible, int piso, boolean tieneAscensor) {
        super(direccion, ciudad, precio, area, disponible);
        this.piso = piso;
        this.tieneAscensor = tieneAscensor;
    }

    public int getPiso() { return piso; }
    public boolean isTieneAscensor() { return tieneAscensor; }
    public void setPiso(int piso) { this.piso = piso; }
    public void setTieneAscensor(boolean tieneAscensor) { this.tieneAscensor = tieneAscensor; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Departamento");
        System.out.println("Piso: " + piso);
        System.out.println("Tiene ascensor: " + (tieneAscensor ? "Sí" : "No"));
        System.out.println("---------------------------------");
    }
}
