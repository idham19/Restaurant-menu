package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem chicken =new MenuItem(10.00,"spicy and well cooked","Main menu");
        MenuItem beef =new MenuItem(20.00,"well cooked with barbeque sauce","main menu");
        MenuItem deer =new MenuItem(50.00,"Deer leg","Main Menu");
        ArrayList<Object> allMenus =new ArrayList<Object>();
        allMenus.add(chicken);
        allMenus.add(beef);
        allMenus.add(deer);

      for(int  i=0;i<allMenus.size();i++){
          System.out.println(allMenus.get(i).toString());
      }

    }
}
