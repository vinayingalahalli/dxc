"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Player = void 0;
var person_1 = require("./person");
var Player = /** @class */ (function (_super) {
    __extends(Player, _super);
    function Player(id, name, score, team) {
        var _this = _super.call(this, id, name) || this;
        _this.score = score;
        _this.team = team;
        return _this;
    }
    Player.prototype.childImplementation = function () {
        console.log('Implemented in Player');
    };
    Player.prototype.printPlayer = function () {
        console.log('Printing Player');
        _super.prototype.printPerson.call(this);
        console.log('score = ' + this.score);
        this.team.printTeam();
    };
    return Player;
}(person_1.Person));
exports.Player = Player;
