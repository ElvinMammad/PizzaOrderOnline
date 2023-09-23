package util;

public class MenuUtil {
    public static int menu(){
        System.out.println(
                "[0] -> Exit\n"+
                "[1] -> Admin\n"+
                "[2] -> Customer"
        );

       return InputUtil.getInstance().inputInt("choose option");
    }
    public static int adminMenu(){
        System.out.println(
                        "[0] -> Exit\n"+
                        "[1] -> Back\n"+
                        "[2] -> Add Courier\n"+
                        "[3] -> Track Orders\n"+
                        "[4] -> View Couriers\n"+
                        "[5] -> View Customers"
        );
        return InputUtil.getInstance().inputInt("choose option");
    }
    public static int customerMenu(){
        System.out.println(
                "[0] -> Exit\n"+
                "[1] -> Login\n"+
                "[2] -> Sign up\n"+
                "[3] -> Back" );
        return InputUtil.getInstance().inputInt("choose option");
    }
    public static int orderMenu(){
        System.out.println(
                        "[0] -> Exit\n"+
                        "[1] -> Back\n"+
                        "[2] -> Place order\n"+
                        "[3] -> Track order\n"+
                        "[4] -> Cancel order"
                );
        return InputUtil.getInstance().inputInt("choose option");

    }
    public static int pizzaMenu(){
        System.out.println("----------|  Pizzanın növun daxil et |-----------\n" +
                "Pizalar : ( Italiano -> 11.99 azn , Americano -> 10.99 azn , Mexicano -> 12.99azn ," +
                "Chiscken Kickers -> 9.99azn , Margherita -> 13.99 azn , Pepperoni -> 14.99azn )\n" +
                "\n" +
                "[1] -> Italiano  \n" +
                "[2] -> Americano\n" +
                "[3] -> Mexicano\n" +
                "[4] -> Chicken Kickers\n" +
                "[5] -> Margherita\n" +
                "[6] ->Pepperoni");
        return InputUtil.getInstance().inputInt("choose option");
    }
    public static int sizeMenu(){
        System.out.println("---------| Pizanin hecimi |-------------\n" +
                "Hecmler ( kicik(default) , orta (+6.99azn) , boyuk (+13.99azn) )\n" +
                "\n" +
                "[1] -> Small  \n" +
                "[2] -> Medium\n" +
                "[3] -> Large");
        return InputUtil.getInstance().inputInt("choose option");
    }
    public static int sousMenu(){
        System.out.println(" ------------| Sous |-------------\n" +
                "  Sous ( Ketcup - > 0.7azn , Barbecu - > 0.7 azn ,  Mayonnaise - > 0.7 )\n" +
                "[1] -> Ketcup \n" +
                "[2] -> Barbeque\n" +
                "[3] -> Mayonnaise\n" +
                "[4] -> Cancel");
        return InputUtil.getInstance().inputInt("choose option");
    }

}
