class Flea {

   // Properties of the class...
   private String name;

   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   public String getName()
   {
      return name;
   }

}

class DogOwner
{
   private String name;
   private int salary;
   private Dog ownersDog;

   public DogOwner(String aName, int aSalary, Dog aDog){
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }

   public String toString(){
      return "Name: " + name + ", salary: " + salary + ", dog: " + ownersDog.getName();
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Flea pop = new Flea("Pop");
      Flea squeak = new Flea("squeak");
      Flea zip = new Flea("Zip");

      Dog rex = new Dog("Rex",2,pop);
      Dog jimbo = new Dog("Jimbo",7,squeak);
      Dog fido = new Dog("Fido",4,zip);

      DogOwner angus = new DogOwner("Angus",1000, rex);
      DogOwner brian = new DogOwner("Brian",1000, jimbo);
      DogOwner charles = new DogOwner("Charles",1000, fido);

      System.out.println(angus.toString());
      System.out.println(charles.toString());
      System.out.println(brian.toString());
   }
}

