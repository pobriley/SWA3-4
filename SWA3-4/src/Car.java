
public class Car {
	
	    private String color;
	    private int max_Speed; 
	    public void carDetails(){
	        System.out.println("Car Color= "+color + "; Max Speed= " + max_Speed);
	    }
	    //set car color
	    public void setColor(String color) {
	        this.color = color;
	    }
	    //set car max_Speed
	    public void setMaxSpeed(int max_Speed) {
	        this.max_Speed = max_Speed;
	    }
	}
