abstract class Vehicle {
    private final int ID;
    private int velocity, gasAmount;
    private String currentState;
    private int capacity, passengerNum;

    public Vehicle() {
        this.ID = hashCode();
        gasAmount = 100;
        velocity = 0;
    }
    abstract void startRide();
    abstract void changeVelocity(int vel);
    
    void changeGasAmount(int change) {
        setGasAmount(getGasAmount() + change);

        if (getGasAmount() >= 10)
            System.out.println(String.format("주유량: %d\n", getGasAmount()));
        else
            System.out.println(String.format("주유량: %d - 주유가 필요합니다!\n", getGasAmount()));
    }

    // Getters and Setter

    int getID() {
        return this.ID;
    }
    void setVelocity(int v) {
        this.velocity = v;
    }
    int getVelocity() {
        return this.velocity;
    }
    void setGasAmount(int g) {
        this.gasAmount = g;
    }
    int getGasAmount() {
        return this.gasAmount;
    }
    void setState(String s) {
        this.currentState = s;
    }
    String getState() {
        return this.currentState;
    }
    void setCapacity(int cap) {
        this.capacity = cap;
    }
    int getCapacity() {
        return this.capacity;
    }
    void setPassengerNum(int num) {
        this.passengerNum = num;
    }
    int getPassengerNum() {
        return this.passengerNum;
    }
}