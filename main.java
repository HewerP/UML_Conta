import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Pessoa_Fisica h = new Pessoa_Fisica(1,"h","h","1");
        Conta a = new Conta_Corrente(1,h);
        Conta b = new Conta_Corrente(2,h);

        a.addSaldo(1000);
        a.addSaldo(-500);
        System.out.println(a.getSaldo());
        for (Object array: a.getExtrato()) {
            System.out.println(a.getExtrato());
        }
        System.out.println();
    }
}
