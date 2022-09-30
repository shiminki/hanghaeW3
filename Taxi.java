class Taxi extends Vehicle {
    private String destination;
    private int defaultDist;
    private int distToDest;
    private int defaultFare, farePerDist;
    private int fare, totFare;

    public Taxi() {
        this(1, 3000, 1000, 4);
    }
    
    public Taxi(int defaultDist, int defaultFare, int farePerDist, int capacity) {
        super();
        setCapacity(capacity);
        setPassengerNum(0);

        this.defaultDist = defaultDist;
        this.defaultFare = defaultFare;
        this.farePerDist = farePerDist;
        this.totFare = 0;
        this.fare = 0;
        setState("�Ϲ�");
    }
    void startRide() {
        System.out.println("�������� �Է��ϼ���!");
    }
    void startRide(String destination, int distToDest) {
        if (getGasAmount() >= 10 && getState().equals("�Ϲ�")) {
            setState("���� ��");
            this.destination = destination;
            this.distToDest = distToDest;
            this.fare = defaultFare;
            if (distToDest > defaultDist) {
                this.fare += farePerDist * (distToDest - defaultDist);
            }
            System.out.println(String.format("%s ������ ��������:", this.destination));

            makePayment();
            this.totFare += fare;
            
            System.out.println(String.format("�� �°� ��: %d. �� ���: %d. ���� �ݾ�: %d", getPassengerNum(), this.fare, this.totFare));
            System.out.println(this);
            endRide();
        }
        else {
            setState("���� ��");
            System.out.println("ž�ºҰ�!");
        }
    }
    void changeVelocity(int vel) {
        if (getGasAmount() < 10) {
            System.out.println("������ �ʿ��մϴ�!");
        }
        setVelocity(vel);
    }
    void changeState() {
        if (getState().equals("���� ��")) {
            setState("�Ϲ�");
            setPassengerNum(0);
        } else {
            setState("���� ��");
        }
        if (getGasAmount() < 10) {
            System.out.println("������ �ʿ��մϴ�!");
        }
    }
    void addPassenger(String destination, int distToDest) {
        addPassenger(1, destination, distToDest);
    }
    void addPassenger(int num, String destination, int distToDest) {
        if (getPassengerNum() + num <= getCapacity() && getState().equals("�Ϲ�")) {
            setPassengerNum(getPassengerNum() + num);
            startRide(destination, distToDest);
        } else if (getState().equals("���� ��"))
            System.out.println("�ýð� �������Դϴ�!\n");
        else {
            System.out.println("�°� ž�� �Ұ�!\n");
        }
    }
    
    void endRide() {
        this.fare = 0;
        setState("�Ϲ�");
        setPassengerNum(0);
    }
    void makePayment() {
        System.out.println(String.format("�� ����� %d �� �Դϴ�!", this.fare));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("�ý� ����: \n"));
        sb.append(String.format("Taxi ID: %d\n", getID()));
        sb.append(String.format("������: %d \n", getGasAmount()));
        sb.append(String.format("�ӵ�: %d\n", getVelocity()));
        sb.append(String.format("����: %s\n", getState()));
        sb.append(String.format("�⺻���: %d ��\n", this.defaultFare));
        sb.append(String.format("�⺻�Ÿ� �̿� �Ÿ��� �߰����: %d ��/km\n", this.farePerDist));
        sb.append(String.format("�� ���: %d ��\n", this.totFare));
        return sb.toString();
    }
}
