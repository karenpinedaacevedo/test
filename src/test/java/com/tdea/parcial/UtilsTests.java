package com.tdea.parcial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.v85.heapprofiler.model.LastSeenObjectId;

import javax.swing.*;

public class UtilsTests {

    @Test
    public void ShouldNight() {

        int hour = 4;
        Assertions.assertEquals("Night",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldMorning() {

        int hour = 8;
        Assertions.assertEquals("Morning",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldAfternoon() {

        int hour = 15;
        Assertions.assertEquals("Afternoon",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldEvening() {

        int hour = 23;
        Assertions.assertEquals("Evening",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldInvalidHour() {

        int hour = 27;
        Assertions.assertEquals("Invalid hour",Utils.getTimeOfDay(hour));

    }

}
