public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.owner = "Jakub Sedlák";
        house.price = 4000000;

        house.room1 = new Room();
        house.room1.length = 4;
        house.room1.width = 4;
        house.room1.type = "Bedroom";
        house.room1.numberOfWindows = 2;
        house.room1.floor = 1;

        house.room2 = new Room();
        house.room2.length = 6;
        house.room2.width = 5;
        house.room2.type = "Living Room";
        house.room2.numberOfWindows = 4;
        house.room2.floor = 0;

        house.room3 = new Room();
        house.room3.length = 4;
        house.room3.width = 5;
        house.room3.type = "Kitchen";
        house.room3.numberOfWindows = 2;
        house.room3.floor = 0;

        house.room4 = new Room();
        house.room4.length = 2;
        house.room4.width = 3;
        house.room4.type = "Bathroom";
        house.room4.numberOfWindows = 1;
        house.room4.floor = 1;

        System.out.println(house.owner + " " + house.price + "Kč " + house.room1.type + " " + house.room2.type + " " + house.room3.type + " " + house.room4.type);
        System.out.println(house.numberOfWindows());
        System.out.println(house.areaOfTheHouse());
        System.out.println(house.areaOfTheFloor(1));
    }
}