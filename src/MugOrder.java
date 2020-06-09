
public class MugOrder implements Command{
    Maker maker;
    String order;
    public MugOrder(Maker maker, String order){
        this.maker = maker;
        this.order= order;
    }

    @Override
    public void orderUp() {
        maker.mugType = order;
        maker.getOrder("Mug");
    }
}
