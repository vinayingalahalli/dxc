import { Player } from "./player";
import { Team } from "./team";

let team=new Team(99999,'INDIA');
let player=new Player(100,'Sachin R Tendulkar',200,team);
player.printPlayer();
player.childImplementation();