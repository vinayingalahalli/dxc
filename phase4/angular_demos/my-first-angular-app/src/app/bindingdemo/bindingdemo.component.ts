import { Component, OnInit } from '@angular/core';

class Player{
  id:number;
  name:string;
  avatar:string;
}

@Component({
  selector: 'app-bindingdemo',
  templateUrl: './bindingdemo.component.html',
  styleUrls: ['./bindingdemo.component.css']
})
export class BindingdemoComponent implements OnInit {

  message:string;
  url:string;
  player:Player;
  constructor() 
  {
    this.player=new Player();
    // this.player.id=0;
    // this.player.name='';
    // this.player.avatar='';
   }

  ngOnInit() {

  }
  sayHello():void{
    this.message="Hello from event binding, Hey I am JERRYYYYYYY and its me below which is done using property binding";
    this.url="https://media.giphy.com/media/OkzCz4O5Wa47REHfkR/giphy.gif";
  }

}

