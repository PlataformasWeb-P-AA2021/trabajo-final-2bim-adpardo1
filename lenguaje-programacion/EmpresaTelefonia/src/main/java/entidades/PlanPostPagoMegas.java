package entidades;

public class PlanPostPagoMegas extends PlanCelular {
    private double gigas;
    private double costoGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(Persona owner, String cityOwner, String phoneBrand, String phoneModel, String phoneNumber,
                             double gigas, double costoGiga, double tarifaBase) {
        super(owner, cityOwner, phoneBrand, phoneModel, phoneNumber);
        setGigas(gigas);
        this.costoGiga = costoGiga;
        this.tarifaBase = tarifaBase;
        calcMonthlyPayment();
    }

    public double getGigas() {
        return gigas;
    }

    public void setGigas(double gigas) {
        //Se convierten las megas a gigas
        this.gigas = gigas / 1024;
    }

    public double getCostoGiga() {
        return costoGiga;
    }

    public void setCostoGiga(double costoGiga) {
        this.costoGiga = costoGiga;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void calcMonthlyPayment() {
        monthlyPayment = tarifaBase + (gigas * costoGiga);
    }

    @Override
    public String getPlanId() {
        return "postPagoMegas";
    }

    @Override
    public String toString() {
        return String.format("\n    [   Plan de megas   ]\n %s \n     Cantidad gigas: %.1f \n     Costo gigas: %.2f \n" +
                        "     Tarifa base: %.2f", super.toString(), gigas, costoGiga, tarifaBase );
    }
}
