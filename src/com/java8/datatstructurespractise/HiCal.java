package com.java8.datatstructurespractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java8.interfaces.CalculateSeconds;

public class HiCal {

	public static void main(String[] args) {
		Meeting meeting1 =  new Meeting(2, 3);
		Meeting meeting2 =  new Meeting(8, 9);
		
		Meeting meeting3 =  new Meeting(1, 3);
		
		returnAvailableTime(meeting1,meeting2,meeting3);
		
	}
	
	public static List<Meeting> returnAvailableTime (Meeting ...bookedMeetings){
		List<Integer> meetingSeconds =  new ArrayList<Integer>();
		
		for(Meeting m:bookedMeetings) {
			meetingSeconds.addAll(calculateMeetingSeconds((bm) -> {
				List<Integer> bmSeconds =  new ArrayList<>();
				bmSeconds.add(bm.getStartTime()*30);
				bmSeconds.add(bm.getEndTime()*30);
				return bmSeconds;
			}, m));
		}
		
		Collections.sort(meetingSeconds, (m1,m2) -> m1.compareTo(m2));
		System.out.println(meetingSeconds);
		return null;
	}
	
	public static List<Integer> calculateMeetingSeconds(CalculateSeconds calculateSeconds, Meeting meeting) {
		return calculateSeconds.returnSecondsList(meeting);
	}
}

