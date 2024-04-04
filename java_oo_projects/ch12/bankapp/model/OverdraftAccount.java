package gr.aueb.cf.java_oo_projects.ch12.bankapp.model;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;

/**
 * The {@link OverdraftAccount} class represents <i>bank accounts</i> with
 * two holders (object from  {@link gr.aueb.cf.ch12.bankapp.model.JointAccount} ), and with
 * the ability to withdraw more than the balance. It contains  {@link OverdraftAccount#jointAccount}
 * and services.
 *
 * @author theodosia
 * @since 0.1
 */
public class OverdraftAccount {
    private gr.aueb.cf.ch12.bankapp.model.JointAccount jointAccount = new gr.aueb.cf.ch12.bankapp.model.JointAccount() ;

    /**
     * Overloaded constructor
     * Initializes a newly created account to
     * specific values.
     * @param jointAccount deep copy
     */
    public OverdraftAccount(gr.aueb.cf.ch12.bankapp.model.JointAccount jointAccount) {
        this.jointAccount = new JointAccount(jointAccount.getId(), jointAccount.getIban(), jointAccount.getHolder1(),
                jointAccount.getHolder2(), jointAccount.getSsn1(), jointAccount.getSsn2(), jointAccount.getBalance());

    }

    /**
     * Checks if the given ssn corresponds to ss1 or ssn2
     * @param ssn    the given security number
     * @return
     *      True or False
     */
    private  boolean isSsnValid(String ssn) {
        return jointAccount.getSsn1().equals(ssn) || jointAccount.getSsn2().equals(ssn);
    }

    /**
     * Returns the account's state in string format
     * @return
     *      the string-representation of the state of the account
     */
    public String overdraftAccountToString() {
        return jointAccount.accountToString();
    }

    /**
     *Withdraws a certain amount of money based on a  valid ssn,
     * even if the amount is bigger than
     * @param amount
     *          the amount of money to be withdrawn
     * @param ssn
     *          the given ssn
     * @throws Exception
     *          if the ssn is not valid or if the balance
     */
    public void withdrawOver (double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)){
                throw new Exception("Ssn is not valid");
            }
            jointAccount.setBalance(jointAccount.getBalance()-amount);
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
