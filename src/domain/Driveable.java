package domain;

public interface Driveable {

    String start();
    String stop();
    String alert();

}


// klasse "implements" interface (kan ook meerdere interfaces implementeren)
// The definition of driveable is able to be driven.
// alle velden zijn default public static final
// geen constructor
// abstracte methodes