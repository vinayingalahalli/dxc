import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SqrtPipe } from './sqrt.pipe';
import { FullNamePipe } from './full-name.pipe';

@NgModule({
  declarations: [
    AppComponent,
    SqrtPipe,
    FullNamePipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
