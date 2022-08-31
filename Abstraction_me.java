
abstract class elequence{
    abstract  void speak();
    abstract  void howl();
    abstract  void scream();
}

class fibb extends elequence{

    String Candidate;
    int Age;
    int IQ;

    fibb(String name, int age, int IQ){
        this.Candidate = name;
        this.Age = age;
        this.IQ = IQ;
    }

    public void speak(){
        System.out.println("Hey I Can speak gently");
    }

    public void scream(){
        System.out.println("But I yells when I am angry!!!");
    }

     public void howl(){
        System.out.println("If I am an animal I will HOWL at my best, HUH !!!");
    }




}

class Driver {
        public static void main(String args[]){
    elequence newBorn = new fibb("mandy", 18, 12);
    newBorn.howl();
}
}



