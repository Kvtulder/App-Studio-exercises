class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      //a.fly(); Animals cannot fly! There is no fly method in the animal class.

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      //System.out.println(b.numberOfKills); Only eagles can kill! Eagles inherits the properties of birds, not the other way around
      b.talk();
      //b.attack(); same as number of kills

      Eagle e = new Eagle();
      //System.out.println(e.numberOfKills); number of kills is private, not public
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();

   }
}
