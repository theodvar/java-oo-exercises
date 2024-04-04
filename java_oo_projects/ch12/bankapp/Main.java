package gr.aueb.cf.java_oo_projects.ch12.bankapp;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;
import gr.aueb.cf.ch12.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        JointAccount j1 = new JointAccount(1,"gr123456","theod vard", "tom vard", "123456"
                , "567289", 400);

        JointAccount j2 = new JointAccount(34,"gr123756","mary vard", "bob vard", "122456"
                , "567279", 900);

        OverdraftAccount acc1 = new OverdraftAccount(j2);




        try {
            j1.withdraw(300.0,"567289");
            j2.deposit(300);
            j1.deposit(100);
            j1.withdraw(50,"123456");
            acc1.withdrawOver(2000,"122456");

        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(j1.accountToString());
        System.out.println(acc1.overdraftAccountToString());
        System.out.println(j2.accountToString());







    }
}
