package boletin5;
//autor : @raguiarperez

public class Conta {

    private String nombre;
    private String iban;
    private Double Balance;

    public Conta() {
    }

    public Conta(String name, String iban, Double accountBalance) {
        this.nombre = name;
        this.iban = iban;
        this.Balance = accountBalance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    public boolean deposit(Double cantEuros) {
        boolean ok = false;
        if (cantEuros >= 0) {
            Balance += cantEuros;
            ok = true;
        }
        return ok;
    }

    public boolean refound(Double cantEuros) {
        boolean ok = false;
        if (cantEuros <= Balance && cantEuros > 0) {
            Balance -= cantEuros;
            ok = true;
        }
        return ok;
    }

    public void transfer(Conta bankAccount, Double importe) {
        if (this.refound(importe)) {

            bankAccount.deposit(importe);

        }
    }

    public void show() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Titular de la cuenta : " + this.getNombre());
        System.out.println("Numero de cuenta     : " + this.getIban());
        System.out.println("Saldo de la cuenta   : " + this.getBalance());
        System.out.println("----------------------------------------------------------------\n");
    }

}
