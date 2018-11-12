import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Kasymbekov Nursultan AIN-2-17
 * Date 09.11.2018
 */
//Constructor
    class Cake implements Order {
    private String name;
    private int price;


    public Cake(String name, int price) {
        this.name = name;
        this.price = price;
    }
        //Prints the cake.
        public void print()
        {
            System.out.println(" "+toString());
        }
    //Выводит добавки и стоимость торта
    public String toString(){
        return ("Cake [ additive : "+name+", price: "+price+" ]");
    }

}



