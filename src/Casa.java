// Código de la clase Casa
public class Casa extends Inmueble {
    private int numeroPisos;
    private boolean tienePatio;

    public Casa(String direccion, String ciudad, double precio, int area, boolean disponible, int numeroPisos, boolean tienePatio) {
        super(direccion, ciudad, precio, area, disponible);
        this.numeroPisos = numeroPisos;
        this.tienePatio = tienePatio;
    }

    public int getNumeroPisos() { return numeroPisos; }
    public boolean isTienePatio() { return tienePatio; }
    public void setNumeroPisos(int numeroPisos) { this.numeroPisos = numeroPisos; }
    public void setTienePatio(boolean tienePatio) { this.tienePatio = tienePatio; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Casa");
        System.out.println("Número de pisos: " + numeroPisos);
        System.out.println("Tiene patio: " + (tienePatio ? "Sí" : "No"));
        System.out.println("---------------------------------");
    }
}
