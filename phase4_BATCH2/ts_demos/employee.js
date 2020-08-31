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
exports.Employee = void 0;
var person_1 = require("./person");
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(id, name, designation, salary, project) {
        var _this = _super.call(this, id, name) || this;
        _this.designation = designation;
        _this.salary = salary;
        _this.project = project;
        return _this;
    }
    Employee.prototype.helloAbstract = function () {
        return "Hello from abstract method in implementor employye class";
    };
    Employee.prototype.printEmployee = function () {
        console.log('Printing Employee');
        _super.prototype.printPerson.call(this);
        console.log('Designation : ' + this.designation);
        console.log('Salary : ' + this.salary);
        this.project.printProjectDetails();
    };
    return Employee;
}(person_1.Person));
exports.Employee = Employee;
