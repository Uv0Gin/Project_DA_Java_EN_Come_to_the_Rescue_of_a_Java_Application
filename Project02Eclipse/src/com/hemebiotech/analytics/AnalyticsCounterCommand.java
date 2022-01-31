package com.hemebiotech.analytics;

import com.hemebiotech.analytics.reader.FileSymptomReader;
import com.hemebiotech.analytics.writer.FileSymptomWriter;

public class AnalyticsCounterCommand {

    public static void main(String[] args) {

        new AnalyticsCounter(
                new FileSymptomReader("symptoms.txt"),
                new FileSymptomWriter("result.out")
        ).execute();

    }

}
