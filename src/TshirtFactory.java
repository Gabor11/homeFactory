import Tshirt.*;

public class TshirtFactory {

    public Tshirt makeTshirt(String tshirtType) {
        if (tshirtType.equals(null)){
            return null;
        }
        else if(tshirtType.equals("Vneck Tshirt")){
            return new VneckTshirt();
        }
        else if(tshirtType.equals("Normal Tshirt")){
            return new NormalTshirt();
        }
        return null;
    }

}
