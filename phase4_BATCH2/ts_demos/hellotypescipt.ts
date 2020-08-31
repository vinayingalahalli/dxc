import { Hello } from "./helloclass";

console.log('Hello welcome to TS');

export let x:string="VINAY";
//x=9;
console.log('Hellooooo '+x);

function sayHello(name:string){
    console.log('Hello from function to '+name);
}

sayHello('rajjjjj');

let h=new Hello('Rayan');
h.sayHello();

Hello.helloStatic();