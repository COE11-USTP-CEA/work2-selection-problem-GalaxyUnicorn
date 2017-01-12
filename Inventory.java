import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Reyna's SWEETS");
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        Item t1 = new Item("Tobleron", "Chocolates", 278.00f);

        Item t2 = new Item("Cadbury", "Chocolates", 50.00f);

        Item t3 = new Item("Ritter", "Chocolates", 103.00f);

        Item t4 = new Item("Meiji", "Chocolates", 43.00f);

        Item t5 = new Item("Twix", "Chocolates", 20.00f);

        Item t6 = new Item("Snickers", "Chocolates", 12.00f);

        Item t7 = new Item("Mars", "Chocolates", 10.00f);

        Item t8 = new Item("Hersheys", "Chocolates", 45.00f);

        Item t9 = new Item("Ferrero Rocher", "Chocolates", 128.00f);

        Item t10 = new Item("Curly Tops", "Chocolates", 100.00f);

        INV.add(t1);
        INV.add(t2);
        INV.add(t3);
        INV.add(t4);
        INV.add(t5);
        INV.add(t6);
        INV.add(t7);
        INV.add(t8);
        INV.add(t9);
        INV.add(t10);
        for(Item r: INV){
            if(r.Getname()=="Tobleron"){
                System.out.println("Found it!");
            }else{
                System.out.println("It's not it");
            }
            total = total + r.Getprice();
        }
        System.out.println(total);
    }
}