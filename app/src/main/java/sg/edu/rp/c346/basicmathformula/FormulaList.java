package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17042739 on 17/7/2018.
 */

public class FormulaList {
    private String shape;
    private String formula;
    private String type;

    public FormulaList(String shape, String formula, String type) {
        this.shape = shape;
        this.formula = formula;
        this.type = type;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
