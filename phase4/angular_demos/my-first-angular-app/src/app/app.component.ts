import { Component } from '@angular/core';

class Test{
  id:number;
  name:string;
  constructor(id:number,name:string){
    this.id=id;
    this.name=name;
  }
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My First Angular Application';
  developer ='Vinay N I ';
   test=new Test(2000,'Sachin R Tendulkarrrrrr');
}
