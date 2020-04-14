"use strict";
exports.__esModule = true;
var Car = /** @class */ (function () {
    function Car(speed, price, color) {
        this.speed = speed;
        this.regularPrice = price;
        this.color = color;
    }
    Car.prototype.getSalePrice = function () {
        var salePrice = this.regularPrice - this.regularPrice * .10;
        return salePrice;
    };
    Car.prototype.display = function () {
        console.log("Speed: " + this.speed + ", Regular Price: " + this.regularPrice + ", Color: " + this.color);
        console.log("Sale Price: " + this.getSalePrice());
    };
    return Car;
}());
exports.Car = Car;
