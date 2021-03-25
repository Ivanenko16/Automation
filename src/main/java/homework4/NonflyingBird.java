package homework4;

public interface NonflyingBird {

     void nonFly();
     default void layEggs(){
          System.out.println("I am laying eggs now");
     }
}

