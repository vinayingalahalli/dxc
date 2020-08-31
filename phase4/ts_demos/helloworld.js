"use strict";
exports.__esModule = true;
exports.x = void 0;
var hello_1 = require("./hello");
exports.x = 'Vinay';
//x=121;
console.log('Hello World from TS ' + exports.x);
function sayhello(name) {
    console.log('hello from functionnnn ' + name);
}
sayhello('RAJJJ');
sayhello('SIMRANNNNN');
var h = new hello_1.Hello('Dineshh');
h.sayHello();
