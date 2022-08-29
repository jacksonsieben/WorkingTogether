public class Quacklogist implements Observer {

    public void update(QuackObservable duck){
        System.out.println("Quacklogist: " + duck + " just quacked.");
    }  
    
    public String toString() {
		return "Quackologist";
	}  
}
