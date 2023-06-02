enum PizzaSize {
    SMALL,
    MEDIUM,
    LARGE
}
public class Pricing {


    // Methods
    public static int getPriceForPizzaSize(String pizzaType, PizzaSize pizzaSize) {
        int price = 0;
        switch (pizzaType) {

            case "Wegetariańska": {
                switch (pizzaSize) {
                    case SMALL: {
                        price = 25;
                        break;
                    }
                    case MEDIUM: {
                        price = 30;
                        break;
                    }
                    case LARGE: {
                        price = 35;
                        break;
                    }
                }
                break;
            }
            case "Capriciosa": {
                switch (pizzaSize) {
                    case SMALL: {
                        price = 28;
                        break;
                    }
                    case MEDIUM: {
                        price = 33;
                        break;
                    }
                    case LARGE: {
                        price = 38;
                        break;
                    }
                }
                break;
            }
            case "Pepperoni": {
                switch (pizzaSize) {
                    case SMALL: {
                        price = 30;
                        break;
                    }
                    case MEDIUM: {
                        price = 35;
                        break;
                    }
                    case LARGE: {
                        price = 40;
                        break;
                    }
                }
                break;
            }
        }
        return price;
    }
}
