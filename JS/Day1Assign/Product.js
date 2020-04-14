var Product = /** @class */ (function () {
    function Product(id, name, price) {
        this.prdId = id;
        this.prdNamme = name;
        this.prdPrice = price;
    }
    Product.prototype.additionalGst = function () {
        var totalCost = this.prdPrice + this.prdPrice * 0.18;
        return totalCost;
    };
    Product.prototype.display = function () {
        console.log("Product Id: " + this.prdId + ", Product: " + this.prdNamme + ", Product Price with GST :" + this.additionalGst());
    };
    return Product;
}());
var prd1 = new Product(201, "LapTop", 25000);
prd1.display();
var prd2 = new Product(202, "iPhone", 50000);
prd2.display();
