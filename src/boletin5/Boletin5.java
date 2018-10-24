
package boletin5;
 //autor : @raguiarperez
public class Boletin5 {

    public static void main(String[] args) {

        
        Conta cuenta1 = new Conta();
        cuenta1.setName("Julio");
        cuenta1.setIban("983895499559");
        cuenta1.setAccountBalance(500d);
        
        Conta cuenta2 = new Conta("Andres perez","66555545666",200d);
        
        cuenta1.show();
        
        cuenta2.show();
        
        cuenta1.transfer(cuenta2, 100d);
        
        cuenta1.show();
        
        cuenta2.show();
        
        cuenta2.transfer(cuenta1, 400d);
         cuenta1.show();
        
        cuenta2.show();
        
    }
    
}