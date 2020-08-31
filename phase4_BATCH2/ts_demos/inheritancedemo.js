"use strict";
exports.__esModule = true;
var employee_1 = require("./employee");
var project_1 = require("./project");
var project = new project_1.Project(999999, 'Customer App', 'Simplilearn');
var employee = new employee_1.Employee(100, 'Rajat', 'Manager', 120000.22, project);
employee.printEmployee();
console.log(employee.helloAbstract());
