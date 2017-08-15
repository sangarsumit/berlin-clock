/**
 * 
 */
package com.ubs.opsit.interviews.vo;

/**
 * <p>This class is used to hold the input time to be converted to berlin clock time</p>
 * @author sumitsangar
 *
 */
public class Time {
	
	/**
	 * hold hours value
	 */
	int hours;
	
	/**
	 * hold minutes value
	 */
	int minutes;
	
	/**
	 * hold seconds value
	 */
	int seconds;

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

}
