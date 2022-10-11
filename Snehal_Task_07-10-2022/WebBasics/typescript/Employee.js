var Employee = /** @class */ (function () {
    function Employee(city, eid, ename, sal) {
        this.city = city;
        this.eid = eid;
        this.ename = ename;
        this.salary = sal;
        this.city = city;
        console.log("Emp obj created...");
    }
    Employee.prototype.getEmp = function () {
        console.log("Welcome to employee class");
    };
    Employee.prototype.m1 = function () {
        console.log("m1() is called");
    };
    return Employee;
}());
var e1 = new Employee("Pune", 101, "snehal", 5000000);
e1.getEmp();
console.log(this.city);
console.log(e1);
e1.m1();
