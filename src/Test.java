import java.util.*;



interface Cycle {
    void ride ();

}

class Unicycle implements Cycle {
    public void ride() {
        System.out.print("I got one wheels bitch");
    }
}

class Bicycle implements Cycle {
    public void ride() {
        System.out.print("I got two wheels bitch");
    }
}

class Tricycle implements Cycle {
    public void ride() {
        System.out.print("I got three wheels bitch");
    }
    public void wheels() {
        System.out.println("Tricle wheels");
    }
}



/**
 * @version 1.0
 * @author Luke Ding
 */
public class Test {

    Test () {
        System.out.println("Constructed!");
    }

    public static int x = 4;
    public static int y;
    public String[] longstring = new String[] {"Hello!", "I AM"};

    static  {
        y = 5;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Unicycle one = new Unicycle();
        one.ride();
        Bicycle two = new Bicycle();
        two.ride();
        Tricycle three = new Tricycle();
        three.ride();

        Cycle[] list = new Cycle [] {one,two,three};

        
    }

}
