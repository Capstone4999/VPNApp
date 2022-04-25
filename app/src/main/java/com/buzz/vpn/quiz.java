package com.buzz.vpn;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Text;

public class quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        ImageButton Q1A;
        ImageButton Q1B;
        ImageButton Q1C;
        ImageButton Q1D;
        ImageButton Q2A;
        ImageButton Q2B;
        ImageButton Q2C;
        ImageButton Q2D;
        ImageButton Q3A;
        ImageButton Q3B;
        ImageButton Q3C;
        ImageButton Q3D;
        ImageButton Q4A;
        ImageButton Q4B;
        ImageButton Q4C;
        ImageButton Q4D;
        ImageButton Q5A;
        ImageButton Q5B;
        ImageButton Q5C;
        ImageButton Q5D;
        ImageButton Q6A;
        ImageButton Q6B;
        ImageButton Q6C;
        ImageButton Q6D;
        ImageButton Q7A;
        ImageButton Q7B;
        ImageButton Q7C;
        ImageButton Q7D;
        ImageButton Q8A;
        ImageButton Q8B;
        ImageButton Q8C;
        ImageButton Q8D;
        ImageButton Q9A;
        ImageButton Q9B;
        ImageButton Q9C;
        ImageButton Q9D;
        ImageButton Q10A;
        ImageButton Q10B;
        ImageButton Q10C;
        ImageButton Q10D;
        ImageButton Q11A;
        ImageButton Q11B;
        ImageButton Q11C;
        ImageButton Q11D;
        ImageButton Q12A;
        ImageButton Q12B;
        ImageButton Q12C;
        ImageButton Q12D;
        ImageButton Q13A;
        ImageButton Q13B;
        ImageButton Q13C;
        ImageButton Q13D;
        ImageButton Q14A;
        ImageButton Q14B;
        ImageButton Q14C;
        ImageButton Q14D;
        ImageButton Q15A;
        ImageButton Q15B;
        ImageButton Q15C;
        ImageButton Q15D;
        ImageButton Q16A;
        ImageButton Q16B;
        ImageButton Q16C;
        ImageButton Q16D;
        ImageButton Q17A;
        ImageButton Q17B;
        ImageButton Q17C;
        ImageButton Q17D;
        ImageButton Q18A;
        ImageButton Q18B;
        ImageButton Q18C;
        ImageButton Q18D;
        ImageButton Q19A;
        ImageButton Q19B;
        ImageButton Q19C;
        ImageButton Q19D;
        ImageButton Q20A;
        ImageButton Q20B;
        ImageButton Q20C;
        ImageButton Q20D;
        Q1A = (ImageButton)findViewById(R.id.Q1A);
        Q1B = (ImageButton)findViewById(R.id.Q1B);
        Q1C = (ImageButton)findViewById(R.id.Q1C);
        Q1D = (ImageButton)findViewById(R.id.Q1D);
        Q2A = (ImageButton)findViewById(R.id.Q2A);
        Q2B = (ImageButton)findViewById(R.id.Q2B);
        Q2C = (ImageButton)findViewById(R.id.Q2C);
        Q2D = (ImageButton)findViewById(R.id.Q2D);
        Q3A = (ImageButton)findViewById(R.id.Q3A);
        Q3B = (ImageButton)findViewById(R.id.Q3B);
        Q3C = (ImageButton)findViewById(R.id.Q3C);
        Q3D = (ImageButton)findViewById(R.id.Q3D);
        Q4A = (ImageButton)findViewById(R.id.Q4A);
        Q4B = (ImageButton)findViewById(R.id.Q4B);
        Q4C = (ImageButton)findViewById(R.id.Q4C);
        Q4D = (ImageButton)findViewById(R.id.Q4D);
        Q5A = (ImageButton)findViewById(R.id.Q5A);
        Q5B = (ImageButton)findViewById(R.id.Q5B);
        Q5C = (ImageButton)findViewById(R.id.Q5C);
        Q5D = (ImageButton)findViewById(R.id.Q5D);
        Q6A = (ImageButton)findViewById(R.id.Q6A);
        Q6B = (ImageButton)findViewById(R.id.Q6B);
        Q6C = (ImageButton)findViewById(R.id.Q6C);
        Q6D = (ImageButton)findViewById(R.id.Q6D);
        Q7A = (ImageButton)findViewById(R.id.Q7A);
        Q7B = (ImageButton)findViewById(R.id.Q7B);
        Q7C = (ImageButton)findViewById(R.id.Q7C);
        Q7D = (ImageButton)findViewById(R.id.Q7D);
        Q8A = (ImageButton)findViewById(R.id.Q8A);
        Q8B = (ImageButton)findViewById(R.id.Q8B);
        Q8C = (ImageButton)findViewById(R.id.Q8C);
        Q8D = (ImageButton)findViewById(R.id.Q8D);
        Q9A = (ImageButton)findViewById(R.id.Q9A);
        Q9B = (ImageButton)findViewById(R.id.Q9B);
        Q9C = (ImageButton)findViewById(R.id.Q9C);
        Q9D = (ImageButton)findViewById(R.id.Q9D);
        Q10A = (ImageButton)findViewById(R.id.Q10A);
        Q10B = (ImageButton)findViewById(R.id.Q10B);
        Q10C = (ImageButton)findViewById(R.id.Q10C);
        Q10D = (ImageButton)findViewById(R.id.Q10D);
        Q11A = (ImageButton)findViewById(R.id.Q11A);
        Q11B = (ImageButton)findViewById(R.id.Q11B);
        Q11C = (ImageButton)findViewById(R.id.Q11C);
        Q11D = (ImageButton)findViewById(R.id.Q11D);
        Q12A = (ImageButton)findViewById(R.id.Q12A);
        Q12B = (ImageButton)findViewById(R.id.Q12B);
        Q12C = (ImageButton)findViewById(R.id.Q12C);
        Q12D = (ImageButton)findViewById(R.id.Q12D);
        Q13A = (ImageButton)findViewById(R.id.Q13A);
        Q13B = (ImageButton)findViewById(R.id.Q13B);
        Q13C = (ImageButton)findViewById(R.id.Q13C);
        Q13D = (ImageButton)findViewById(R.id.Q13D);
        Q14A = (ImageButton)findViewById(R.id.Q14A);
        Q14B = (ImageButton)findViewById(R.id.Q14B);
        Q14C = (ImageButton)findViewById(R.id.Q14C);
        Q14D = (ImageButton)findViewById(R.id.Q14D);
        Q15A = (ImageButton)findViewById(R.id.Q15A);
        Q15B = (ImageButton)findViewById(R.id.Q15B);
        Q15C = (ImageButton)findViewById(R.id.Q15C);
        Q15D = (ImageButton)findViewById(R.id.Q15D);
        Q16A = (ImageButton)findViewById(R.id.Q16A);
        Q16B = (ImageButton)findViewById(R.id.Q16B);
        Q16C = (ImageButton)findViewById(R.id.Q16C);
        Q16D = (ImageButton)findViewById(R.id.Q16D);
        Q17A = (ImageButton)findViewById(R.id.Q17A);
        Q17B = (ImageButton)findViewById(R.id.Q17B);
        Q17C = (ImageButton)findViewById(R.id.Q17C);
        Q17D = (ImageButton)findViewById(R.id.Q17D);
        Q18A = (ImageButton)findViewById(R.id.Q18A);
        Q18B = (ImageButton)findViewById(R.id.Q18B);
        Q18C = (ImageButton)findViewById(R.id.Q18C);
        Q18D = (ImageButton)findViewById(R.id.Q18D);
        Q19A = (ImageButton)findViewById(R.id.Q19A);
        Q19B = (ImageButton)findViewById(R.id.Q19B);
        Q19C = (ImageButton)findViewById(R.id.Q19C);
        Q19D = (ImageButton)findViewById(R.id.Q19D);
        Q20A = (ImageButton)findViewById(R.id.Q20A);
        Q20B = (ImageButton)findViewById(R.id.Q20B);
        Q20C = (ImageButton)findViewById(R.id.Q20C);
        Q20D = (ImageButton)findViewById(R.id.Q20D);

        Q1A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "World Area Network was incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q1B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Wireless Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q1C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Wired Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q1D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Wide Area Network was correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q2A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Long Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q2B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Land Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q2C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Local Area Network was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q2D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Loner Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q3A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Micro Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Metropolitan Area Network was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q3C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Manual Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q3D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Macro Area Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q4A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Valued Public Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Very Personal Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q4C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Virtual Private Network was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q4D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Valued Private Network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q5A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Wire Fidelity was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q5B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Wireless Fidelity was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q5C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Wide Fidelity was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q5D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "None of the above was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q6A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "1 was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q6B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "5 was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q6C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "100 was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q6D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Depends was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q7A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "It is disabled was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q7B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "It is restricted by the network was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q7C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "It might not be legal in that region was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q7D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "All of the above was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q8A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Yes was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q8B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "No was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q8C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Sometimes was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q8D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "None of these was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q9A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Media Access Control was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q9B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Multiple Area Connection was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q9C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Media Access Connector was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q9D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Manual Area Connection was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q10A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "National Interface Connector was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q10B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Network Interface Controller was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q10C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "New Interface Controller was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q10D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "New Interface Connector was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q11A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Internal Protocol was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q11B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Instant Protocol was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q11C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Internet Protocol was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q11D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Instantaneous Protocol was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q12A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Option 2 was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q12B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Option 10 was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q12C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "1 was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q12D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "19 was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q13A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Yes was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q13B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "No was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q13C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Not all of them was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q13D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "None of them was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q14A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "True was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q14B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "False was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q14C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Only sometimes was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q14D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "None of the above was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q15A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Ad Blocking was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q15B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Data encryption was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q15C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Disable Geo-restriction was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q15D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "All of the above was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q16A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Intranet VPN was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q16B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Internet VPN was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q16C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Remote Access VPN was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q16D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Extranet VPN was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q17A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Ad Blocking was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q17B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Authorization was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q17C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Encryption was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q17D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Confidentiality was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q18A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Authentication was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q18B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Data integrity was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q18C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Encryption was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q18D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Confidentiality was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q19A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Antivirus was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q19B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Firewall was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q19C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "VPN was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q19D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Incognito mode was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q20A.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Connectionless was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);
                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q20B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Data link layer was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        Q20C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Tunneling was Correct", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(0, 204, 102), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Q20D.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast= Toast.makeText(getApplicationContext(), "Network layer was Incorrect", Toast.LENGTH_SHORT);
                View v1 = toast.getView();
                TextView text = v1.findViewById(android.R.id.message);

                v1.getBackground().setColorFilter(Color.rgb(216, 111, 111), PorterDuff.Mode.SRC_IN);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        //initialize and assigning the variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);

        //set page selected
        bottomNavigationView.setSelectedItemId( R.id.quiz);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),
                                home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_learn:
                        startActivity(new Intent(getApplicationContext(),
                                learning.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_quiz:
                        return true;

                }
                return false;
            }
        });


    }
}