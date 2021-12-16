package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return getDiscountedPrice(price, 20) * pieces;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces < 3) {
                return getDiscountedPrice(price, 25) * pieces;
            }
            return getDiscountedPrice(price, 50) + (getDiscountedPrice(price, 25) * (pieces - 1));
        }
    };

    public abstract double getAmountToPay(int price, int pieces);

    public double getDiscountedPrice (int price, int percent) {
        return price * (1 - percent / 100D);
    }
}