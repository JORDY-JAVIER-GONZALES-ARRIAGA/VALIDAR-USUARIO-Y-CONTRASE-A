package validate_access;

import java.util.Scanner;

public class validate_accessdata {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String user, password;
        Boolean isValid [] = new Boolean [2];
        isValid[0]=false;
        isValid[1]=false;

        System.out.println("ingrese nombre de usuario");
        user=keyboard.nextLine();

        System.out.println("ingrese su contraseña");
        password=keyboard.nextLine();
        if(user.isEmpty()==false){
            isValid[0]=true;
        }
        if(password.isEmpty()==false){
            isValid[1]=true;
        }
        System.out.println("" + isValid[0] + isValid[1]);
 
    }
    
}
