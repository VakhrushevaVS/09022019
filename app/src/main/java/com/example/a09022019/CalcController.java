package com.example.a09022019;

import android.widget.EditText;

public class CalcController {
    Double A;
    Double B;
    Operaciia oper;
    NumberConroller nc;


    public void setNc(NumberConroller nc) {
        this.nc = nc;
    }


    public void slojit(){
        if(oper != null) {
            vychislit();
        }
        if(!nc.getError()){
            A=nc.getValue();
            oper = Operaciia.SLOJENIE;
            nc.clear();
        }
    }

    public void vichest(){
        if(oper != null) {
            vychislit();
        }
        if(!nc.getError()){
            A=nc.getValue();
            oper = Operaciia.VICHITANIE;
            nc.clear();
        }
    }

    public void umnojit(){
        if(oper != null) {
            vychislit();
        }
        if(!nc.getError()){
            A=nc.getValue();
            oper = Operaciia.UMNOJENIE;
            nc.clear();
        }
    }

    public void delit(){
        if(oper != null) {
            vychislit();
        }
        if(!nc.getError()){
            A=nc.getValue();
            oper = Operaciia.DELENIE;
            nc.clear();
        }
    }

    public void procent(){
        if(oper != null) {
            vychislit();
        }
        if(!nc.getError()){
            A=nc.getValue();
            oper = Operaciia.PROCENT;
            nc.clear();
        }
    }

    public void stepen(){
        if(oper != null) {
            vychislit();
        }
        if(!nc.getError()){
            A=nc.getValue();
            oper = Operaciia.STEPEN;
            nc.clear();
        }
    }

    public void vychislit(){
        B = nc.getValue();
        nc.clear();
        if(oper ==Operaciia.SLOJENIE){
             oper = null;
             Double R = A+B;
             nc.setResult(R);
        }
        if(oper ==Operaciia.VICHITANIE){
            oper = null;
            Double R = A-B;
            nc.setResult(R);
        }
        if(oper ==Operaciia.UMNOJENIE){
            oper = null;
            Double R = A*B;
            nc.setResult(R);
        }
        if(oper ==Operaciia.DELENIE){
            oper = null;
            try{
                Double R = A/B;
                nc.setResult(R);
            } catch(Exception e){
                nc.setError();
            }
        }
        if(oper ==Operaciia.PROCENT){
            oper = null;
            try{
                Double R = A/B*100;
                nc.setResult(R);
            } catch(Exception e){
                nc.setError();
            }
        }
        if(oper ==Operaciia.STEPEN){
            oper = null;
            Double R = Math.pow(A, B);
            nc.setResult(R);
        }
    }
}

