import { Team } from "./team";

export abstract class Person{

    private id:number;
    private name:string;
    
    constructor(id:number,name:string){
        this.id=id;
        this.name=name;
       
    }
    public printPerson():void{
        console.log("Id = "+this.id);
        console.log("Name = "+this.name);
        
    }
    public abstract childImplementation():void;
}