import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String mugType ="";
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Maker maker = new Maker();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) T-shirt");
            System.out.println("(2) Mug");
            System.out.println("(Other) I have finished ordering.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> screenPrintingList = new ArrayList<>();
                ArrayList<String> inkjetPrintingList = new ArrayList<>();

                String tshirtType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which T-shirt type do you want?");
                    System.out.println("(1) V-neck T-shirt --- 5.0$");
                    System.out.println("(2) Normal T-shirt --- 4.0$");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        tshirtType = "Vneck Tshirt";
                        System.out.println("*** V-neck T-shirt is chosen.");
                        break;
                    } else if (answer.equals("2")) {
                        tshirtType = "Normal Tshirt";
                        System.out.println("*** Normal T-shirt is chosen.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- PATTERNS --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Available Screen Printing Options --------------------");
                    System.out.println("(1) Logo --- 0.25$");
                    System.out.println("(2) Text --- 0.3$");
                    System.out.println("(Other) I finished the screen printing selection.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        screenPrintingList.add("LogoScreenPrinting");
                        System.out.println("*** A screen printed logo is chosen.");
                    } else if (value == 2) {
                        screenPrintingList.add("TextScreenPrinting");
                        System.out.println("*** A screen printed text is chosen.");
                    } else break;
                }
                System.out.println("The selection of Screen Printing Options is completed.");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Available Inkjet Printing Options --------------------");
                    System.out.println("(1) Logo --- 0.35$");
                    System.out.println("(2) Picture --- 0.5$");
                    System.out.println("(3) Big Pattern --- 0.6$");
                    System.out.println("(4) Small Pattern --- 0.3$");
                    System.out.println("(Other) I finished the fruit selection.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        inkjetPrintingList.add("Logo");
                        System.out.println("*** Logo is chosen.");
                    } else if (value == 2) {
                        inkjetPrintingList.add("Picture");
                        System.out.println("*** Picture is chosen.");
                    } else if (value == 3) {
                        inkjetPrintingList.add("BigPattern");
                        System.out.println("*** Big Pattern is chosen.");
                    } else if (value == 4) {
                        inkjetPrintingList.add("SmallPattern");
                        System.out.println("*** Small Pattern is chosen.");
                    } else break;
                }
                System.out.println("The selection of Inkjet Printing Options is completed.");
                System.out.println("");

                String[] screenPrintingArr = new String[screenPrintingList.size()];
                screenPrintingArr = screenPrintingList.toArray(screenPrintingArr);

                String[] inkjetPrintingArr = new String[inkjetPrintingList.size()];
                inkjetPrintingArr = inkjetPrintingList.toArray(inkjetPrintingArr);

                TshirtOrder tshirtOrder = new TshirtOrder(maker, tshirtType, screenPrintingArr, inkjetPrintingArr);
                assistant.takeOrder(tshirtOrder);
            }

            else if(a==2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- MUGS --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Drink Types --------------------");
                    System.out.println("(1) Named Mug --- 4$");
                    System.out.println("(2) Artistic Mug --- 6.5$");
                    System.out.println("(3) Pictured Mug --- 5.5$");
                    System.out.println("(Other) I finished the mug selection.");
                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        mugType ="NamedMug";
                        System.out.println("*** Named Mug is chosen.");
                    }
                    else if(drink==2){
                        mugType ="ArtisticMug";
                        System.out.println("*** Artistic Mug is chosen.");
                    }
                    else if(drink==3){
                        mugType ="PicturedMug";
                        System.out.println("*** Pictured Mug is chosen.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of mugs is completed.");
                System.out.println("");

                MugOrder mugOrder = new MugOrder(maker, mugType);
                assistant.takeOrder(mugOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Thank you for your purchase!!!");
                break;
            }
        }
    }
}
