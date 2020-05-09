package business;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;


/*
public class TimerTaskMaker extends Observable{
	

	    Timer timer;
	    int seconds;


	    class NotifyTask extends TimerTask{

	        @Override
	        public void run() {
	        setChanged();
	        notifyObservers();
	        }
	    }

	    public TimerTaskMaker( ) {
	        timer = new Timer(); 
	    }

	    public void schedule(long seconds){
	        timer.scheduleAtFixedRate(new NotifyTask(), 0, seconds*15); //delay in milliseconds

	    }

	    public void stop(){
	    timer.cancel();
	    }

	    public static void main(String args[]) throws InterruptedException {
	        IntermeddiateObserver observer1 = new IntermeddiateObserver();

	        TimerTaskMaker watchDog = new TimerTaskMaker();
	        watchDog.addObserver(observer1);

	        System.out.println("WatchDog is scheduled.");
	        watchDog.schedule(5);
	        Thread.sleep(25000);

	        watchDog.stop();
	    }
	

}*/
