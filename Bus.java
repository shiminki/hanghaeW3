class Bus extends Vehicle {
    private int fare, totFare;

    public Bus() {
        this(1000, 30);
    }
    
    public Bus(int fare, int capacity) {
        super();
        this.fare = fare;
        this.totFare = 0;
        setCapacity(capacity);
        startRide();
    }
    void startRide() {
        // no passenger at the start of the ride
        setPassengerNum(0);
        setState("¿îÇà");
    }
    void changeVelocity(int vel) {
        if (getGasAmount() < 10) {
            System.out.println("ÁÖÀ¯°¡ ÇÊ¿äÇÕ´Ï´Ù!");
        }
        setVelocity(vel);
    }
    void changeState() {
        if (getState().equals("¿îÇà")) {
            setState("Â÷°íÁö Çà");
            setPassengerNum(0);
            this.totFare = 0;
        } else {
            setState("¿îÇà");
        }
        if (getGasAmount() < 10) {
            System.out.println("ÁÖÀ¯°¡ ÇÊ¿äÇÕ´Ï´Ù!");
        }
    }
    void addPassenger() {
        addPassenger(1);
    }
    void addPassenger(int num) {
        if (getPassengerNum() + num <= getCapacity() && getState().equals("¿îÇà")) {
            setPassengerNum(getPassengerNum() + num);
            totFare += num * fare;
            System.out.println(String.format("ÃÑ ½Â°´ ¼ö: %d. ÃÑ ¿ä±Ý: %d", getPassengerNum(), this.totFare));
        } else {
            System.out.println("½Â°´ Å¾½Â ºÒ°¡!\n");
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("¹ö½º Á¤º¸: \n"));
        sb.append(String.format("Bus ID: %d\n", getID()));
        sb.append(String.format("ÁÖÀ¯·®: %d \n", getGasAmount()));
        sb.append(String.format("¼Óµµ: %d\n", getVelocity()));
        sb.append(String.format("»óÅÂ: %s\n", getState()));
        sb.append(String.format("Å¾½Â ½Â°´¼ö: %d ¸í\n", getPassengerNum()));
        sb.append(String.format("ÀÜ¿© ½Â°´¼ö: %d ¸í\n", getCapacity() - getPassengerNum()));
        sb.append(String.format("ÃÑ ¿ä±Ý: %d ¿ø\n", this.totFare));
        return sb.toString();
    }
}