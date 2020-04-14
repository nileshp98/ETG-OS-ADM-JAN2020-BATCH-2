var T_shirt = /** @class */ (function () {
    function T_shirt(color, material, design) {
        this.color = color;
        this.material = material;
        this.design = design;
    }
    T_shirt.prototype.x_large = function (material) {
        this.material = material;
        return this.material;
    };
    T_shirt.prototype.display = function () {
        console.log("Color: " + this.color + ", material" + this.material + ",design: " + this.design);
    };
    return T_shirt;
}());
var small = new T_shirt("Red", "1 meter", 'Round Neck');
small.display();
var large = new T_shirt("Green", "1 meter", 'Round Neck');
large.display();
var xt_large = new T_shirt("Yellow", "1_meter", "Polo");
xt_large.material = "2 meters";
xt_large.display();
