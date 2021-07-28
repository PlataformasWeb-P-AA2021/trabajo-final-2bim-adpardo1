package entidades;

import java.io.Serializable;

public abstract class PlanCelular implements Serializable {
    protected Persona owner;
    protected String cityOwner;
    protected String phoneBrand;
    protected String phoneModel;
    protected String phoneNumber;
    protected double monthlyPayment;

    public PlanCelular(Persona owner, String cityOwner, String phoneBrand, String phoneModel, String phoneNumber) {
        this.owner = owner;
        this.cityOwner = cityOwner;
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.phoneNumber = phoneNumber;
    }

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    public String getCityOwner() {
        return cityOwner;
    }

    public void setCityOwner(String cityOwner) {
        this.cityOwner = cityOwner;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public abstract void calcMonthlyPayment();

    public abstract String getPlanId();
    @Override
    public String toString() {
        return String.format("   >Datos propietario\n %s \n   >Datos del paquete \n     Ciudad propietario: %s " +
                        "\n     Marca celular: %s" + "\n     Modelo celular: %s \n     Número celular: %s \n     " +
                        "Pago mensual: %s", owner, cityOwner, phoneBrand, phoneModel, phoneNumber, monthlyPayment);
    }
}
