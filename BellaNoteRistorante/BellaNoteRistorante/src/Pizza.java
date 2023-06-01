enum HotLevel {
    MILD,
    MEDIUM,
    HOT
}

public class Pizza {

    // Fields
    private String _pizzaType;
    private String _ingredients;
    private HotLevel _hotLevel;


    // Constructor
    public Pizza(String pizzaType, HotLevel hotLevel, String ingredients) {
        this._pizzaType = pizzaType;
        this._hotLevel = hotLevel;
        this._ingredients = "(" + ingredients + ")";
    }


    // Methods
    public void set_pizzaType(String pizzaType) {
        this._pizzaType = pizzaType;
    }
    public String get_pizzaType() {
        return _pizzaType;
    }
    public void setHotLevel(HotLevel level) {
        _hotLevel = level;
    }
    public HotLevel getHotLevel() {
        return _hotLevel;
    }
    public void set_ingredients(String ingredients) {
        this._ingredients = "( " + ingredients + " )";
    }
    public String get_ingredients() {
        return _ingredients;
    }
}
