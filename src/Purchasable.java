public interface Purchasable { // We use an interface because it only allows a class to have one parent. This way it can let different classes share purchasing behavior without changing who they are inheriting from.
    void purchase();
}
