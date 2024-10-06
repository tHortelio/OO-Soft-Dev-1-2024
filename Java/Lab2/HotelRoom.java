package com.mycompany.lab2.oosoftdev;

/**
 *
 * @author Lucas Hortelio
 */
public class HotelRoom {
    
    //private variables
    private int roomNumber;
    private String roomType;
    private int vacant;
    private double rate;
    
    //constructors
    public HotelRoom(){
        setRoomNumber(0);
        setRoomType("");
    }
    
    public HotelRoom(int roomNumber, String roomType){
        setRoomNumber(roomNumber);
        setRoomType(roomType);
    }
    
    //Getter & Setter
    public int getRoomNumber(){        
        return roomNumber;    
    }
    
    public void setRoomNumber(int roomNumber){        
        this.roomNumber = roomNumber;       
    }
    
    public String getRoomType(){        
        return roomType;       
    }
    
    public void setRoomType(String roomType){       
        this.roomType = roomType; 
    }  
    
    public int getVacant(){        
        return vacant;       
    }
    
    public void setVacant(int vacant){       
        this.vacant = vacant; 
    }  
    
    public double getRate(){        
        return rate;       
    }
    
    public void setRate(double rate){       
        this.rate = rate; 
    }  

    
}//end main
