//Concrete Component

package Tshirt;

public class NormalTshirt extends Tshirt {
    public NormalTshirt(){
        description = "Normal T-shirt";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
