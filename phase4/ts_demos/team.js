"use strict";
exports.__esModule = true;
exports.Team = void 0;
var Team = /** @class */ (function () {
    function Team(teamId, teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }
    Team.prototype.printTeam = function () {
        console.log('team details');
        console.log('team id : ' + this.teamId);
        console.log('team name : ' + this.teamName);
    };
    return Team;
}());
exports.Team = Team;
