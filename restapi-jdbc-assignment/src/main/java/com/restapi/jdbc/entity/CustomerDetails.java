package com.restapi.jdbc.entity;

import java.util.Date;

public class CustomerDetails {

    //o.order_number,o.order_date, ov.model_name,ov.trim_name,ov.engine_designation,
    // te.wheel_type,te.effective_date,te.headlight_type,te.infotainment_type,te.upholstery_type

    private int order_number;
    private Date order_date;
    private String model_name;
    private String trim_name;
    private String engine_designation;
    private String wheel_type;
    private Date effective_date;
    private String headlight_type;
    private String infotainment_type;
    private String upholstery_type;

    public CustomerDetails(){}

    public CustomerDetails(int order_number, Date order_date, String model_name, String trim_name, String engine_designation, String wheel_type, Date effective_date, String headlight_type, String infotainment_type, String upholstery_type) {
        this.order_number = order_number;
        this.order_date = order_date;
        this.model_name = model_name;
        this.trim_name = trim_name;
        this.engine_designation = engine_designation;
        this.wheel_type = wheel_type;
        this.effective_date = effective_date;
        this.headlight_type = headlight_type;
        this.infotainment_type = infotainment_type;
        this.upholstery_type = upholstery_type;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getTrim_name() {
        return trim_name;
    }

    public void setTrim_name(String trim_name) {
        this.trim_name = trim_name;
    }

    public String getEngine_designation() {
        return engine_designation;
    }

    public void setEngine_designation(String engine_designation) {
        this.engine_designation = engine_designation;
    }

    public String getWheel_type() {
        return wheel_type;
    }

    public void setWheel_type(String wheel_type) {
        this.wheel_type = wheel_type;
    }

    public Date getEffective_date() {
        return effective_date;
    }

    public void setEffective_date(Date effective_date) {
        this.effective_date = effective_date;
    }

    public String getHeadlight_type() {
        return headlight_type;
    }

    public void setHeadlight_type(String headlight_type) {
        this.headlight_type = headlight_type;
    }

    public String getInfotainment_type() {
        return infotainment_type;
    }

    public void setInfotainment_type(String infotainment_type) {
        this.infotainment_type = infotainment_type;
    }

    public String getUpholstery_type() {
        return upholstery_type;
    }

    public void setUpholstery_type(String upholstery_type) {
        this.upholstery_type = upholstery_type;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "order_number=" + order_number +
                ", order_date=" + order_date +
                ", model_name='" + model_name + '\'' +
                ", trim_name='" + trim_name + '\'' +
                ", engine_designation='" + engine_designation + '\'' +
                ", wheel_type='" + wheel_type + '\'' +
                ", effective_date=" + effective_date +
                ", headlight_type='" + headlight_type + '\'' +
                ", infotainment_type='" + infotainment_type + '\'' +
                ", upholstery_type='" + upholstery_type + '\'' +
                '}';
    }
    //     return String.format("\nCustomerDetails [customer_number=%s, forename=%s, surname=%s, telephone_number=%s]", customer_number, forename, surname, telephone_number);

}
