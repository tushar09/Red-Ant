/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;

/**
 *
 * @author Tushar
 */
public class Weather {

    public String getWeatherReport() {
        WeatherDoc doc = new WeatherDoc("1915035", "c");
        WeatherDisplay disp = new WeatherDisplay();
        StringBuilder sb = new StringBuilder(64);
        sb.append("<html>Today sun rised at " + disp.getSunrise()).
                append(" Current temperature is: " + disp.getTemperature() + disp.getTemperatureUnit()).
                append(" and the condition is " + disp.getCondition()).
                append(" Humidity was " + disp.getHumidity() + "%").
                append(" Visibility " + disp.getVisibility() + disp.getDistanceUnit()).
                append(" wind speed " + disp.getWindSpeed() + disp.getSpeedUnit()).
                append(" and the the pressure was " + disp.getPressure() + disp.getPressureUnit() + "</html>");
        return (sb.toString()
                //                "Today sun rised at " + disp.getSunrise()
                //                + "\n" + "Current temperature is: " + disp.getTemperature() + disp.getTemperatureUnit()
                //                + "\n" + "and the condition is " + disp.getCondition()
                //                + "\n" + "Humidity was " + disp.getHumidity() + "%"
                //                + "\n" + "and the visibility was " + disp.getVisibility() + disp.getDistanceUnit()
                //                + "\n" + "wind speed " + disp.getWindSpeed() + disp.getSpeedUnit()
                //                + "\n" + "and the the pressure was " + disp.getPressure() + disp.getPressureUnit()
                );

    }
}
