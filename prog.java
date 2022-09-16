public class AyeshaSabir{
     
     String name;

     AyeshaSabir(){
       this.name = " Ayesha Sabir Hussain";
     }

     void tableWithForLoop(){

        for(int i=1; i<=10; i++){
            System.out.println("Table of " + i);
            System.out.println(" ");
            for(int j=1; j <=10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println(" ");
            System.out.println("------------------------");
            System.out.println("------------------------");

        }
      System.out.println(this.name);

     }

    void tablewithWhileLoop(){
        int i=1;
        while(i<=10)
        {
            System.out.println("Table of " + i);
            System.out.println(" ");
            int j=1;

            while(j <=10)
            {
                System.out.println(i + " x " + j + " = " + i*j);
                j++; // j = j + 1
            }
            System.out.println(" ");
            System.out.println("------------------------");
            System.out.println("------------------------");
            i++;

    }
    }

public static void main(String args[]){
    AyeshaSabir table = new AyeshaSabir();
    System.out.println(table.name) ;
    // table.tableWithForLoop();
    table.tablewithWhileLoop();

}
}


