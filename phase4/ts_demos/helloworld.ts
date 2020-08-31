import { Hello } from "./hello";
import { Calculator } from "./calculator";

export let x:string='Vinay';
//x=121;
console.log('Hello World from TS '+x);

function sayhello(name:string){
    console.log('hello from functionnnn '+name);
}
sayhello('RAJJJ');
sayhello('SIMRANNNNN');

let h=new Hello('Dineshh');
h.sayHello();

let c=new Calculator(10,20);
console.log(c.add());
console.log(c.sumofElements(111,222,33,44));
console.log(c.sumofElements(111,222,33,44,33,44));
Hello.helloStatic();