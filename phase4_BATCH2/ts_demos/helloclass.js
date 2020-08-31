"use strict";
exports.__esModule = true;
exports.Hello = void 0;
var Hello = /** @class */ (function () {
    function Hello(name) {
        this.name = name;
    }
    Hello.prototype.sayHello = function () {
        console.log('Hello ' + this.name + ' from sayHello of Hello class');
    };
    Hello.helloStatic = function () {
        console.log('Hello static from Hello class');
    };
    return Hello;
}());
exports.Hello = Hello;
