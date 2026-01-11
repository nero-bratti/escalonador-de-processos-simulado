public class Process {
    //base variables
    private EState state;
    private String name;
    private int timeSurge;
    private int timeIO;
    private int timeTotal;
    private int order;
    private int priority;

    //auxiliary variables
    private int timeExecuted;
    private int timeIOExecuted;

    //constructor
    public Process(EState state, String name, int timeSurge, int timeIO, int timeTotal, int order, int priority, int timeExecuted, int timeIOExecuted) {
        this.state = state;
        this.name = name;
        this.timeSurge = timeSurge;
        this.timeIO = timeIO;
        this.timeTotal = timeTotal;
        this.order = order;
        this.priority = priority;
        this.timeExecuted = timeExecuted;
        this.timeIOExecuted = timeIOExecuted;
    }

    //getters and setters
    public EState getState() {
        return state;
    }

    public void setState(EState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getTimeSurge() {
        return timeSurge;
    }

    public int getTimeIO() {
        return timeIO;
    }

    public int getTimeTotal() {
        return timeTotal;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    public int getTimeExecuted() {
        return timeExecuted;
    }

    public void setTimeExecuted(int timeExecuted) {
        this.timeExecuted = timeExecuted;
    }

    public int getTimeIOExecuted() {
        return timeIOExecuted;
    }

    public void setTimeIOExecuted(int timeIOExecuted) {
        this.timeIOExecuted = timeIOExecuted;
    }
}
