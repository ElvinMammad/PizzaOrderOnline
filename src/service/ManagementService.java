package service;

import util.MenuUtil;

public class ManagementService {
public static void foo() {

    while (true) {
        int option = MenuUtil.menu();
        switch (option) {

            case 0:
                System.out.println("Exit ");
                System.exit(-1);
            case 1:
                MenuUtil.adminMenu();

                break;
            case 2:
                System.out.println("Customer");

                break;
            default:
                System.out.println("invalid option");

        }
    }
}
}
