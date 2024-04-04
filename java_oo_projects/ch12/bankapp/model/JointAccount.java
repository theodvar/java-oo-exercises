package gr.aueb.cf.java_oo_projects.ch12.bankapp.model;

/**
 * The {@link JointAccount} class represents <i>bank accounts</i> with
 * two holders. It contains  {@link JointAccount#id},
 * {@link JointAccount#iban}, {@link JointAccount#holder1}, {@link JointAccount#holder2},
 * {@link JointAccount#ssn1}, {@link JointAccount#ssn2} and {@link JointAccount#balance}.
 *
 * @author theodosia
 * @since 0.1
 */
public class JointAccount {
    private int id;
    private String iban;
    private String holder1;
    private String holder2;
    private String ssn1;
    private String ssn2;
    private double balance;

    /**
     * Default constructor
     * Initializes a new {@link JointAccount}
     * with default values.
     */
    public JointAccount() {
    }

    /**
     * Overloaded constructor
     * Initializes a newly created account to
     * specific values in below fields:
     * @param id        code value
     * @param iban      international bank account number
     * @param holder1   details of the first beneficiary
     * @param holder2   details of the second beneficiary
     * @param ssn1      social security number of the first beneficiary
     * @param ssn2      social security number of the second beneficiary
     * @param balance   the rest amount of money in the account
     */
    public JointAccount(int id, String iban, String holder1, String holder2, String ssn1, String ssn2, double balance) {
        this.id = id;
        this.iban = iban;
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.ssn1 = ssn1;
        this.ssn2 = ssn2;
        this.balance = balance;
    }

    /**
     *  Gets the {@link JointAccount#id} code value.
     *
     * @return the value of id.
     */
    public int getId() {
        return id;
    }
    /**
     * Sets the {@link JointAccount#id} code value.
     * @param id
     *          the value of id-code.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *  Gets the {@link JointAccount#iban} international bank account number.
     *
     * @return the value of iban.
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the {@link JointAccount#iban} value.
     * @param iban
     *           the value of international bank account number
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     *  Gets the {@link JointAccount#holder1} personal details.
     *
     * @return the value of first holder.
     */
    public String getHolder1() {
        return holder1;
    }

    /**
     * Sets the {@link JointAccount#holder1} value.
     * @param holder1
     *           the value of the first holder personal details.
     */
    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    /**
     * Gets the {@link JointAccount#holder2} personal details.
     *
     * @return the value of second holder.
     */
    public String getHolder2() {
        return holder2;
    }

    /**
     * Sets the {@link JointAccount#holder2} value.
     * @param holder2
     *           the value of the second holder personal details.
     */
    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    /**
     * Gets the {@link JointAccount#ssn1} value.
     * @return the value of the social security number for the first holder.
     */
    public String getSsn1() {
        return ssn1;
    }

    /**
     * Sets the {@link JointAccount#ssn1} value.
     * @param ssn1
     *           the value of the social security number for the first holder.
     */
    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    /**
     * Gets the {@link JointAccount#ssn2} value.
     * @return the value of the social security number for the second holder.
     */
    public String getSsn2() {
        return ssn2;
    }

    /**
     * Sets the {@link JointAccount#ssn2} value.
     * @param ssn2
     *           the value of the social security number for the second holder.
     */
    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    /**
     * Gets the {@link JointAccount#balance} value.
     * @return the value of the rest of the amount of money in the account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the {@link JointAccount#balance} value.
     * @param balance
     *           the value of the rest of the amount of money in the account.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API
    /**
     *  Deposits a certain amount of money
     *  in the Account.
     * @param amount
     *          the amount to be deposited
     * @throws Exception
     *          if the amount of money is negative
     */
    public void deposit (double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception( "Negative amount exception");
            }
            else {
                balance += amount;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    /**
     *Withdraws a certain amount of money based on a  valid ssn
     * @param amount
     *          the amount of money to be withdrawn
     * @param ssn
     *          the given ssn
     * @throws Exception
     *          if the ssn is not valid or if the balance
     *          is not sufficient.
     */
    public void withdraw (double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)){
                throw new Exception("Ssn is not valid");
            }
            if (amount > balance) {
                throw new Exception("Insufficient Balance exception");
            }else {
                balance -= amount;
            }
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns account's balance.
     *
     * @return getBalance
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the account's state in string format
     * @return
     *      the string-representation of the state of the account
     */
    public String accountToString() {
        return "{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", holder1='" + holder1 + '\'' +
                ", holder2='" + holder2 + '\'' +
                ", ssn1='" + ssn1 + '\'' +
                ", ssn2='" + ssn2 + '\'' +
                ", balance=" + balance +
                '}';
    }

    /**
     * Checks if the given ssn corresponds to {@link JointAccount#ssn1} or {@link JointAccount#ssn2}
     * @param ssn    the given security number
     * @return
     *      True or False
     */
    private  boolean isSsnValid(String ssn) {
        return this.ssn1.equals(ssn) || this.ssn2.equals(ssn);
    }
}
