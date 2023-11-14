class Spiller{
    int sumPoeng=0;

    public int kastTerning(){
        java.util.Random terning=new java.util.Random();
        int terningkast=terning.nextInt(6)+1;
        return terningkast;
    }

    public int getSumPoeng(){
        return this.sumPoeng;
    }

    public void leggTilPoeng(){
        int kastet=this.kastTerning();
        if (kastet!=1){
            this.sumPoeng=this.sumPoeng+this.kastTerning();
        }else{
            this.sumPoeng=0;
        }
    }

    public boolean erFerdig(){
        if (this.getSumPoeng()>=100){
            return true;
        }else{
            return false;
        }
    }
}


public class opg2 {
    public static void main(String[] args){
        int runde=1;
        Spiller spiller1=new Spiller();
        Spiller spiller2=new Spiller();

        boolean fortsettSpillet=true;

        while(fortsettSpillet){
            spiller1.leggTilPoeng();
            spiller2.leggTilPoeng();

            System.out.println("Runde "+runde+":");
            System.out.println("Spiller 1: "+spiller1.getSumPoeng()+" poeng");
            System.out.println("Spiller 2: "+spiller2.getSumPoeng()+" poeng");
            runde++;

            if (spiller1.erFerdig()){
                fortsettSpillet=false;
                System.out.println("Spiller 1 vant");
            }else if(spiller2.erFerdig()){
                fortsettSpillet=false;
                System.out.println("Spiller 2 vant");
            }
        }
    }
}
