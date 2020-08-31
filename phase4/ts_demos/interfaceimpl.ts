import { MyInterface1, MyInterface2 } from "./interfacesdemo";

class Implementor implements MyInterface1,MyInterface2{
    hello1(): void {
        throw new Error("Method not implemented.");
    }
    hello2(): void {
        throw new Error("Method not implemented.");
    }
    hello3(): void {
        throw new Error("Method not implemented.");
    }
    hello4(): void {
        throw new Error("Method not implemented.");
    }
    
}