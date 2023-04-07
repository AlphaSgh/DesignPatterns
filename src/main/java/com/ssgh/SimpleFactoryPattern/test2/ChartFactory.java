package com.ssgh.SimpleFactoryPattern.test2;

public class ChartFactory {
    public static Chart getChart(String arg) {
        Chart chart = null;
        if (arg.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        }
        if (arg.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        }
        if (arg.equalsIgnoreCase("line")) {
            chart = new LineChart();
        }
        return chart;
    }
}
