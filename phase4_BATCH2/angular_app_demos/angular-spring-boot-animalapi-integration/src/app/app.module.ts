import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateAnimalComponent } from './create-animal/create-animal.component';
import { DeleteAnimalComponent } from './delete-animal/delete-animal.component';
import { UpdateAnimalComponent } from './update-animal/update-animal.component';
import { SearchAnimalComponent } from './search-animal/search-animal.component';
import { AnimalsListComponent } from './animals-list/animals-list.component';
import { AnimalService } from './animal.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    CreateAnimalComponent,
    DeleteAnimalComponent,
    UpdateAnimalComponent,
    SearchAnimalComponent,
    AnimalsListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AnimalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
