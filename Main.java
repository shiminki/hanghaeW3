public class Main {
    public static void main(String[] args) {
        // Bus Testing

        System.out.println("���� �׽���!\n");

        Bus bus1 = new Bus(), bus2 = new Bus();
        System.out.println("�� ���� �ν��Ͻ��� ID ��:");
        System.out.println(bus1.getID() + " " + bus2.getID() + "\n");

        
        System.out.println("���ο� ���� ����");
        Bus bus = new Bus();
        System.out.println(bus);

        
        System.out.println("�°� ž��");
        bus.addPassenger(2);
        System.out.println(bus);

        
        System.out.println("�⸧ ���");
        bus.changeGasAmount(-50);
        System.out.println(bus);

        System.out.println("���� ���� �ٲ�� ����");
        bus.changeState();
        bus.changeGasAmount(10);
        System.out.println(bus);

        System.out.println("���� ���� �ٲ�");
        bus.changeState();
        System.out.println(bus);

        System.out.println("�°� ž��");
        bus.addPassenger(45);
        bus.addPassenger(5);
        System.out.println(bus);

        System.out.println("�⸧ ���");
        bus.changeGasAmount(-55);
        System.out.println(bus);


        // Taxi Testing
        System.out.println();
        System.out.println("�ý� �׽���!\n");

        Taxi taxi1 = new Taxi(), taxi2 = new Taxi();

        System.out.println("�� ���� �ν��Ͻ��� ID ��:");
        System.out.println(taxi1.getID() + " " + taxi2.getID() + "\n");

        Taxi taxi = new Taxi();
        System.out.println("�°� ž��");
        taxi.addPassenger(2, "���￪", 2);

        System.out.println("�⸧ ���");
        taxi.changeGasAmount(-80);

        System.out.println("�°� ž��");
        taxi.addPassenger(5, "��꿪", 5);

        System.out.println("�°� ž��");
        taxi.addPassenger(3, "���δ����д�����", 12);

        System.out.println("�⸧ ���");
        taxi.changeGasAmount(-20);
    }
}
