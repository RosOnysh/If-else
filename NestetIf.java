package iIElse;

public class NestetIf {
    int engine;
    int doors;


    NestetIf(int engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }

}

 class NestetIfTest{
     public static void main(String[] args) {
         NestetIf nif1 = new NestetIf(3, 4);
         NestetIf nif2 = new NestetIf(2, 5);

         if (nif1.engine > nif2.engine){
             if(nif1.doors > nif2.doors){
                 System.out.println("Мощность мотора и количество дверей у первой машины больше ");
             }
             else{
                 System.out.println("Мощность мотора первой машины больше,количество дверей меньше ");
             }
         }
         else {
             System.out.println("Мощность мотора первой машины меньше ");
         }

     }
 }
