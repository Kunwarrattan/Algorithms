package packages.algo.java.program.designpattern.statepattern;

//Purpose: Allow an object to alter its behavior when its internal state changes.
//Use Case: ATM Machines, TCP connection states, media players, UI toggles
// State interface
interface State {
    void handle(Context context);
}

// Concrete States
class StartState implements State {
    public void handle(Context context) {
        System.out.println("Player is in Start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

class StopState implements State {
    public void handle(Context context) {
        System.out.println("Player is in Stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}

// Context class
class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

public class TestStatePattern {
    public static void main(String[] args) {
        Context context = new Context();

        StartState start = new StartState();
        start.handle(context);
        System.out.println("Current State: " + context.getState());

        StopState stop = new StopState();
        stop.handle(context);
        System.out.println("Current State: " + context.getState());
    }
}