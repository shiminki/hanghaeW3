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
        setState("일반");
    }
    void startRide() {
        System.out.println("목적지를 입력하세요!");
    }
    void startRide(String destination, int distToDest) {
        if (getGasAmount() >= 10 && getState().equals("일반")) {
            setState("운행 중");
            this.destination = destination;
            this.distToDest = distToDest;
            this.fare = defaultFare;
            if (distToDest > defaultDist) {
                this.fare += farePerDist * (distToDest - defaultDist);
            }
            System.out.println(String.format("%s 까지의 운행정보:", this.destination));

            makePayment();
            this.totFare += fare;
            
            System.out.println(String.format("총 승객 수: %d. 총 요금: %d. 누적 금액: %d", getPassengerNum(), this.fare, this.totFare));
            System.out.println(this);
            endRide();
        }
        else {
            setState("운행 중");
            System.out.println("탑승불가!");
        }
    }
    void changeVelocity(int vel) {
        if (getGasAmount() < 10) {
            System.out.println("주유가 필요합니다!");
        }
        setVelocity(vel);
    }
    void changeState() {
        if (getState().equals("운행 중")) {
            setState("일반");
            setPassengerNum(0);
        } else {
            setState("운행 중");
        }
        if (getGasAmount() < 10) {
            System.out.println("주유가 필요합니다!");
        }
    }
    void addPassenger(String destination, int distToDest) {
        addPassenger(1, destination, distToDest);
    }
    void addPassenger(int num, String destination, int distToDest) {
        if (getPassengerNum() + num <= getCapacity() && getState().equals("일반")) {
            setPassengerNum(getPassengerNum() + num);
            startRide(destination, distToDest);
        } else if (getState().equals("운행 중"))
            System.out.println("택시가 운행중입니다!\n");
        else {
            System.out.println("승객 탑승 불가!\n");
        }
    }
    
    void endRide() {
        this.fare = 0;
        setState("일반");
        setPassengerNum(0);
    }
    void makePayment() {
        System.out.println(String.format("총 요금은 %d 원 입니다!", this.fare));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("택시 정보: \n"));
        sb.append(String.format("Taxi ID: %d\n", getID()));
        sb.append(String.format("주유량: %d \n", getGasAmount()));
        sb.append(String.format("속도: %d\n", getVelocity()));
        sb.append(String.format("상태: %s\n", getState()));
        sb.append(String.format("기본요금: %d 원\n", this.defaultFare));
        sb.append(String.format("기본거리 이외 거리당 추가요금: %d 원/km\n", this.farePerDist));
        sb.append(String.format("총 요금: %d 원\n", this.totFare));
        return sb.toString();
    }
}
