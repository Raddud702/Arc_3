public abstract class Vehicle{
       protected int topSpeed;
       private String make;


       public Vehicle(int topSpeed, String make){
              this.make = make;
              this.topSpeed = topSpeed;
       }

       public String getMake(){
              return make;
       }

       public abstract String Wheels();


       public Vehicle(int topSpeed, String make){
              this.make = make;
              this.topSpeed = topSpeed;
       }

       public String getMake(){
              return make;
       }

       @Override
       public String toString(){
              return Wheels();
       }
}