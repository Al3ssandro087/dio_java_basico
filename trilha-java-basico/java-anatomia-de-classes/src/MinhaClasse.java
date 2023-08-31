public class MinhaClasse {
   
public static void main (String [] args) {

    String primeiroNome = "Alessandro";
    String segundoNome = "Andrade";

    String nomeCompletp = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompletp);
    
}
 public static String nomeCompleto (String primeirroNome, String segundoNome){
    return primeirroNome.concat(" ").concat(segundoNome);
 }
}
