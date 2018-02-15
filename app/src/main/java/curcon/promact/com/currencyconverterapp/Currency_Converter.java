package curcon.promact.com.currencyconverterapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Currency_Converter extends AppCompatActivity {

    EditText input;
    EditText result1;
    EditText result2;
    EditText result3;
    EditText result4;
    EditText result5;
    EditText result6;
    EditText result7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency__converter);
         input=(EditText)findViewById(R.id.amount);
         result1=(EditText)findViewById(R.id.result1);
        result2=(EditText)findViewById(R.id.result2);
        result3=(EditText)findViewById(R.id.result3);
        result4=(EditText)findViewById(R.id.result4);
        result5=(EditText)findViewById(R.id.result5);
        result6=(EditText)findViewById(R.id.result6);
        result7=(EditText)findViewById(R.id.result7);
        //Button btn=(Button)findViewById(R.id.btn);


            Button btn=(Button)findViewById(R.id.btn);
            btn.setOnClickListener(new View.OnClickListener() {


                    public void onClick (View v){
                        try
                        {

                            double amount = Double.parseDouble(input.getText().toString());
                            double indian = 0.256 * amount;
                            result1.setText(Double.toString(indian));
                            double usd = 0.0032 * amount;
                            result2.setText(Double.toString(usd));
                            double mr = 0.0156 * amount;
                            result3.setText(Double.toString(mr));
                            double bd = 0.0014 * amount;
                            result4.setText(Double.toString(bd));
                            double rr = 0.2288 * amount;
                            result5.setText(Double.toString(rr));
                            double jy = 0.4344 * amount;
                            result6.setText(Double.toString(jy));
                            double sf = 0.0037 * amount;
                            result7.setText(Double.toString(sf));
                        }

                        catch(Exception e)
                        {
                            Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                        }
                    }

            });



        Button btn1=(Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double indian = Double.parseDouble(result1.getText().toString());
                    double usd = 0.0155 * indian;
                    result2.setText(Double.toString(usd));
                    double mr = 0.0608 * indian;
                    result3.setText(Double.toString(mr));
                    double bd = 0.0058 * indian;
                    result4.setText(Double.toString(bd));
                    double rr = 0.8941 * indian;
                    result5.setText(Double.toString(rr));
                    double hf = 3.9019 * indian;
                    input.setText(Double.toString(hf));
                    double jy = 1.6932 * indian;
                    result6.setText(Double.toString(jy));
                    double sf = 0.0145 * indian;
                    result7.setText(Double.toString(sf));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double usd = Double.parseDouble(result2.getText().toString());
                    double indian = 64.2903 * usd;
                    result1.setText(Double.toString(indian));
                    double mr = 3.9126 * usd;
                    result3.setText(Double.toString(mr));
                    double bd = 0.376 * usd;
                    result4.setText(Double.toString(bd));
                    double rr = 57.45 * usd;
                    result5.setText(Double.toString(rr));
                    double hf = 250.871 * usd;
                    input.setText(Double.toString(hf));
                    double jy = 108.907 * usd;
                    result6.setText(Double.toString(jy));
                    double sf = 0.9339 * usd;
                    result7.setText(Double.toString(sf));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double mr = Double.parseDouble(result3.getText().toString());
                    double indian = 16.434 * mr;
                    result1.setText(Double.toString(indian));
                    double usd = 0.255 * mr;
                    result2.setText(Double.toString(usd));
                    double bd = 0.096 * mr;
                    result4.setText(Double.toString(bd));
                    double rr = 14.6633 * mr;
                    result5.setText(Double.toString(rr));
                    double hf = 64.123 * mr;
                    input.setText(Double.toString(hf));
                    double jy = 27.833 * mr;
                    result6.setText(Double.toString(jy));
                    double sf = 0.239 * mr;
                    result7.setText(Double.toString(sf));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double bd = Double.parseDouble(result4.getText().toString());
                    double indian = 170.895 * bd;
                    result1.setText(Double.toString(indian));
                    double mr = 10.4095 * bd;
                    result3.setText(Double.toString(mr));
                    double rr = 152.619 * bd;
                    result5.setText(Double.toString(rr));
                    double usd = 2.66 * bd;
                    result2.setText(Double.toString(usd));
                    double hf = 666.96 * bd;
                    input.setText(Double.toString(hf));
                    double jy = 289.6 * bd;
                    result6.setText(Double.toString(jy));
                    double sf = 2.484 * bd;
                    result7.setText(Double.toString(sf));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btn5=(Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double rr = Double.parseDouble(result5.getText().toString());
                    double indian = 1.12 * rr;
                    result1.setText(Double.toString(indian));
                    double mr = 0.068 * rr;
                    result3.setText(Double.toString(mr));
                    double bd = 0.0065 * rr;
                    result4.setText(Double.toString(bd));
                    double usd = 0.0174 * rr;
                    result2.setText(Double.toString(usd));
                    double hf = 4.37 * rr;
                    input.setText(Double.toString(hf));
                    double jy = 1.898 * rr;
                    result6.setText(Double.toString(jy));
                    double sf = 0.0163 * rr;
                    result7.setText(Double.toString(sf));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn6=(Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double jy = Double.parseDouble(result6.getText().toString());
                    double indian = 0.59 * jy;
                    result1.setText(Double.toString(indian));
                    double mr = 0.036 * jy;
                    result3.setText(Double.toString(mr));
                    double bd = 0.0034 * jy;
                    result4.setText(Double.toString(bd));
                    double rr = 0.52 * jy;
                    result5.setText(Double.toString(rr));
                    double hf = 2.285 * jy;
                    input.setText(Double.toString(hf));
                    double usd = 0.0091 * jy;
                    result2.setText(Double.toString(usd));
                    double sf = 0.0085 * jy;
                    result7.setText(Double.toString(sf));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn7=(Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double sf = Double.parseDouble(result7.getText().toString());
                    double indian = 68.71 * sf;
                    result1.setText(Double.toString(indian));
                    double mr = 4.188 * sf;
                    result3.setText(Double.toString(mr));
                    double bd = 0.4025 * sf;
                    result4.setText(Double.toString(bd));
                    double rr = 61.22 * sf;
                    result5.setText(Double.toString(rr));
                    double hf = 267.776 * sf;
                    input.setText(Double.toString(hf));
                    double jy = 116.616 * sf;
                    result6.setText(Double.toString(jy));
                    double usd = 1.071 * sf;
                    result2.setText(Double.toString(usd));
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.del) {
            input.setText("");
            result1.setText("");
            result2.setText("");
            result3.setText("");
            result4.setText("");
            result5.setText("");
            result6.setText("");
            result7.setText("");
        }
        return super.onOptionsItemSelected(item);
    }

}
