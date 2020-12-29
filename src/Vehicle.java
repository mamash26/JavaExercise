public class Vehicle implements Comparable<Vehicle>{
    private int numOfWheels;
    private Engine engine;

    Vehicle(Engine v_engine, int num_wheels){
        this.engine = v_engine;
        this.numOfWheels = num_wheels;
    }

    public int getNumOfWheels(){
        return numOfWheels;
    }
    public int getAmountEnergy(){
        return engine.getAmountOfEnergy();
    }
    public Engine getEngine(){
        return engine;
    }

    @Override
    public String toString() {
        return String.format("Vehicle type: %s, number of wheels: %d, engine type: %s ",this.getClass().getSimpleName() ,numOfWheels , engine.getClass().getSimpleName());
    }

    @Override
    public int compareTo(Vehicle o) {
        if(this.engine instanceof Fuel){
            if (o.getEngine() instanceof Fuel){
                return ( o.getAmountEnergy()> engine.getAmountOfEnergy()? 1 : -1 );
            }
            else return -1;
        }
        else
            return (o.getEngine() instanceof Fuel ? 1: (o.getAmountEnergy()> this.getAmountEnergy() ? 1:-1));
    }
}
