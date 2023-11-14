import java.util.Scanner;

public class Valuta {
    double mengde;
    public Valuta(double amount){
        mengde=amount;
    }

    public double omgjoerValuta(int nummerValuta){

        double verdiIKr=switch(nummerValuta)
        {
            case 1->8*this.mengde;
            case 2->9*this.mengde;
            case 3->0.97*this.mengde;
            case 4->0.073*this.mengde;
            default->-1;
        };
        return verdiIKr;
    }

    public static void output(){
        String[] valutaer={"dollar","euro","svenske kroner","japansk yen"};

        System.out.println("Velg valuta");

        for(int i=1;i<=valutaer.length+1;i++){
            if(i>valutaer.length){
                System.out.println(i+": Avslutt");
            }else{
                System.out.println(i+": "+valutaer[i-1]);
            }
        }
    }

    public static void main(String[] args){
        int valgtValuta=0;
        Scanner in=new Scanner(System.in);
        while(valgtValuta!=5){
            output();

            valgtValuta=in.nextInt();

            System.out.println("Skriv inn mengde du vil konvertere til norske kroner(desimaltall): ");
            double valgtMengde=in.nextDouble();
            
            Valuta exchange=new Valuta(valgtMengde);

            if (valgtValuta==5){
                System.out.println("Avslutter...");
                break;
            }
            
            double verdiNOK=exchange.omgjoerValuta(valgtValuta);

            System.out.println("Din valgte valuta i norske kroner er: "+verdiNOK);
        }
        in.close();
    }
}
