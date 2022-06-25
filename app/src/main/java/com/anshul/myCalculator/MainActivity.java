package com.anshul.myCalculator;

import android.icu.number.ScientificNotation;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.anshul.myCalculator.databinding.ActivityMainBinding;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    boolean isPoint =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.outputTextView.setText("0");

        binding.one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"1";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"2";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"3";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"4";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"5";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"6";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"7";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"8";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"9";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"0";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.doubleZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!binding.outputTextView.getText().toString().isEmpty())
                {
                    binding.inputTextView.setText("");
                    binding.outputTextView.setText("");
                }
                String inputString=binding.inputTextView.getText().toString();
                inputString=inputString+"00";
                binding.inputTextView.setText(inputString);
            }

        });
        binding.point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=binding.inputTextView.getText().toString();
                if(inputString.isEmpty())
                {
                    inputString = inputString + "0";
                }

                char ch=inputString.charAt(inputString.length()-1);

                if(ch!='.' && !isPoint) {
                    inputString = inputString + ".";
                    isPoint=true;
                }
                binding.inputTextView.setText(inputString);
            }
        });
        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isPoint=false;
                binding.inputTextView.setText("");
                binding.outputTextView.setText("");
            }
        });
        binding.backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString = binding.inputTextView.getText().toString();
                char ch=inputString.charAt(inputString.length()-1);
                if((ch=='*'||ch=='/'||ch=='-'||ch=='+') && isPoint)
                {
                    isPoint=true;
                }
                if (!inputString.isEmpty()) {
                    inputString=inputString.substring(0,inputString.length()-1);
                    binding.inputTextView.setText(inputString);
                }
            }
        });
        binding.percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=binding.inputTextView.getText().toString();
                char ch=inputString.charAt(inputString.length()-1);
                if(ch!='*'&& ch!='-' && ch!='/'&& ch!='+' && inputString.length()>=1) {
                    inputString=inputString+"/100";
                    binding.inputTextView.setText(inputString);
                }
            }
        });
        binding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=binding.inputTextView.getText().toString();
                char ch=inputString.charAt(inputString.length()-1);
                if(ch=='*'|| ch=='-' || ch=='/'||ch=='+') {
                    inputString=inputString.substring(0,inputString.length()-1);
                }
                    inputString = inputString + "/";
                    isPoint = false;
                    binding.inputTextView.setText(inputString);
            }
        });
        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=binding.inputTextView.getText().toString();
                char ch=inputString.charAt(inputString.length()-1);
                if(ch=='*'|| ch=='-' || ch=='/'||ch=='+') {
                    inputString=inputString.substring(0,inputString.length()-1);
                }
                inputString=inputString+"*";
                isPoint = false;
                binding.inputTextView.setText(inputString);
            }
        });
        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=binding.inputTextView.getText().toString();
                char ch=inputString.charAt(inputString.length()-1);
                if(ch=='*'|| ch=='-' || ch=='/'||ch=='+') {
                    inputString=inputString.substring(0,inputString.length()-1);
                }
                inputString=inputString+"-";
                isPoint = false;
                binding.inputTextView.setText(inputString);
            }
        });
        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=binding.inputTextView.getText().toString();
                char ch=inputString.charAt(inputString.length()-1);
                if(ch=='*'|| ch=='-' || ch=='/'||ch=='+') {
                    inputString=inputString.substring(0,inputString.length()-1);
                }
                inputString=inputString+"+";
                isPoint = false;
                binding.inputTextView.setText(inputString);
            }
        });
        binding.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String inputString=binding.inputTextView.getText().toString();
                    Expression expression=new ExpressionBuilder(inputString).build();
                    double result=expression.evaluate();
                    long longResult= (long)result;
                    String checkD=Double.toString(result);
                    String checkL=Long.toString(longResult);
                    if(result==(double)longResult)
                    {
                        if(checkL.length()>9)
                        {
                            NumberFormat format=new DecimalFormat();
                            format=new DecimalFormat("0.########E0");
                            binding.outputTextView.setText("= "+format.format(longResult));
                        }
                        else
                        {
                            binding.outputTextView.setText("= "+Long.toString(longResult));
                        }
                    }
                    else
                    {
                        if(checkD.length()>10)
                        {
                            NumberFormat format=new DecimalFormat();
                            format=new DecimalFormat("0.########E0");
                            binding.outputTextView.setText("= "+format.format(result));
                        }
                        else
                        {
                            binding.outputTextView.setText("= "+Double.toString(result));
                        }
                    }
                    isPoint=false;
                }
                catch (Exception E)
                {
                    binding.outputTextView.setText("Error");
                }
            }
        });
    }
}