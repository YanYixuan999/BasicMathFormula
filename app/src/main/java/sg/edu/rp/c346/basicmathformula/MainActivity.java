package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFormula;

    ArrayList<FormulaList> alFormulaList;

    ShapeAdapter saFormula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.ListViewFormula);

        alFormulaList = new ArrayList<FormulaList>();

        FormulaList formula1 = new FormulaList("Area of rectangle","Length x Length","Formula type is: Area");
        FormulaList formula2 = new FormulaList("Area of triangle","(Length of base x Length)/2","Formula type is: Area");
        FormulaList formula3 = new FormulaList("Volume of cube","Length x Length x Length","Formula type is: Volume");

        alFormulaList.add(formula1);
        alFormulaList.add(formula2);
        alFormulaList.add(formula3);

        saFormula = new ShapeAdapter(this,R.layout.formula_list,alFormulaList);

        lvFormula.setAdapter(saFormula);
    }
}
