var Student = /** @class */ (function () {
    function Student(id, name, sclass) {
        this.stdId = id;
        this.stdName = name;
        this.stdClass = sclass;
    }
    Student.prototype.display = function () {
        console.log(this.stdId + " , " + this.stdName + ", " + this.stdClass);
    };
    return Student;
}());
var std1 = new Student(101, "ABC", "10");
std1.display();
var std2 = new Student(102, "BCD", "10");
std2.display();
