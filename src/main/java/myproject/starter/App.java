package myproject.starter;

import java.util.Date;
import java.util.Timer;

import myproject.job.ScheduleTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("App.main() start :: App is started at ::"+new Date());
    	Timer timer = new Timer();
//    	timer.schedule(new ScheduleTask(), 2000,3000);
    	timer.schedule(new ScheduleTask(), new Date(122, 10, 26, 10, 50, 00));
    	
    	System.out.println("End of main() -- App is Ended at "+new Date());
    }
}
