import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Kasymbekov Nursultan AIN-2-17
 * Date 09.11.2018
 */

    class CompositeOrder implements Order {

        //Collection of customer orders.
        private List<Order> dieOrders = new ArrayList<Order>();
        //Prints the order.
        public void print() {
            for (Order order : dieOrders) {
                order.print();
            }
        }



    //Adds the graphic to the composition.
       // public void add(Cake order) {
      //      dieOrders.add(order);
       // }

        //Removes the graphic from the composition.
       // public void remove(Cake order) {
        //    CustomerOrders.remove(order);
        //}

    public void add(Order order){
            dieOrders.add(order);
    }
    public void remove(Order order){
        dieOrders.remove(order);
    }
    }

