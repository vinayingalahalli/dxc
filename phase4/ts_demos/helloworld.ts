import { Hello } from "./hello";

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