"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(s, rp, c, weight) {
        var _this = _super.call(this, s, rp, c) || this;
        _this.weight = weight;
        return _this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000) {
            var salePrice = this.regularPrice - this.regularPrice * 0.10;
            return salePrice;
        }
        else {
            var salePrice = this.regularPrice - this.regularPrice * 0.20;
            return salePrice;
        }
    };
    return Truck;
}(Car_1.Car));
var truck1 = new Truck(70, 10000, "Blue", 1000);
truck1.display();
console.log(truck1.getSalePrice());
var truck2 = new Truck(90, 15000, "Orange", 2000);
truck2.display();
console.log(truck2.getSalePrice());
