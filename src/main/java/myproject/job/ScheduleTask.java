package myproject.job;

import java.util.Date;
import java.util.TimerTask;

public class ScheduleTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Sales report on ::"+new Date());
	}

}
