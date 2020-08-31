"use strict";
exports.__esModule = true;
var player_1 = require("./player");
var team_1 = require("./team");
var team = new team_1.Team(99999, 'INDIA');
var player = new player_1.Player(100, 'Sachin R Tendulkar', 200, team);
player.printPlayer();
player.childImplementation();
