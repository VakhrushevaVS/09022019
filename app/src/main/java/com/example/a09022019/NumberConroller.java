package com.example.a09022019;

import android.widget.EditText;

public class NumberConroller {
    String displayValue;
    EditText display;
    Boolean error;
    Boolean dot;

    public NumberConroller() {
        displayValue = new String();
        error = false;
        dot = false;
    }

    public void setDisplay(EditText display) {
        this.display = display;
    }

    public void addDigit(int d){
        if ((d>=0)&&(d<=9)&&(displayValue.length()<12)){
            if ((d!=0)||(displayValue.length()!=0)) {
                if((dot)&&(!displayValue.contains("."))){
                    displayValue = displayValue + ".";
                }
                displayValue = displayValue + Integer.toString(d);
                display();
            }
        }
    }

    public void addDot(){
        if(!dot){
            dot = true;
        }
    }

    public void clear(){
        displayValue = "";
        error = false;
        dot=false;
        display();
    }

    public void clearLastDigit(){
        if (displayValue.length()>0) {
            displayValue = displayValue.substring(0, displayValue.length() - 1);
            display();
        }
    }

    public void display(){
        if (display != null){
            if (error){

            }else {
                if (displayValue.equals("")) {
                    display.setText("0");
                } else {
                    display.setText(displayValue);
                }
            }
        }
    }

    public Double getValue(){
        try{
            return Double.parseDouble(displayValue);
        } catch(Exception e){
            setError();
            return 0.0;
        }
    }

    public void setResult(Double res){
        display.setText(Double.toString(res));
    }



    public void setError(){
        error=true;
        display();
    }

    public Boolean getError() {
        return error;
    }
}
