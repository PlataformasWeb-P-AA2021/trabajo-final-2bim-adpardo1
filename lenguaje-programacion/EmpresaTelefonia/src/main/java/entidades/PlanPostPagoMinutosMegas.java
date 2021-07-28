package entidades;

public class PlanPostPagoMinutosMegas extends PlanCelular{
    private int minutos;
    private double costoMinutos;
    private double gigas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(Persona owner, String cityOwner, String phoneBrand, String phoneModel,
                                    String phoneNumber, int minutos, double costoMinutos, double gigas, double costoGigas) {
        super(owner, cityOwner, phoneBrand, phoneModel, phoneNumber);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        setGigas(gigas);
        this.costoGigas = costoGigas;
        calcMonthlyPayment();

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public void setCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
    }

    public double getGigas() {
        return gigas;
    }

    public void setGigas(double gigas) {
        this.gigas = gigas / 1024;
    }

    public double getCostoGigas() {
        return costoGigas;
    }

    public void setCostoGigas(double costoGigas) {
        this.costoGigas = costoGigas;
    }

    @Override
    public void calcMonthlyPayment() {
        this.monthlyPayment = (minutos * costoMinutos) + (gigas * costoGigas);
    }

    @Override
    public String getPlanId() {
        return "postPagoMinutosMegas";
    }
    @Override
    public String toString() {
        return String.format("\n    [   Plan de megas y minutos   ]\n%s \n     Minutos: %d \n     Costo minuto: %.2f \n" +
                        "     Gigas: %.1f \n     Costo Giga: %.2f",
                super.toString(), minutos,  costoMinutos, gigas, costoGigas);
    }

}
