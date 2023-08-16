import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        HDFCAccount AnmolAcc = new HDFCAccount("Anmol","anmol123",10000);

        System.out.println(AnmolAcc);

        //fetchbalance
        System.out.println(AnmolAcc.fetchBalance("anmol123"));
        System.out.println(AnmolAcc.fetchBalance("anmol"));

        //addmoney

        System.out.println(AnmolAcc.addMoney(5000));

        //withdraw

        System.out.println(AnmolAcc.withdrawMoney(50000,"anmol123"));
        System.out.println(AnmolAcc.withdrawMoney(4000,"anmol"));
        System.out.println(AnmolAcc.withdrawMoney(4000,"anmol123"));

        //changedpassword

        System.out.println(AnmolAcc.changePassword("anmol123","anmol"));
        System.out.println(AnmolAcc.fetchBalance("anmol"));

        //calculatingInterest

        System.out.println("Interest:"+ AnmolAcc.calculateInterest(5));



    }
}