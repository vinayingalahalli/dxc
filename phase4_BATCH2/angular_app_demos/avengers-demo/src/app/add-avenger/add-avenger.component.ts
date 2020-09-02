import { Component, OnInit } from '@angular/core';
import { Avenger } from '../avenger';

@Component({
  selector: 'app-add-avenger',
  templateUrl: './add-avenger.component.html',
  styleUrls: ['./add-avenger.component.css']
})
export class AddAvengerComponent implements OnInit {

  avengersList: Avenger[] = [];
  avenger: Avenger;
  avengerTable: boolean = false;
  avengerIdModel: number;

  constructor() {
    this.avenger = new Avenger();
  }

  ngOnInit() {
  }

  public addAvenger(): void {
    this.avengerTable = true;
    this.avengersList.push(this.avenger);
    this.avenger = new Avenger();
  }

  public removeLastAvenger(): void {
    this.avengersList.pop();

    if (this.avengersList.length === 0) {
      this.avengerTable = false;
    }
  }
  public removeAvengerById(): void {

    //code here to remove avenger by id
    //remember to use avengerIdModel to remove the avenger by id

    if (this.avengersList.length === 0) {
      this.avengerTable = false;
    }
  }
}