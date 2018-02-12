class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private int    lenght;

   // Constructor of the class...
   //public Person(String aName, int anAge, int anLenght) {
   //   name = aName;
   //   age  = anAge;
   //  lenght = anLenght;
   //}

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and i'm " + lenght + " centimeters tall");
      commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      else if (age == 5) {
         System.out.println("time to start school");
      }
      else if (age > 60)
      {
         System.out.println("old person");
      }
   }
   // Adds one year to the person's age
   public void growOlder()
   {
      age++;
   }

   // Adds a given amount of years to the person's age
   public void growOlderBy(int years)
   {
      age += years;
   }


   // Adds sir to the person's name
   public void giveKnightHood()
   {
   name = "Sir " + name;
   }


}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();

      System.out.println("Luke Skywalker is " + ls.age + " years old");

      ls.growOlderBy(61);

      wp.growOlder();
      wp.giveKnightHood();

      ls.talk();
      wp.talk();
   }

}

