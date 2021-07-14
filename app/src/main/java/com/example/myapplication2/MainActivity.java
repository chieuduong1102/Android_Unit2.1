package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txtDisplayResult;
    Button btnAC, btnLunisolar, btnPercent, btnDivision, btn7, btn8, btn9, btnMulti, btn4, btn5, btn6, btnMinius, btn1, btn2, btn3, btnPlus, btn0, btnDot, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDisplayResult = findViewById(R.id.am_txtDisplayResult);
        btnAC = findViewById(R.id.am_delete);
        btnLunisolar = findViewById(R.id.am_lunisolar);
        btnPercent = findViewById(R.id.am_percent);
        btn7 = findViewById(R.id.am_seven);
        btn8 = findViewById(R.id.am_eight);
        btn9 = findViewById(R.id.am_nine);
        btnMulti = findViewById(R.id.am_multiply);
        btn4 = findViewById(R.id.am_four);
        btn5 = findViewById(R.id.am_five);
        btn6 = findViewById(R.id.am_six);
        btnMinius = findViewById(R.id.am_minus);
        btn1 = findViewById(R.id.am_one);
        btn2 = findViewById(R.id.am_two);
        btn3 = findViewById(R.id.am_three);
        btnPlus = findViewById(R.id.am_plus);
        btn0 = findViewById(R.id.am_zero);
        btnDot = findViewById(R.id.am_dot);
        btnEqual = findViewById(R.id.am_equal);

        List<Button> listBtn = new ArrayList<Button>();
        listBtn.add(btn0);
        listBtn.add(btn1);
        listBtn.add(btn2);
        listBtn.add(btn3);
        listBtn.add(btn4);
        listBtn.add(btn5);
        listBtn.add(btn6);
        listBtn.add(btn7);
        listBtn.add(btn8);
        listBtn.add(btn9);
        listBtn.add(btnLunisolar);
        listBtn.add(btnPercent);
        listBtn.add(btnDivision);
        listBtn.add(btnMulti);
        listBtn.add(btnMinius);
        listBtn.add(btnPlus);
        listBtn.add(btnDot);

//        for (int i = 0; i < listBtn.size(); i++) {
//            int finalI = i;
//            listBtn.get(i).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String rs = "";
//                    rs += btnValueClick(listBtn.get(finalI));
//                    txtDisplayResult.setText(rs);
//                }
//            });
//        }

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayResult.setText(btn7.getText().toString());
            }
        });

    }

    static int btnValueClick(Button btn){
        int i = Integer.parseInt(btn.getText().toString()) ;
        return  i;
    }
    static String btnFunctionClick(Button btnFunc, int[] args){
        int root = args[0];
        String rs = "";
        switch (btnFunc.getText().toString()){
            case "/":
                for (int i = 1; i < args.length; i++) {
                    root /= args[i+1];
                }
                rs = String.valueOf(root);
                break;
            case "*":
                for (int i = 1; i < args.length; i++) {
                    root *= args[i+1];
                }
                rs = String.valueOf(root);
            break;
            case "-":
                for (int i = 1; i < args.length; i++) {
                    root -= args[i+1];
                }
                rs = String.valueOf(root);
            break;
            case "+":
                for (int i = 1; i < args.length; i++) {
                    root += args[i+1];
                }
                rs = String.valueOf(root);
            break;
            default:
                rs = "0";
        }
        return rs;
    }
}