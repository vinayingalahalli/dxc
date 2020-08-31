import { Employee } from "./employee";
import { Project } from "./project";

let project=new Project(999999,'Customer App','Simplilearn');
let employee=new Employee(100,'Rajat','Manager',120000.22,project);
employee.printEmployee();
console.log(employee.helloAbstract());