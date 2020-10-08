package services.Email;

import java.util.LinkedList;
import services.Email.constants.MenuList;

public class Menu {

    public LinkedList<String> menus() {
        LinkedList<String> list = new LinkedList<String>();
        list.add(MenuList.inbox);
        list.add(MenuList.sent);
        list.add(MenuList.deleted);
        return list;
    }
}
