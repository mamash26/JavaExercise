public class Electric extends Engine {
    Electric(int amount_energy) {
        super(amount_energy);
    }
    @Override
    public String toString() {
        return  this.getAmountOfEnergy()+"%";
    }
}
