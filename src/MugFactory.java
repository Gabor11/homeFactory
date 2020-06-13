import Mug.*;

public class MugFactory {

    public Mug makeMug(String mugType) {
        if (mugType.equals(null)){
            return null;
        }
        else if(mugType.equals("NamedMug")){
            return new NamedMug();
        }
        else if(mugType.equals("PicturedMug")){
            return new PicturedMug();
        }
        else if(mugType.equals("ArtisticMug")) {
            return new ArtisticMug();
        } else if (mugType.equals("LogoMug")) {
            return new LogoMug();
        }
        return null;
    }

}
