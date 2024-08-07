package com.example.numberconvertor;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnClear, btnConvert;
    private TextView txtBinary, txtOctal, txtHexa, hexDecLabel, octalLabel, binaryLabel;
    private EditText inputNum;
    private View interfaceLayout;
    private Switch switchMode;
    private int numvalue;
    private String binary, octal, hexadecimal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnConvert = (Button) findViewById(R.id.convertButton);
        btnClear = (Button) findViewById(R.id.btnclear);
        btnDel = (Button) findViewById(R.id.btndel);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        txtBinary = (TextView) findViewById(R.id.binaryTextView);
        txtOctal = (TextView) findViewById(R.id.octalTextView);
        txtHexa = (TextView) findViewById(R.id.hexaTextView);
        hexDecLabel = (TextView) findViewById(R.id.hexadecimal);
        octalLabel = (TextView) findViewById(R.id.octal);
        binaryLabel = (TextView) findViewById(R.id.binary);

        interfaceLayout = (View) findViewById(R.id.mainlayoutId);

        switchMode = (Switch) findViewById(R.id.themesetId);

        inputNum = (EditText) findViewById(R.id.numberInput);

        btnConvert.setBackgroundColor(Color.rgb(30, 172, 255));
        btnDel.setBackgroundColor(Color.rgb(181, 71, 71));
        btnClear.setBackgroundColor(Color.rgb(181, 71, 71));
        btn9.setBackgroundColor(Color.rgb(9, 16, 159));
        btn8.setBackgroundColor(Color.rgb(9, 16, 159));
        btn7.setBackgroundColor(Color.rgb(9, 16, 159));
        btn6.setBackgroundColor(Color.rgb(9, 16, 159));
        btn5.setBackgroundColor(Color.rgb(9, 16, 159));
        btn4.setBackgroundColor(Color.rgb(9, 16, 159));
        btn3.setBackgroundColor(Color.rgb(9, 16, 159));
        btn2.setBackgroundColor(Color.rgb(9, 16, 159));
        btn1.setBackgroundColor(Color.rgb(9, 16, 159));
        btn0.setBackgroundColor(Color.rgb(9, 16, 159));

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 0;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 1;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 2;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        //
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 3;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Button 4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 4;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Button 5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 5;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Button 6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 6;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Button 7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 7;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Button 8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 8;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Button 9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue * 10) + 9;
                inputNum.setText(Integer.toString(numvalue));
            }
        });

        // Delete button
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = (numvalue / 10);
                if (numvalue > 0) {
                    inputNum.setText(Integer.toString(numvalue));
                } else {
                    inputNum.setText("");
                }
                txtBinary.setText("");
                txtOctal.setText("");
                txtHexa.setText("");
            }
        });

        // Button Clear
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numvalue = 0;
                inputNum.setText("");
                txtBinary.setText("");
                txtOctal.setText("");
                txtHexa.setText("");
            }
        });

        // Convert button
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayval();
            }
        });

        //    Switch configuration for theme mode change
        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    interfaceLayout.setBackgroundResource(R.drawable.dark_bg);
                    switchMode.setText("Dark");
                } else {
                    interfaceLayout.setBackgroundResource(R.drawable.bg);
                    switchMode.setText("Light");
                }
            }
        });
    }

    public void convertfunc()
    {
        if (inputNum.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Empty Input", Toast.LENGTH_SHORT).show();
        } else if(inputNum.length() > 10) {
            Toast.makeText(MainActivity.this, "Maximum input length is 10", Toast.LENGTH_SHORT).show();
        } else {
            binary = Integer.toBinaryString(numvalue);
            octal = Integer.toOctalString(numvalue);
            hexadecimal = Integer.toHexString(numvalue);
        }

    }

    private void displayval() {
        convertfunc();
        txtBinary.setText(binary);
        txtBinary.setVisibility(View.VISIBLE);
        txtOctal.setText(octal);
        txtOctal.setVisibility(View.VISIBLE);
        txtHexa.setText(hexadecimal);
        txtHexa.setVisibility(View.VISIBLE);
    }

}