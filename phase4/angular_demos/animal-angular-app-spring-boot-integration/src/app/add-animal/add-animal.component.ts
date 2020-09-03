import { Component, OnInit } from '@angular/core';
import { Animal } from '../animal';
import { AnimalService } from '../animal.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-animal',
  templateUrl: './add-animal.component.html',
  styleUrls: ['./add-animal.component.css']
})
export class AddAnimalComponent implements OnInit {
  private animal:Animal;
  constructor(private animalService:AnimalService,private router:Router) {
    this.animal=new Animal();
   }

   public addAnimal():void{
     this.animalService.addAnimal(this.animal).subscribe(res=>{
       this.animal=new Animal();
       this.router.navigate(['/animalsList']);
     }
      )
   }

  ngOnInit() {
  }

}
