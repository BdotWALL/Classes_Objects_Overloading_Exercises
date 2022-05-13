public class Animal {
    private String name;
    private String dogOrNot;
    

       public Animal(String animalName, String isADog) {
           this.name = animalName;
           this.dogOrNot = isADog;

       }

//Overloading constructor       
       public Animal(String animalName) {
           this(animalName, "yes");
       }


       public String getName() {
           return name;
       }

       public boolean getDogOrNot(){
            if(dogOrNot.equals( "yes")) {
                return true;
            }else{
                return false;
            }
       }


       @Override
       public String toString(){
           return getName() + " is a dog = " + getDogOrNot();
       }



    
}
