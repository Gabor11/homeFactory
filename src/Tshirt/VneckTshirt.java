//Concrete Component

package Tshirt;

public class VneckTshirt extends Tshirt {
    public VneckTshirt(){
        description = "V-neck T-shirt";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
