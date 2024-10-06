package com.mycompany.lab2.oosoftdev;

/**
 *
 * @author Lucas Hortelio
 */
public class HotelDriver {
    
    public static void main(String[]args){
        
        HotelRoom roomA = new HotelRoom();
        
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        
        HotelRoom roomB = new HotelRoom(201, "Double");
        
        System.out.println("RoomNumber: " + roomA.getRoomNumber() + " and Room Type: " + roomA.getRoomType());
        
        System.out.println("RoomNumber: " + roomB.getRoomNumber() + " and Room Type: " + roomB.getRoomType());
        
        roomA.setVacant(1);
        roomA.setRate(100);
        
        roomB.setVacant(0);
        roomB.setRate(80);
        
        
    }//end main
    
}//end class
