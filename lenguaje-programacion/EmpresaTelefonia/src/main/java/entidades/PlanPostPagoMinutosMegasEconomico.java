package entidades;

public class PlanPostPagoMinutosMegasEconomico extends PlanPostPagoMinutosMegas {
    private double porcentajeDescuento;
    private String planId = "postPagoMinutosMegasEconomico";

    public PlanPostPagoMinutosMegasEconomico(Persona owner, String cityOwner, String phoneBrand, String phoneModel,
                                             String phoneNumber, int minutos, double costoMinutos, double gigas,
                                             double costoGigas, double porcentajeDescuento) {
        super(owner, cityOwner, phoneBrand, phoneModel, phoneNumber, minutos, costoMinutos, gigas, costoGigas);
        this.porcentajeDescuento = porcentajeDescuento;
        calcMonthlyPayment();
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void calcMonthlyPayment() {
        super.calcMonthlyPayment();
        monthlyPayment = monthlyPayment - ((monthlyPayment * porcentajeDescuento) / 100);
    }

    @Override
    public String getPlanId() {
        return "postPagoMinutosMegasEconomico";
    }

    @Override
    public String toString() {
        return String.format("\n    [   Plan de megas y minutos económico  ]\n%s \n     Porcentaje descuento: %.1f",
                super.toString(), porcentajeDescuento);
    }


}
