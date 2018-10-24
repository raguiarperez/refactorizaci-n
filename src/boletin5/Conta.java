
package boletin5;
 //autor : @raguiarperez
public class Conta {
    private String name;
    private String iban;
    private Double accountBalance;

    public Conta() {
    }

    public Conta(String name, String iban, Double accountBalance) {
        this.name = name;
        this.iban = iban;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public boolean deposit(Double cantEuros){
    boolean ok = false;
    if(cantEuros >= 0){
        accountBalance += cantEuros;
        ok = true;
       }
    return ok;
    }
    
    public boolean refound(Double cantEuros){
    boolean ok = false;
        if(cantEuros <= accountBalance && cantEuros > 0){
    accountBalance -= cantEuros;
    ok = true;
    }
    return ok;
    }
    
    public void transfer(Conta bankAccount,Double importe){
        if(this.refound(importe)){
        
        bankAccount.deposit(importe);
        
        
        
        }}
    
        public void show(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Titular de la cuenta : "+ this.getName());
        System.out.println("Numero de cuenta     : " + this.getIban());
        System.out.println("Saldo de la cuenta   : "+ this.getAccountBalance());
        System.out.println("----------------------------------------------------------------\n");
    }
    
}