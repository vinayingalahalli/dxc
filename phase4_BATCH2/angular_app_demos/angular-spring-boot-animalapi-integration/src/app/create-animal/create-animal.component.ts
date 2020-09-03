import { Component, OnInit } from '@angular/core';
import { Animal } from '../animal';
import { AnimalService } from '../animal.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-animal',
  templateUrl: './create-animal.component.html',
  styleUrls: ['./create-animal.component.css']
})
export class CreateAnimalComponent implements OnInit {

  private animal:Animal;
  constructor(private animalService:AnimalService,private router:Router) { 
    this.animal=new Animal();
  }

  public createAnimal():void{
    this.animalService.createAnimal(this.animal).subscribe(res=>{
      this.animal=new Animal();
      this.router.navigate(['/animalsList'])
    });
  }

  ngOnInit() {

  }

}
