export class Hello{
    private name:string;

    constructor(name:string){
        this.name=name;
    }

    public sayHello():void{
        console.log('Hello   '+this.name);
    }
}