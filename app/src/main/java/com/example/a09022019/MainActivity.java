package com.example.a09022019;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    NumberConroller nc;
    CalcController cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc = new NumberConroller();
        nc.setDisplay((EditText)findViewById(R.id.mainEditText));
        cc = new CalcController();
        cc.setNc(nc);
    }

    public void onDigiClick(View button){
        Button b = (Button) button;
        nc.addDigit(Integer.parseInt(b.getText().toString()));
    }

    public void onCClick(View button){
        nc.clear();
    }

    public void onPlusClick(View b){
        cc.slojit();
    }
    public void onMinusClick(View b){
        cc.vichest();
    }
    public void onUmnogitClick(View b){
        cc.umnojit();
    }
    public void onDelitClick(View b){
        cc.delit();
    }

    public void onCalcClick(View b){
        cc.vychislit();
    }

    public void onProcClick(View b){
        cc.procent();
    }

    public void onDotClick(View b){
        nc.addDot();
    }

    public void onStepClick(View b){
        cc.stepen();
    }

    public void onInfoClick(View b){
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }
}
