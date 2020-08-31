interface MyInterface1{
     hello1():string;
     hello2():string;
     hello3():string;
}

interface MyInterface2{
    hello4():string;
    hello5():string;
    hello6():string;
}

export class Implementor implements MyInterface1,MyInterface2{
    hello1(): string {
        throw new Error("Method not implemented.");
    }
    hello2(): string {
        throw new Error("Method not implemented.");
    }
    hello3(): string {
        throw new Error("Method not implemented.");
    }
    hello4(): string {
        throw new Error("Method not implemented.");
    }
    hello5(): string {
        throw new Error("Method not implemented.");
    }
    hello6(): string {
        throw new Error("Method not implemented.");
    }
    
}