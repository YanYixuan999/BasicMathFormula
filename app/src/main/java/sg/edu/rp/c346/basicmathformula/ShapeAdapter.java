package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17042739 on 17/7/2018.
 */

public class ShapeAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<FormulaList> formulaList;
    public ShapeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaList> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvshape = rowView.findViewById(R.id.textViewShape);
        TextView tvformula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);

        FormulaList currentFormula = formulaList.get(position);

        String shape = currentFormula.getShape();
        String formula = currentFormula.getFormula();
        String type = currentFormula.getType();

        tvshape.setText(shape);
        tvformula.setText(formula);
        tvType.setText(type);

        return rowView;
    }
}
