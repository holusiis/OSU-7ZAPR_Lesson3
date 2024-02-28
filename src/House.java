public class House {
    public String owner;
    public int price;
    public Room room1;
    public Room room2;
    public Room room3;
    public Room room4;
    public int numberOfWindows() {
        //int windows = room1.numberOfWindows + room2.numberOfWindows + room3.numberOfWindows + room4.numberOfWindows;
        //return windows;
        return room1.numberOfWindows + room2.numberOfWindows + room3.numberOfWindows + room4.numberOfWindows;
    }
    public int areaOfTheHouse() {
        //area = room1.areaOfTheRoom() + room2.areaOfTheRoom() + room3.areaOfTheRoom() + room4.areaOfTheRoom();
        //return area;
        return room1.areaOfTheRoom() + room2.areaOfTheRoom() + room3.areaOfTheRoom() + room4.areaOfTheRoom();
    }
    public int areaOfTheFloor(int floor) {
        int area = 0;
        if(room1.floor == floor) {
            //area = area + room1.areaOfTheRoom();
            area += room1.areaOfTheRoom();
        }
        if(room2.floor == floor) {
            //area = area + room2.areaOfTheRoom();
            area += room2.areaOfTheRoom();
        }
        if(room3.floor == floor) {
            //area = area + room3.areaOfTheRoom();
            area += room3.areaOfTheRoom();
        }
        if(room4.floor == floor) {
            //area = area + room4.areaOfTheRoom();
            area += room4.areaOfTheRoom();
        }
        return area;
    }
}
