import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';



@Component({
  selector: 'app-binding-demo',
  templateUrl: './binding-demo.component.html',
  styleUrls: ['./binding-demo.component.css']
})
export class BindingDemoComponent implements OnInit {

  message:string;
  url:string;
  customer:Customer;
  constructor() {
    this.customer=new Customer();
   }

  ngOnInit() {
  }

  public sayHelloEvent():void{
    this.message="Hello from EVENT Binding.............. Hey Hi THIS iS Jerry";
    this.message=this.message+" You can see my gif below which is done using property binding";
    this.url="https://media.tenor.com/images/cdb327ec053535ce6c41b1c0f8bc4a7d/tenor.gif";

  }

}
