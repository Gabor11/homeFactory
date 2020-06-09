
public class TshirtOrder implements Command{
    Maker maker;
    String[] screenPrintingList, inkjetPrintingList;
    String order;
    public TshirtOrder(Maker maker, String order, String[] screenPrintingList, String[] inkjetPrintingList){
        this.maker = maker;
        this.order = order;
        this.screenPrintingList = screenPrintingList;
        this.inkjetPrintingList = inkjetPrintingList;
    }

    @Override
    public void orderUp() {
        maker.tshirtType = order;
        maker.screenPrintingList = this.screenPrintingList;
        maker.inkjetPrintingList = this.inkjetPrintingList;
        maker.getOrder("Tshirt");
    }
}
