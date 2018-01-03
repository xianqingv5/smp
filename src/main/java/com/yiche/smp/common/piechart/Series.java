package com.yiche.smp.common.piechart;

import java.io.Serializable;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Series implements Serializable{
    private static final long serialVersionUID = 6387369569939781856L;

    private String type = "pie";

    private String selectedMode = "single";

    private Label label;

    private LabelLine labelLine;

    private List<PieData>  data;

    public Series(String type, String selectedMode, Label label, LabelLine labelLine, List <PieData> data) {
        this.type = type;
        this.selectedMode = selectedMode;
        this.label = label;
        this.labelLine = labelLine;
        this.data = data;
    }

    public Series() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public LabelLine getLabelLine() {
        return labelLine;
    }

    public void setLabelLine(LabelLine labelLine) {
        this.labelLine = labelLine;
    }

    public List <PieData> getData() {
        return data;
    }

    public void setData(List <PieData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Series{" +
                "type='" + type + '\'' +
                ", selectedMode='" + selectedMode + '\'' +
                ", label=" + label +
                ", labelLine=" + labelLine +
                ", data=" + data +
                '}';
    }
}
