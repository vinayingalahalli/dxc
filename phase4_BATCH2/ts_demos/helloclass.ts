export class Hello {

    private name: string;

    constructor(name: string) {
        this.name = name;
    }

    public sayHello(): void {
        console.log('Hello ' + this.name + ' from sayHello of Hello class')
    }

    public static helloStatic():void{
        console.log('Hello static from Hello class')
    }
}