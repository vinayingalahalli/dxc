import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateAnimalComponent } from './create-animal/create-animal.component';
import { UpdateAnimalComponent } from './update-animal/update-animal.component';
import { DeleteAnimalComponent } from './delete-animal/delete-animal.component';
import { SearchAnimalComponent } from './search-animal/search-animal.component';
import { AnimalsListComponent } from './animals-list/animals-list.component';


const routes: Routes = [
  {path:'createAnimal',component:CreateAnimalComponent},
  {path:'updateAnimal',component:UpdateAnimalComponent},
  {path:'deleteAnimal',component:DeleteAnimalComponent},
  {path:'searchAnimal',component:SearchAnimalComponent},
  {path:'animalsList',component:AnimalsListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
