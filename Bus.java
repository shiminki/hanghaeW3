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
        setState("����");
    }
    void changeVelocity(int vel) {
        if (getGasAmount() < 10) {
            System.out.println("������ �ʿ��մϴ�!");
        }
        setVelocity(vel);
    }
    void changeState() {
        if (getState().equals("����")) {
            setState("������ ��");
            setPassengerNum(0);
            this.totFare = 0;
        } else {
            setState("����");
        }
        if (getGasAmount() < 10) {
            System.out.println("������ �ʿ��մϴ�!");
        }
    }
    void addPassenger() {
        addPassenger(1);
    }
    void addPassenger(int num) {
        if (getPassengerNum() + num <= getCapacity() && getState().equals("����")) {
            setPassengerNum(getPassengerNum() + num);
            totFare += num * fare;
            System.out.println(String.format("�� �°� ��: %d. �� ���: %d", getPassengerNum(), this.totFare));
        } else {
            System.out.println("�°� ž�� �Ұ�!\n");
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("���� ����: \n"));
        sb.append(String.format("Bus ID: %d\n", getID()));
        sb.append(String.format("������: %d \n", getGasAmount()));
        sb.append(String.format("�ӵ�: %d\n", getVelocity()));
        sb.append(String.format("����: %s\n", getState()));
        sb.append(String.format("ž�� �°���: %d ��\n", getPassengerNum()));
        sb.append(String.format("�ܿ� �°���: %d ��\n", getCapacity() - getPassengerNum()));
        sb.append(String.format("�� ���: %d ��\n", this.totFare));
        return sb.toString();
    }
}