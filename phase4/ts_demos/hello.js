"use strict";
exports.__esModule = true;
exports.Hello = void 0;
var Hello = /** @class */ (function () {
    function Hello(name) {
        this.name = name;
    }
    Hello.prototype.sayHello = function () {
        console.log('Hello   ' + this.name);
    };
    Hello.helloStatic = function () {
        console.log("hello static");
    };
    return Hello;
}());
exports.Hello = Hello;
