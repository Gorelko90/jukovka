package Product;

import java.util.Objects;

public class Product {

    private int idProduct;
    private String articleOfProduct;
    private double priceProduct;

    public Product(int idProduct, String articleOfProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.articleOfProduct = articleOfProduct;
        this.priceProduct = priceProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdProduct() {

        return idProduct;
    }

    public void setArticleOfProduct(String articleOfProduct) {
        this.articleOfProduct = articleOfProduct;
    }


    public String getArticle() {

        return articleOfProduct;
    }

    public void setPriceProduct(double priceProduct) {

        this.priceProduct = priceProduct;
    }

    public double getPrice() {

        return priceProduct;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getIdProduct() == product.getIdProduct() && Double.compare(product.priceProduct, priceProduct) == 0 && Objects.equals(articleOfProduct, product.articleOfProduct);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getIdProduct(), articleOfProduct, priceProduct);
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", article='" + articleOfProduct + '\'' + ", price=" + priceProduct + '}';
    }
}