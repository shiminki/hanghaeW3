# hanghaeW3

# Vehicle.java

Bus 와 Taxi class 모두 Vehicle 이라는 abtract class 에서 상속을 받았습니다. 두개의 class 의 겹치는 필드/메소드와 getter/setter 를 입력했습니다.

각 인스턴스의 ID 는 그 오브젝트의 hashCode() 값으로 삼았습니다. 그 이유는, global 하게 모든 오브젝의 ID 를 unique 한 값으로 지정할라면 그 오브젝의 hashCode 가 제일 간단하게 이를 시행할수 있다고 생각이 들었습니다.


# Bus.java

Bus.java 에서는 버스의 기본적인 기능을 구현했습니다. startRide() 는 운행 시작이고, 그 외 속도값 변화, 상태값 변화, 그리고 승객 탑승까지 구현했습니다. 그리고 디버깅 용도로 toString() 메소드를 override 했습니다. toString() 을 override 하면서, 버스 인스턴스의 필드값을 한눈에 알아보기 위해서 했습니다.


# Taxi.java

Taxi.java 는 Bus.java 보다 기능이 추가적으로 더 있습니다. 그 이유는, 버스와 달리 도착지, 도착지 거리, 그리고 그에 따라 변하는 요금까지 계산을 해야하기 때문입니다. 그래서 Bus.java 의 startRide 메소드와 달리, Taxi.java 에서는 startRide 가 목적지와 목적지까지의 거리를 parameter 로 input 받습니다. Taxi.java 도 Bus.java 같이 toString 메소드를 override 해서 디버깅하기 쉽게 했습니다.
