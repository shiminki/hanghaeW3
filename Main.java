public class Main {
    public static void main(String[] args) {
        // Bus Testing

        System.out.println("버스 테스팅!\n");

        Bus bus1 = new Bus(), bus2 = new Bus();
        System.out.println("두 버스 인스턴스의 ID 값:");
        System.out.println(bus1.getID() + " " + bus2.getID() + "\n");

        
        System.out.println("새로운 버스 생성");
        Bus bus = new Bus();
        System.out.println(bus);

        
        System.out.println("승객 탑승");
        bus.addPassenger(2);
        System.out.println(bus);

        
        System.out.println("기름 사용");
        bus.changeGasAmount(-50);
        System.out.println(bus);

        System.out.println("버스 상태 바뀌고 주유");
        bus.changeState();
        bus.changeGasAmount(10);
        System.out.println(bus);

        System.out.println("버스 상태 바뀜");
        bus.changeState();
        System.out.println(bus);

        System.out.println("승객 탑승");
        bus.addPassenger(45);
        bus.addPassenger(5);
        System.out.println(bus);

        System.out.println("기름 사용");
        bus.changeGasAmount(-55);
        System.out.println(bus);


        // Taxi Testing
        System.out.println();
        System.out.println("택시 테스팅!\n");

        Taxi taxi1 = new Taxi(), taxi2 = new Taxi();

        System.out.println("두 버스 인스턴스의 ID 값:");
        System.out.println(taxi1.getID() + " " + taxi2.getID() + "\n");

        Taxi taxi = new Taxi();
        System.out.println("승객 탑승");
        taxi.addPassenger(2, "서울역", 2);

        System.out.println("기름 사용");
        taxi.changeGasAmount(-80);

        System.out.println("승객 탑승");
        taxi.addPassenger(5, "용산역", 5);

        System.out.println("승객 탑승");
        taxi.addPassenger(3, "구로다지털단지역", 12);

        System.out.println("기름 사용");
        taxi.changeGasAmount(-20);
    }
}
