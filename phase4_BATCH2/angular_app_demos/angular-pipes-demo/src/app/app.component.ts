import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular-Pipes-Demo';
  dateObj=new Date();
  fruits=['Apple','Banana','Fig','Kiwi','Watermelon','Mango','Grapes'];
  customerObj={id:100,name:'Jawagal Srinath',address:{
    aid:9999,
    streetName:'Some Street',
    city:'Bangalore',
    country:'India',
    zip:560000
  }, age:50}

  salutation:string="Dr";
  firstName:string="Vinay";
  lastName:string="Ingalahalli"
}
