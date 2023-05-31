enum hotLevel {
    Mild,
    Medium,
    Hot
}
public class Pizza {

    // Fields
    private String _pizzaName;
    private String[] _ingredients;
    private hotLevel hotLevel;
    //private _price


    // Constructor
    public Pizza(String pizzaName) {
        _pizzaName = pizzaName;
    }


    // Methods
    public void set_pizzaName(String _pizzaName) {
        this._pizzaName = _pizzaName;
    }
    public String get_pizzaName() {
        return _pizzaName;
    }
    public void setHotLevel(hotLevel level) {
        this.hotLevel = level;
    }
    public hotLevel getHotLevel() {
        return hotLevel;
    }
}
