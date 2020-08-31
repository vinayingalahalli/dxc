import { Person } from "./person";
import { Project } from "./project";

export class Employee extends Person{
    public helloAbstract(): string {
        return "Hello from abstract method in implementor employye class";
    }
    private designation:string;
    private salary:number;
    private project:Project;

    constructor(id:number,name:string,designation:string,salary:number,project:Project){
        super(id,name);
        this.designation=designation;
        this.salary=salary;
        this.project=project;
    }

    public printEmployee():void{
        console.log('Printing Employee');
        super.printPerson();
        console.log('Designation : '+this.designation);
        console.log('Salary : '+this.salary);
        this.project.printProjectDetails();
    }
}