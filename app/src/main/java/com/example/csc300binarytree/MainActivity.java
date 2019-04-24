package com.example.csc300binarytree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    BinaryTree2 bt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.mainNum);
        bt = new BinaryTree2(5);
        tv.setText("5");
        bt.add(3);
        bt.add(2);
        bt.add(7);
        bt.add(1);
        bt.add(8);
        bt.add(9);
        bt.visitInOrder();
    }
    public void onClickLeft(View v)
    {
        tv.setText(Integer.toString(bt.getLeft()));
        Button right = findViewById(R.id.button3);
        right.setVisibility(View.INVISIBLE);

    }
    public void onClickRight(View v)
    {
        tv.setText(Integer.toString(bt.getRight()));
        Button left = findViewById(R.id.button2);
        left.setVisibility(View.INVISIBLE);
    }

    private void lookForNums() {
    }
}
