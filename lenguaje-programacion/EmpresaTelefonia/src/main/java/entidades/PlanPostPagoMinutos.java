package entidades;

public class PlanPostPagoMinutos extends PlanCelular {
    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacionales;
    private double costoMinutoInternacional;


    public PlanPostPagoMinutos(Persona owner, String cityOwner, String phoneBrand, String phoneModel, String phoneNumber,
                               int minutosNacionales, double costoMinutoNacional, int minutosInternacionales, double costoMinutoInternacional) {
        super(owner, cityOwner, phoneBrand, phoneModel, phoneNumber);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutoNacional = costoMinutoNacional;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
        calcMonthlyPayment();
    }

    public int getMinutosNacionales() {
        return minutosNacionales;
    }

    public void setMinutosNacionales(int minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public double getCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void setCostoMinutoNacional(double costoMinutoNacional) {
        this.costoMinutoNacional = costoMinutoNacional;
    }

    public int getMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void setMinutosInternacionales(int minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }

    public double getCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void setCostoMinutoInternacional(double costoMinutoInternacional) {
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    @Override
    public void calcMonthlyPayment() {
        this.monthlyPayment = (minutosNacionales * costoMinutoNacional) + (minutosInternacionales * costoMinutoInternacional);
    }

    @Override
    public String getPlanId() {
        return "postPagoMinutos";
    }

    @Override
    public String toString() {
        return String.format("\n    [   Plan de minutos   ]\n%s \n     Minutos nacionales: %d \n     " +
                        "Costo minuto nacional: %.2f \n     Minutos Internacionales: %d" + "\n   " +
                        "  Costo minuto internacional: %.2f",
                super.toString(), minutosNacionales, costoMinutoNacional, minutosInternacionales,
                costoMinutoInternacional);
    }
}
