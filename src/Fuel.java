public class Fuel extends Engine{
    Fuel(int amount_energy) {
        super(amount_energy);
    }
    @Override
    public String toString() {
        return this.getAmountOfEnergy()+ "litres";
    }
}
