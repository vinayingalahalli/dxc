import { Component, OnInit } from '@angular/core';
import { Player } from '../player';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent implements OnInit {

  playerList:Player[]=[];
  playerModel:Player;
  playerTable:boolean=false;
  idModel:number;
  constructor() { 
    this.playerModel=new Player();
  }

  ngOnInit() {
  }

  public addPlayer():void{
    this.playerTable=true;
    this.playerList.push(this.playerModel);
    this.playerModel=new Player();
  }
public removeLastPlayer():void{
  this.playerList.pop();
  if(this.playerList.length===0){
    this.playerTable=false;
  }
}
  
public removePlayerById():void{

  //here goes your logic to delete the player by id remember id is captured in idModel object

  if(this.playerList.length===0){
    this.playerTable=false;
  }
}

}
