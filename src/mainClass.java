import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import static java.util.Arrays.asList;

class mainClass  {
    public static void main(String args[]){
        List <Vehicle> list = new ArrayList<>(asList(new Car(new Fuel(20), 4), new Car(new Electric(40), 4),
                new Motorcycle(new Fuel(5),2) ,new Motorcycle( new Electric(80),2 )) );
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
