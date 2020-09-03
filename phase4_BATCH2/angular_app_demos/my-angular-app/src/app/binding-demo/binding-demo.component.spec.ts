import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BindingDemoComponent } from './binding-demo.component';
import { FormsModule } from '@angular/forms';

describe('BindingDemoComponent', () => {
  let component: BindingDemoComponent;
  let fixture: ComponentFixture<BindingDemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BindingDemoComponent ],
      imports:[FormsModule],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BindingDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
