public abstract class Empleado {

    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private double tarifaHora;
    private String departamento;

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
    }

    public double calcularSalario() {
        validarEntradas();
        double salarioTotal = salarioBase + calcularHorasExtras();
        salarioTotal += ajustarPorDepartamento();
        return salarioTotal;
    }

    private void validarEntradas() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario base debe ser mayor a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }

    private double calcularHorasExtras() {
        final int HORAS_NORMALES = 40;
        if (horasTrabajadas > HORAS_NORMALES) {
            return (horasTrabajadas - HORAS_NORMALES) * 50; // Pago por horas extra
        }
        return 0;
    }

    protected abstract double ajustarPorDepartamento();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
