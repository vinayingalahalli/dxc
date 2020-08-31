"use strict";
exports.__esModule = true;
exports.x = void 0;
var helloclass_1 = require("./helloclass");
console.log('Hello welcome to TS');
exports.x = "VINAY";
//x=9;
console.log('Hellooooo ' + exports.x);
function sayHello(name) {
    console.log('Hello from function to ' + name);
}
sayHello('rajjjjj');
var h = new helloclass_1.Hello('Rayan');
h.sayHello();
helloclass_1.Hello.helloStatic();
