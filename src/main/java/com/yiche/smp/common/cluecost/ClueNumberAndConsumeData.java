package com.yiche.smp.common.cluecost;

public class ClueNumberAndConsumeData {
    private double[] data;
    private String name;
    private String type;
    private Integer yAxisIndex;

    public ClueNumberAndConsumeData() {
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }
}
