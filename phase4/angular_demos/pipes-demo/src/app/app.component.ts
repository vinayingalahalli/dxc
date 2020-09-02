import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Pipes Demo';
  mydate=new Date();
  jsonobj={id:100,name:'ganesh Murthy',age:33,team:{
    teamId:9999,teamName:'INDIA'
  }, city:"Bangalore"}
  fruits=['Apple','Banana','Grapes','Pomogranete','Mango','Watermelon','Kiwi'];
  firstName="Vinay";
  lastName="Ingalahalli";
}
