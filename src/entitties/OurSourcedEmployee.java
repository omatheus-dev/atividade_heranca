package entitties;

public final class OurSourcedEmployee extends Employee{


    private Double additionalCharge;

    public OurSourcedEmployee() {
        super();
    }

    public OurSourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double Payment() {
        return super.Payment() + additionalCharge * 1.1;
    }
}
