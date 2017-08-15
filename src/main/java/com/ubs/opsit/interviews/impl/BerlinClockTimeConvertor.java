/**
 * 
 */
package com.ubs.opsit.interviews.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.util.BerlinClockUtil;
import com.ubs.opsit.interviews.vo.Time;

/**
 * <p>
 * This class is the berlin clock implementation of time convertor
 * </p>
 * 
 * @author sumitsangar
 *
 */
public class BerlinClockTimeConvertor implements TimeConverter {

	private static final Logger LOG = LoggerFactory.getLogger(BerlinClockTimeConvertor.class);

	/**
	 * Method to convert input time into berlin clock time
	 * 
	 * @param String
	 *            aTime
	 * @return String berlinclocktime
	 */
	@Override
	public String convertTime(String aTime) {

		// get request time into object
		Time inpuTime = getRequestTime(aTime);

		// get berlin clock time
		String berlinClockTime = getBerlinClockTime(inpuTime);

		return berlinClockTime;
	}

	/**
	 * Method to convert time string to time object
	 * 
	 * @param aTime
	 * @return Time
	 */
	private Time getRequestTime(String aTime) {

		LOG.info("Input Time String : " + aTime);

		String[] inputTimeArr = aTime.split(":");
		Time inputTime = new Time();
		inputTime.setHours(Integer.parseInt(inputTimeArr[0]));
		inputTime.setMinutes(Integer.parseInt(inputTimeArr[1]));
		inputTime.setSeconds(Integer.parseInt(inputTimeArr[2]));

		return inputTime;
	}

	private String getBerlinClockTime(Time inpuTime) {

		StringBuilder berlinClockTimeString = new StringBuilder();

		berlinClockTimeString.append(BerlinClockUtil.deriveSecondsString(inpuTime.getSeconds())).append("\n");
		berlinClockTimeString.append(BerlinClockUtil.deriveFirstLineHoursString(inpuTime.getHours())).append("\n");
		berlinClockTimeString.append(BerlinClockUtil.deriveSecondLineHoursString(inpuTime.getHours())).append("\n");
		berlinClockTimeString.append(BerlinClockUtil.deriveFirstLineMinutesString(inpuTime.getMinutes())).append("\n");
		berlinClockTimeString.append(BerlinClockUtil.deriveSecondLineMinutesString(inpuTime.getMinutes()));

		LOG.info("Final Berlin Clock Time String : \n" + berlinClockTimeString.toString());

		return berlinClockTimeString.toString();
	}

}
