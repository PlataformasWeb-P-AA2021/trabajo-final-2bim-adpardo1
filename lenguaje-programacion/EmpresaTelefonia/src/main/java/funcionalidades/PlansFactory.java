package funcionalidades;

import entidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static funcionalidades.Printer.*;
import static java.lang.Integer.parseInt;

public class PlansFactory {
    Scanner keyboard = new Scanner(System.in);

    public ArrayList<Object> insertPlan() {
        println("  Datos cliente ->");
        print("      > Identificación: ");
        String identificacion = keyboard.nextLine();
        print("      > Nombres: ");
        String nombres = keyboard.nextLine();
        print("      > Apellidos: ");
        String apellidos = keyboard.nextLine();
        Persona persona = new Persona(identificacion, nombres, apellidos);

        println("  Datos comúnes ->  ");
        print("      > Ciudad propietario: ");
        String ciudad = keyboard.nextLine();
        print("      > Marca celular: ");
        String marca = keyboard.nextLine();
        print("      > Modelo celular: ");
        String modelo = keyboard.nextLine();
        print("      > Número celular: ");
        String celular = keyboard.nextLine();

        ArrayList<Object> planData = new ArrayList<>(List.of(persona, ciudad, marca, modelo, celular));
        return planData;
    }

    public PlanPostPagoMinutos insertPlanPostPagoMinutos() {
        ArrayList<Object> planData = insertPlan();
        print("      > Minutos nacionales: ");
        int minutosNacionales = parseInt(keyboard.nextLine());
        print("      > Costo minuto nacional: ");
        double costoMinutoNacional = Double.parseDouble(keyboard.nextLine());

        print("      > Minutos internacionales: ");
        int minutosInternacionales = parseInt(keyboard.nextLine());

        print("      > Costo minuto internacional: ");
        double costoMinutoInternacional = Double.parseDouble(keyboard.nextLine());


        //planData: persona, ciudad, marca, modelo, celular -> estan en esa posicion
        PlanPostPagoMinutos planPostPagoMinutos = new PlanPostPagoMinutos((Persona) planData.get(0),
                (String) planData.get(1), (String) planData.get(2), (String) planData.get(3), (String) planData.get(4),
                minutosNacionales, costoMinutoNacional, minutosInternacionales, costoMinutoInternacional);

        return planPostPagoMinutos;
    }


    public PlanPostPagoMegas insertPlanPostPagoMegas() {
        ArrayList<Object> planData = insertPlan();
        print("      > Cantidad de megabytes: ");
        double gigas = parseInt(keyboard.nextLine());
        print("      > Costo gigas: ");
        double costoGigas = Double.parseDouble(keyboard.nextLine());
        print("      > Tarifa base: ");
        double tarifaBase = parseInt(keyboard.nextLine());

        PlanPostPagoMegas planPostPagoMegas = new PlanPostPagoMegas((Persona) planData.get(0), (String) planData.get(1),
                (String) planData.get(2), (String) planData.get(3), (String) planData.get(4), gigas,
                costoGigas, tarifaBase);
        return planPostPagoMegas;
    }


    public PlanPostPagoMinutosMegas insertPlanPostPagoMinutosMegas() {
        ArrayList<Object> planData = insertPlan();
        print("      > Cantidad minutos: ");
        int cantidadMinutos = parseInt(keyboard.nextLine());
        print("      > Costo minutos: ");
        double costoMinutos = Double.parseDouble(keyboard.nextLine());

        print("      > Cantidad de megabytes: ");
        double gigas = parseInt(keyboard.nextLine());

        print("      > Costo Gigas: ");
        double costoGigas = Double.parseDouble(keyboard.nextLine());

        PlanPostPagoMinutosMegas planPostPagoMinutosMegas = new PlanPostPagoMinutosMegas((Persona) planData.get(0), (String) planData.get(1),
                (String) planData.get(2), (String) planData.get(3), (String) planData.get(4), cantidadMinutos, costoMinutos,
                gigas, costoGigas);

        return planPostPagoMinutosMegas;
    }

    public PlanPostPagoMinutosMegasEconomico insertPlanPostPagoMinutosMegasEconomico() {
        PlanPostPagoMinutosMegas plan = insertPlanPostPagoMinutosMegas();
        print("      > Porcentaje descuento : ");
        double porcentajeDescuento = Double.parseDouble(keyboard.nextLine());

        PlanPostPagoMinutosMegasEconomico planPostPagoMinutosMegasEconomico = new PlanPostPagoMinutosMegasEconomico(
                plan.getOwner(), plan.getCityOwner(), plan.getPhoneBrand(), plan.getPhoneModel(), plan.getPhoneNumber(),
                plan.getMinutos(), plan.getCostoMinutos(), plan.getGigas(), plan.getCostoGigas(), porcentajeDescuento
        );
        return planPostPagoMinutosMegasEconomico;
    }
}
