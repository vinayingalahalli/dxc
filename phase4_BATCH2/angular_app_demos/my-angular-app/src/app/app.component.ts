import { Component } from '@angular/core';

class MyClass{
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
  title = 'my title';
  name ='Dr Vinay N I'
  myclass=new MyClass(999,'Virat Kohliiiiiiiii');
}
