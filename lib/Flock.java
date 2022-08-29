import java.util.*;

/*public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();
    Observable observable;

    public Flock(){
        observable = new Observable(this);
    }
    
    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            notifyObservers();
        }
    }
    
    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
        
    }

    public void notifyObservers(){
        observable.notifyObservers();
    }
}*/

public class Flock implements Quackable {
	List<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}

