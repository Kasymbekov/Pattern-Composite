import java.awt.*;
import java.util.HashMap;


/**
 * Created by Kasymbekov Nursultan AIN-2-17
 * Date 09.11.2018
 */

public class Client {

    public static void main(String[] args) {
        //Initialize four cake
       Cake cake1 = new Cake("Chocolade", 230);
       Cake cake2 = new Cake("Cherry", 300);
       Cake cake3 = new Cake("Strawberry",330);
       Cake cake4 = new Cake("Banane",350);
       Cake cake5 = new Cake("Marmelad", 290);

         //Initialize three composite orders
        CompositeOrder order = new CompositeOrder();
        CompositeOrder order1 = new CompositeOrder();
        CompositeOrder order2 = new CompositeOrder();


        //Composes the cakes
        order.add(cake1);
        order.add(cake2);
        order1.add(cake3);
        order1.add(cake4);
        order2.add(cake5);


        order.add(order1);
        order1.add(order2);

        //Prints the complete cake (four times the string "Cake").
        order.print();

        }



}




