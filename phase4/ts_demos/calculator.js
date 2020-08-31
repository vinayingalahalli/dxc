"use strict";
exports.__esModule = true;
exports.Calculator = void 0;
var Calculator = /** @class */ (function () {
    function Calculator(a, b) {
        this.a = a;
        this.b = b;
    }
    Calculator.prototype.add = function () {
        return (this.a + this.b);
    };
    // public add(a:number,b:number):number{
    //          return(a+b);
    //      }
    //  public add(a:string,b:string):string{
    //     return(a+b);
    // }
    Calculator.prototype.sumofElements = function () {
        var values = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            values[_i] = arguments[_i];
        }
        var sum = 0;
        values.forEach(function (e) {
            sum = sum + e;
        });
        return sum;
    };
    return Calculator;
}());
exports.Calculator = Calculator;
