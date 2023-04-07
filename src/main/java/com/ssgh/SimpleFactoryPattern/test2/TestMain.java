package com.ssgh.SimpleFactoryPattern.test2;

public class TestMain {
    public static void main(String[] args) {
        Chart lineChart = ChartFactory.getChart("pie");
        lineChart.display();
    }
}
