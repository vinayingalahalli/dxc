"use strict";
exports.__esModule = true;
exports.Person = void 0;
var Person = /** @class */ (function () {
    function Person(id, name) {
        this.id = id;
        this.name = name;
    }
    Person.prototype.printPerson = function () {
        console.log("Id = " + this.id);
        console.log("Name = " + this.name);
    };
    return Person;
}());
exports.Person = Person;
