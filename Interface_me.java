interface deen{
    void Jihad();
    int EmaanLevel();
}

class life implements deen{
    String Name;
    int SalahPraying;
    Boolean doesReciteQuranDaily;
    Boolean isPerformingHuqooq;

    life(String name, int Salah, Boolean doesReciteQuranDaily, Boolean isPerformingHuqooq){
        this.Name = name;
        this.SalahPraying =Salah;
        System.out.println("BEING MUSLIMS");
        if (Salah < 5){
            System.out.print(name +" needs to work to fulfill the farz salah ");
        } else if (Salah == 5) {
            System.out.print("Masha Allah brother "+ name +" you need work on nawafil now in order to get more intense relation with Allah!!");
        } else if (Salah > 5) {
            System.out.print("Bruh " +name+ " Masha Allah go ahead it a whole life to spent with istiqamat");
        }

        if (isPerformingHuqooq){
            System.out.println("Alhumdulillah u r trying hard to give huqooq! Brother be conciuos");
        } else {
            System.out.println("Work hard and dont eat up others huqooq otherwise you must cost your deeds in return");
        }
        
        if (doesReciteQuranDaily){
            System.out.println("Alhumdulillah Reciting Quran regularly! Brother now head towards the implementation of it");
        } else{
            System.out.println("If You are not holding the wire from ALLAH, Higher chance that you will get eaten by satan and nafs");
        }
    }

    public void Jihad(){
        System.out.println("Do the Jihad untill you reach the grave with Quran against Evil(nafs,Sharrin naas and the System of shar)");
    
    }

    public int EmaanLevel(){
        System.out.println("IMAM Bukhari(R.A) said: 'The Level of Emaan varies weather it arises or it falls'");
        return 1;
    }


}

class live {
    public static void main(String args[]){
    deen life = new life("Rafay", 4, true, true);
    life.EmaanLevel();
    life.Jihad();
    }
}