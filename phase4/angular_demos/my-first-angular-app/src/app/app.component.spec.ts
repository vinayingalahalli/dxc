import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { BindingdemoComponent } from './bindingdemo/bindingdemo.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent,
        BindingdemoComponent
      ],
      imports:[
        FormsModule
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'My First Angular Application'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('My First Angular Application');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('My First Angular Application is running! herrrrrrrrreeeeee which is developed by Vinay N I');
  });
});
